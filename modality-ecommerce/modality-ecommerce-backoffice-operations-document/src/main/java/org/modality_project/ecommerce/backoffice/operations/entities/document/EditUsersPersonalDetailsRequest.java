package org.modality_project.ecommerce.backoffice.operations.entities.document;

import dev.webfx.stack.ui.controls.button.ButtonFactoryMixin;
import dev.webfx.stack.ui.operation.HasOperationCode;
import dev.webfx.stack.ui.operation.HasOperationExecutor;
import dev.webfx.stack.async.AsyncFunction;
import javafx.scene.layout.Pane;
import org.modality_project.base.shared.entities.Person;

public final class EditUsersPersonalDetailsRequest implements HasOperationCode,
        HasOperationExecutor<EditUsersPersonalDetailsRequest, Void> {

    private final static String OPERATION_CODE = "EditUsersPersonalDetails";

    private final Person person;
    private final ButtonFactoryMixin buttonFactoryMixin;
    private final Pane parentContainer;

    public EditUsersPersonalDetailsRequest(Person person, ButtonFactoryMixin buttonFactoryMixin, Pane parentContainer) {
        this.person = person;
        this.buttonFactoryMixin = buttonFactoryMixin;
        this.parentContainer = parentContainer;
    }

    Person getPerson() {
        return person;
    }

    public ButtonFactoryMixin getButtonFactoryMixin() {
        return buttonFactoryMixin;
    }

    Pane getParentContainer() {
        return parentContainer;
    }

    @Override
    public Object getOperationCode() {
        return OPERATION_CODE;
    }

    @Override
    public AsyncFunction<EditUsersPersonalDetailsRequest, Void> getOperationExecutor() {
        return EditUsersPersonalDetailsExecutor::executeRequest;
    }
}
