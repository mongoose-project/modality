package org.modality_project.base.backoffice.operations.entities.filters;

import dev.webfx.stack.orm.entity.controls.entity.sheet.EntityPropertiesSheet;
import dev.webfx.stack.orm.entity.EntityStore;
import dev.webfx.stack.orm.entity.UpdateStore;
import dev.webfx.stack.async.Future;
import javafx.scene.layout.Pane;
import org.modality_project.base.shared.entities.Filter;

final class AddNewFieldsExecutor {

    static final String EXPRESSION_COLUMNS =
            "name,description,isCondition,isGroup,active,activityName,class,alias,columns,fields,orderByClause,limitClause";

    static Future<Void> executeRequest(AddNewFieldsRequest rq) {
        return execute(rq.getEntityStore(), rq.getParentContainer());
    }

    private static Future<Void> execute(EntityStore entityStore, Pane parentContainer) {
        UpdateStore updateStore = UpdateStore.createAbove(entityStore);
        Filter insertEntity = updateStore.insertEntity(Filter.class);
        insertEntity.setIsColumns(true);

        EntityPropertiesSheet.editEntity(insertEntity, EXPRESSION_COLUMNS, parentContainer);

        return Future.succeededFuture();
    }
}