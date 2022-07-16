package org.modality_project.base.shared.entities.impl;

import dev.webfx.stack.orm.entity.EntityId;
import dev.webfx.stack.orm.entity.EntityStore;
import dev.webfx.stack.orm.entity.impl.DynamicEntity;
import dev.webfx.stack.orm.entity.impl.EntityFactoryProviderImpl;
import org.modality_project.base.shared.entities.Tag;

/**
 * @author Dan Newman
 */
public class TagImpl extends DynamicEntity implements Tag {

    public TagImpl(EntityId id, EntityStore store) {
        super(id, store);
    }

    public static final class ProvidedFactory extends EntityFactoryProviderImpl<Tag> {
        public ProvidedFactory() {
            super(Tag.class, TagImpl::new);
        }
    }

}
