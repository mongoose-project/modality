package org.modality_project.base.shared.entities;

import dev.webfx.stack.orm.entity.Entity;
import dev.webfx.stack.orm.entity.EntityId;

/**
 * @author Dan Newman
 */
public interface Tagged extends Entity {

    default void setTagId(int tagId) {
        setFieldValue("tagId", tagId);
    }

    default void setObjectId(EntityId objectId) {
        setFieldValue("objectId", objectId);
    }
}
