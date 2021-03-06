package org.modality_project.base.shared.entities;

import dev.webfx.stack.orm.entity.Entity;
import dev.webfx.stack.orm.entity.EntityId;
import dev.webfx.platform.util.Objects;
import org.modality_project.base.shared.entities.markers.*;
import org.modality_project.hotel.shared.businessdata.time.DateTimeRange;

import java.time.LocalDate;

/**
 * @author Bruno Salmon
 */
public interface Event extends Entity,
        EntityHasName,
        EntityHasLabel,
        EntityHasIcon,
        EntityHasOrganization,
        EntityHasDateTimeRange,
        EntityHasMinDateTimeRange,
        EntityHasMaxDateTimeRange {

    default LocalDate getStartDate() {
        return getLocalDateFieldValue("startDate");
    }

    default LocalDate getEndDate() {
        return getLocalDateFieldValue("endDate");
    }

    default void setLive(Boolean live) {
        setFieldValue("live", live);
    }

    default Boolean isLive() {
        return getBooleanFieldValue("live");
    }

    default void setFeesBottomLabel(Object label) {
        setForeignField("feesBottomLabel", label);
    }

    default EntityId getFeesBottomLabelId() {
        return getForeignEntityId("feesBottomLabel");
    }

    default Label getFeesBottomLabel() {
        return getForeignEntity("feesBottomLabel");
    }

    default DateTimeRange computeMaxDateTimeRange() {
        return Objects.coalesce(getParsedMaxDateTimeRange(), getParsedDateTimeRange());
    }


}
