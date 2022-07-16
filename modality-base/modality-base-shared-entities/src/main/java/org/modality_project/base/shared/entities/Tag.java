package org.modality_project.base.shared.entities;

import org.modality_project.base.shared.entities.markers.EntityHasIcon;
import org.modality_project.base.shared.entities.markers.EntityHasName;

import java.time.LocalDate;

public interface Tag extends
        EntityHasName,
        EntityHasIcon {

    default void setClassId(String classId) {
        setFieldValue("classId", classId);
    }

    default LocalDate getCreationDate() {
        return getLocalDateFieldValue("creationDate");
    }

    default void setCreationDate(LocalDate creationDate) {
        setFieldValue("creationDate", creationDate);
    }
}
