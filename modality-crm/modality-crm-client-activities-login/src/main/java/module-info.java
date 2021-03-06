// File managed by WebFX (DO NOT EDIT MANUALLY)

module modality.crm.client.activities.login {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires modality.base.client.activity;
    requires modality.base.client.validation;
    requires modality.event.client.sectionpanel;
    requires webfx.kit.util;
    requires webfx.platform.util;
    requires webfx.stack.async;
    requires webfx.stack.authn;
    requires webfx.stack.i18n;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.routing.activity;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.controls;
    requires webfx.stack.ui.util;

    // Exported packages
    exports org.modality_project.crm.client.activities.login;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.modality_project.crm.client.activities.login.LoginUiRoute;

}