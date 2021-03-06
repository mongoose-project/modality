package org.modality_project.ecommerce.backoffice.operations.entities.moneytransfer;

import javafx.scene.layout.Pane;
import org.modality_project.base.shared.entities.Document;
import dev.webfx.stack.ui.operation.HasOperationCode;
import dev.webfx.stack.ui.operation.HasOperationExecutor;
import dev.webfx.stack.async.AsyncFunction;

public final class AddNewPaymentRequest implements HasOperationCode,
        HasOperationExecutor<AddNewPaymentRequest, Void> {

    private final static String OPERATION_CODE = "AddNewPayment";

    private final Document document;
    private final Pane parentContainer;

    public AddNewPaymentRequest(Document document, Pane parentContainer) {
        this.document = document;
        this.parentContainer = parentContainer;
    }

    Document getDocument() {
        return document;
    }

    Pane getParentContainer() {
        return parentContainer;
    }

    @Override
    public Object getOperationCode() {
        return OPERATION_CODE;
    }

    @Override
    public AsyncFunction<AddNewPaymentRequest, Void> getOperationExecutor() {
        return AddNewPaymentExecutor::executeRequest;
    }
}
