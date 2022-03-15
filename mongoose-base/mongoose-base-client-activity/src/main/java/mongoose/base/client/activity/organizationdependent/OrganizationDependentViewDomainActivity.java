package mongoose.base.client.activity.organizationdependent;

import dev.webfx.framework.client.activity.impl.combinations.viewdomain.impl.ViewDomainActivityBase;
import dev.webfx.framework.client.activity.impl.combinations.viewdomain.impl.ViewDomainActivityContextFinal;
import mongoose.base.client.activity.MongooseButtonFactoryMixin;
import mongoose.base.client.activity.eventdependent.EventDependentPresentationModel;
import mongoose.base.client.activity.eventdependent.EventDependentPresentationModelImpl;

/**
 * @author Bruno Salmon
 */
public abstract class OrganizationDependentViewDomainActivity
        extends ViewDomainActivityBase
        implements OrganizationDependentActivityMixin<ViewDomainActivityContextFinal>,
        MongooseButtonFactoryMixin {

    private EventDependentPresentationModel presentationModel;

    @Override
    public EventDependentPresentationModel getPresentationModel() {
        if (presentationModel == null)
            presentationModel = new EventDependentPresentationModelImpl();
        return presentationModel;
    }

    @Override
    protected void updateModelFromContextParameters() {
        updateOrganizationDependentPresentationModelFromContextParameters();
        super.updateModelFromContextParameters();
    }
}
