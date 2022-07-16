package org.modality_project.base.backoffice.operations.tag;

import dev.webfx.stack.orm.reactive.entities.entities_to_grid.EntityColumn;
import dev.webfx.stack.orm.entity.Entity;
import dev.webfx.stack.async.Future;

import java.util.Collection;

final class CreateTagExecutor {

    static Future<Void> executeRequest(CreateTagRequest rq) {
        return execute(rq.getEntities());
    }

    private static <E extends Entity> Future<Void> execute(Collection<E> entities, EntityColumn<E>... columns) {
        // TODO
        return Future.succeededFuture();
    }
}
