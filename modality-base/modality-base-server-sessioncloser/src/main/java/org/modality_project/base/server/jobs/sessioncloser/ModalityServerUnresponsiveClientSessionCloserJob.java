package org.modality_project.base.server.jobs.sessioncloser;

import dev.webfx.platform.console.Console;
import dev.webfx.stack.push.server.PushServerService;
import dev.webfx.stack.push.server.UnresponsivePushClientListener;
import dev.webfx.stack.orm.datasourcemodel.service.DataSourceModelService;
import dev.webfx.platform.boot.spi.ApplicationJob;
import dev.webfx.stack.db.submit.SubmitArgument;
import dev.webfx.stack.db.submit.SubmitService;

/**
 * @author Bruno Salmon
 */
public final class ModalityServerUnresponsiveClientSessionCloserJob implements ApplicationJob {

    private UnresponsivePushClientListener disconnectListener;

    @Override
    public void onStart() {
        PushServerService.addUnresponsivePushClientListener(disconnectListener = pushClientId ->
                SubmitService.executeSubmit(SubmitArgument.builder()
                        .setLanguage("DQL")
                        .setStatement("update SessionConnection set end=now() where process=?")
                        .setParameters(pushClientId)
                        .setDataSourceId(DataSourceModelService.getDefaultDataSourceId())
                        .build())
                        .onFailure(cause -> Console.log("Error while closing session for pushClientId=" + pushClientId, cause))
                        .onSuccess(result -> Console.log("Closed session for pushClientId=" + pushClientId)));
    }

    @Override
    public void onStop() {
        PushServerService.removeUnresponsivePushClientListener(disconnectListener);
    }

}
