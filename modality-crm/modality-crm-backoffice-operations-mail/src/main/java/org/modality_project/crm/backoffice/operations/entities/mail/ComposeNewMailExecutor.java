package org.modality_project.crm.backoffice.operations.entities.mail;

import javafx.scene.layout.Pane;
import org.modality_project.base.shared.entities.Document;
import dev.webfx.stack.async.Future;

final class ComposeNewMailExecutor {

    static Future<Void> executeRequest(ComposeNewMailRequest rq) {
        return execute(rq.getDocument(), rq.getParentContainer());
    }

    private static Future<Void> execute(Document document, Pane parentContainer) {
        Future<Void> future = Future.succeededFuture();
        return future;
    }
}
