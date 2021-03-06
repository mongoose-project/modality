// File managed by WebFX (DO NOT EDIT MANUALLY)

module modality.event.frontoffice.activities.terms {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires modality.base.client.icons;
    requires modality.base.client.util;
    requires modality.ecommerce.client.bookingprocess;
    requires modality.event.client.sectionpanel;
    requires webfx.extras.visual;
    requires webfx.extras.visual.grid.peers.base;
    requires webfx.platform.util;
    requires webfx.stack.i18n;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.dql;
    requires webfx.stack.orm.reactive.visual;
    requires webfx.stack.platform.windowhistory;
    requires webfx.stack.routing.activity;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.util;

    // Exported packages
    exports org.modality_project.event.frontoffice.activities.terms;
    exports org.modality_project.event.frontoffice.activities.terms.routing;
    exports org.modality_project.event.frontoffice.operations.terms;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.modality_project.event.frontoffice.activities.terms.TermsUiRoute;

}