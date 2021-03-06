package org.modality_project.event.backoffice.activities.cloneevent.routing;

import org.modality_project.base.client.util.routing.ModalityRoutingUtil;

/**
 * @author Bruno Salmon
 */
public final class CloneEventRouting {

    private static final String PATH = "/event/:eventId/clone";

    public static String getPath() {
        return PATH;
    }

    public static String getCloneEventPath(Object eventId) {
        return ModalityRoutingUtil.interpolateEventIdInPath(eventId, getPath());
    }

}
