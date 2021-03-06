package org.modality_project.hotel.backoffice.operations.entities.resourceconfiguration;

import javafx.scene.layout.Pane;
import dev.webfx.stack.ui.operation.HasOperationCode;
import dev.webfx.stack.ui.operation.HasOperationExecutor;
import dev.webfx.stack.orm.entity.Entity;
import dev.webfx.stack.async.AsyncFunction;

public final class EditResourceConfigurationPropertiesRequest implements HasOperationCode,
        HasOperationExecutor<EditResourceConfigurationPropertiesRequest, Void> {

    private final static String OPERATION_CODE = "EditResourceConfigurationProperties";

    private final Entity resourceConfiguration;
    private final Pane parentContainer;

    public EditResourceConfigurationPropertiesRequest(Entity resourceConfiguration, Pane parentContainer) {
        this.resourceConfiguration = resourceConfiguration;
        this.parentContainer = parentContainer;
    }

    Entity getResourceConfiguration() {
        return resourceConfiguration;
    }

    Pane getParentContainer() {
        return parentContainer;
    }

    @Override
    public Object getOperationCode() {
        return OPERATION_CODE;
    }

    @Override
    public AsyncFunction<EditResourceConfigurationPropertiesRequest, Void> getOperationExecutor() {
        return EditResourceConfigurationPropertiesExecutor::executeRequest;
    }
}
