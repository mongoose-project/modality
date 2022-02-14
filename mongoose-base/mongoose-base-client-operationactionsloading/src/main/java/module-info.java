// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.base.client.operationactionsloading {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires webfx.framework.client.action;
    requires webfx.framework.client.i18n;
    requires webfx.framework.client.operationaction;
    requires webfx.framework.client.uirouter;
    requires webfx.framework.shared.orm.datasourcemodelservice;
    requires webfx.framework.shared.orm.entity;
    requires webfx.platform.shared.appcontainer;
    requires webfx.platform.shared.log;
    requires webfx.platform.shared.util;

    // Exported packages
    exports mongoose.base.client.operationactionsloading;

    // Provided services
    provides dev.webfx.platform.shared.services.appcontainer.spi.ApplicationModuleInitializer with mongoose.base.client.operationactionsloading.MongooseClientOperationActionsLoader;

}