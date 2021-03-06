// File managed by WebFX (DO NOT EDIT MANUALLY)

module modality.base.server.systemmetrics {

    // Direct dependencies modules
    requires java.base;
    requires modality.base.shared.entities;
    requires webfx.platform.boot;
    requires webfx.platform.console;
    requires webfx.platform.scheduler;
    requires webfx.platform.util;
    requires webfx.stack.async;
    requires webfx.stack.db.submit;
    requires webfx.stack.orm.datasourcemodel.service;
    requires webfx.stack.orm.domainmodel;
    requires webfx.stack.orm.entity;

    // Exported packages
    exports org.modality_project.base.server.jobs.systemmetrics;
    exports org.modality_project.base.server.services.systemmetrics;
    exports org.modality_project.base.server.services.systemmetrics.spi;

    // Used services
    uses org.modality_project.base.server.services.systemmetrics.spi.SystemMetricsServiceProvider;

    // Provided services
    provides dev.webfx.platform.boot.spi.ApplicationJob with org.modality_project.base.server.jobs.systemmetrics.SystemMetricsRecorderJob;

}