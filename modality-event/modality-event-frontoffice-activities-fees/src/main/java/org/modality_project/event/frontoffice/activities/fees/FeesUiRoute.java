package org.modality_project.event.frontoffice.activities.fees;

import org.modality_project.event.frontoffice.activities.fees.routing.FeesRouting;
import dev.webfx.stack.orm.domainmodel.activity.viewdomain.impl.ViewDomainActivityContextFinal;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;

/**
 * @author Bruno Salmon
 */
public final class FeesUiRoute extends UiRouteImpl {

    public FeesUiRoute() {
        super(uiRoute());
    }

    public static UiRoute<?> uiRoute() {
        return UiRoute.create(FeesRouting.getPath()
                , false
                , FeesActivity::new
                , ViewDomainActivityContextFinal::new
        );
    }
}
