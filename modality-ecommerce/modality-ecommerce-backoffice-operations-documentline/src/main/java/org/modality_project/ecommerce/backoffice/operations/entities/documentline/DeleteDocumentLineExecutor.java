package org.modality_project.ecommerce.backoffice.operations.entities.documentline;

import dev.webfx.stack.ui.controls.dialog.DialogContent;
import dev.webfx.stack.ui.controls.dialog.DialogUtil;
import dev.webfx.stack.orm.entity.UpdateStore;
import dev.webfx.stack.async.Future;
import dev.webfx.stack.async.Promise;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import org.modality_project.base.shared.entities.DocumentLine;

final class DeleteDocumentLineExecutor {

    static Future<Void> executeRequest(DeleteDocumentLineRequest rq) {
        return execute(rq.getDocumentLine(), rq.getParentContainer());
    }

    private static Future<Void> execute(DocumentLine documentLine, Pane parentContainer) {
        Promise<Void> promise = Promise.promise();
        DialogContent dialogContent = new DialogContent().setContent(new Text("Are you sure you want to delete this option?"));
        DialogUtil.showModalNodeInGoldLayout(dialogContent, parentContainer).addCloseHook(promise::complete);
        DialogUtil.armDialogContentButtons(dialogContent, dialogCallback -> {
            UpdateStore updateStore = UpdateStore.create(documentLine.getStore().getDataSourceModel());
            updateStore.deleteEntity(documentLine);
            updateStore.submitChanges()
                    .onFailure(dialogCallback::showException)
                    .onSuccess(resultBatch -> dialogCallback.closeDialog());
        });
        return promise.future();
    }
}
