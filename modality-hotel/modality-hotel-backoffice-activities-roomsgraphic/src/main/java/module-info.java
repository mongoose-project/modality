// File managed by WebFX (DO NOT EDIT MANUALLY)

module modality.hotel.backoffice.activities.roomsgraphic {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires modality.base.backoffice.masterslave;
    requires modality.base.client.activity;
    requires modality.base.client.presentationmodel;
    requires modality.base.client.util;
    requires modality.base.shared.entities;
    requires modality.hotel.backoffice.operations.resourceconfiguration;
    requires webfx.extras.flexbox;
    requires webfx.extras.imagestore;
    requires webfx.extras.visual.grid;
    requires webfx.kit.util;
    requires webfx.platform.util;
    requires webfx.stack.async;
    requires webfx.stack.com.serial;
    requires webfx.stack.db.datascope;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.dql;
    requires webfx.stack.orm.entity;
    requires webfx.stack.orm.reactive.entities;
    requires webfx.stack.orm.reactive.visual;
    requires webfx.stack.platform.json;
    requires webfx.stack.platform.windowhistory;
    requires webfx.stack.routing.activity;
    requires webfx.stack.routing.router;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.action;
    requires webfx.stack.ui.operation;
    requires webfx.stack.ui.operation.action;
    requires webfx.stack.ui.util;

    // Exported packages
    exports org.modality_project.hotel.backoffice.activities.roomsgraphic;
    exports org.modality_project.hotel.backoffice.activities.roomsgraphic.routing;
    exports org.modality_project.hotel.backoffice.operations.routes.roomsgraphic;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.modality_project.hotel.backoffice.activities.roomsgraphic.RoomsGraphicUiRoute;
    provides dev.webfx.stack.routing.uirouter.operations.RouteRequestEmitter with org.modality_project.hotel.backoffice.activities.roomsgraphic.RouteToRoomsGraphicRequestEmitter;

}