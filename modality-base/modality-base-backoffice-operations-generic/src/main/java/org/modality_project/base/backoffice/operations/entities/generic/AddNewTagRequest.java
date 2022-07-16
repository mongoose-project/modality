package org.modality_project.base.backoffice.operations.entities.generic;

import dev.webfx.stack.ui.operation.HasOperationCode;
import dev.webfx.stack.ui.operation.HasOperationExecutor;
import dev.webfx.stack.orm.entity.Entity;
import dev.webfx.stack.async.AsyncFunction;
import javafx.scene.layout.Pane;

import java.util.Collection;

// TODO move this class to module modality-base-backoffice-operations-snapshot
public final class AddNewTagRequest implements HasOperationCode,
        HasOperationExecutor<AddNewTagRequest, Void> {

    private final static String OPERATION_CODE = "AddNewSnapshot";

    private final Collection<? extends Entity> entities;
    private final Pane parentContainer;

    public AddNewTagRequest(Collection<? extends Entity> entities, Pane parentContainer) {
        this.entities = entities;
        this.parentContainer = parentContainer;
    }

    Collection<? extends Entity> getEntities() {
        return entities;
    }
    Pane getParentContainer() {
        return parentContainer;
    }

    @Override
    public Object getOperationCode() {
        return OPERATION_CODE;
    }

    @Override
    public AsyncFunction<AddNewTagRequest, Void> getOperationExecutor() {
        return AddNewTagExecutor::executeRequest;
    }

}
