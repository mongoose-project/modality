package org.modality_project.base.backoffice.operations.tag;

import dev.webfx.stack.ui.operation.HasOperationCode;
import dev.webfx.stack.ui.operation.HasOperationExecutor;
import dev.webfx.stack.orm.entity.Entity;
import dev.webfx.stack.async.AsyncFunction;

import java.util.Collection;

public final class CreateTagRequest implements HasOperationCode,
        HasOperationExecutor<CreateTagRequest, Void> {

    private final static String OPERATION_CODE = "CreateSnapshot";

    private final Collection<? extends Entity> entities;

    CreateTagRequest(Collection<? extends Entity> entities) {
        this.entities = entities;
    }

    Collection<? extends Entity> getEntities() {
        return entities;
    }

    @Override
    public Object getOperationCode() {
        return OPERATION_CODE;
    }

    @Override
    public AsyncFunction<CreateTagRequest, Void> getOperationExecutor() {
        return CreateTagExecutor::executeRequest;
    }

}
