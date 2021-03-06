// File managed by WebFX (DO NOT EDIT MANUALLY)

module modality.base.backoffice.activities.operations {

    // Direct dependencies modules
    requires javafx.graphics;
    requires modality.base.client.activity;
    requires webfx.kit.launcher;
    requires webfx.platform.util;
    requires webfx.stack.async;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.dql;
    requires webfx.stack.orm.entity;
    requires webfx.stack.orm.entity.controls;
    requires webfx.stack.orm.reactive.visual;
    requires webfx.stack.platform.windowhistory;
    requires webfx.stack.routing.activity;
    requires webfx.stack.routing.router;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.operation;

    // Exported packages
    exports org.modality_project.base.backoffice.activities.operations;
    exports org.modality_project.base.backoffice.activities.operations.routing;
    exports org.modality_project.base.backoffice.operations.routes.operations;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.modality_project.base.backoffice.activities.operations.OperationsUiRoute;
    provides dev.webfx.stack.routing.uirouter.operations.RouteRequestEmitter with org.modality_project.base.backoffice.activities.operations.RouteToOperationsRequestEmitter;

}