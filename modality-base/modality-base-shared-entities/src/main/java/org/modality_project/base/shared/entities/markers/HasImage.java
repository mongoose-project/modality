package org.modality_project.base.shared.entities.markers;

import org.modality_project.base.shared.entities.Image;
import dev.webfx.stack.orm.entity.EntityId;

/**
 * @author Bruno Salmon
 */
public interface HasImage {

    void setImage(Object event);

    EntityId getImageId();

    Image getImage();

}
