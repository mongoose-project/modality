package org.modality_project.base.shared.entities.impl;

import dev.webfx.stack.orm.entity.EntityId;
import dev.webfx.stack.orm.entity.EntityStore;
import dev.webfx.stack.orm.entity.impl.DynamicEntity;
import dev.webfx.stack.orm.entity.impl.EntityFactoryProviderImpl;
import org.modality_project.base.shared.entities.Tagged;

/**
 * @author Dan Newman
 */
public class TaggedImpl extends DynamicEntity implements Tagged {

    public TaggedImpl(EntityId id, EntityStore store) {
        super(id, store);
    }

    public static final class ProvidedFactory extends EntityFactoryProviderImpl<Tagged> {
        public ProvidedFactory() {
            super(Tagged.class, TaggedImpl::new);
        }
    }

}
