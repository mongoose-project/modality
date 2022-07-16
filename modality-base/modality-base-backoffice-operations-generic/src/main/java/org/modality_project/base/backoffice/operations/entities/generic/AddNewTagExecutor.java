package org.modality_project.base.backoffice.operations.entities.generic;

import dev.webfx.stack.orm.entity.controls.entity.sheet.EntityPropertiesSheet;
import dev.webfx.stack.orm.entity.Entity;
import dev.webfx.stack.orm.entity.UpdateStore;
import dev.webfx.stack.async.Future;
import javafx.scene.layout.Pane;
import org.modality_project.base.shared.entities.Tag;
import org.modality_project.base.shared.entities.MoneyAccount;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

// TODO move this class to module modality-base-backoffice-operations-tag
final class AddNewTagExecutor {

    static Future<Void> executeRequest(AddNewTagRequest rq) {
        return execute(rq.getEntities(), rq.getParentContainer());
    }

    private static <E extends Entity> Future<Void> execute(Collection<E> entities, Pane parentContainer) {
        if (entities == null || entities.isEmpty()) {
            // TODO show popup
            System.out.println("entities null or empty.");
            return Future.succeededFuture();
        }

        E firstEntity = entities.iterator().next();
        UpdateStore updateStore = UpdateStore.createAbove(firstEntity.getStore());
        Tag insertEntity = updateStore.insertEntity(Tag.class);
        String domainClassName = firstEntity.getDomainClass().getName();
        insertEntity.setName(generateDefaultName(domainClassName));
        insertEntity.setClassId(domainClassName);
        System.out.println("insertEntity.id =" + insertEntity.getId());
        EntityPropertiesSheet.editEntity(insertEntity, "id,name,classId", parentContainer);
        return Future.succeededFuture();
    }

    private static <E extends Entity> String generateDefaultName(String domainClassName)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String dateTime = dtf.format(now);

        return domainClassName + " " + dateTime;
    }
}
