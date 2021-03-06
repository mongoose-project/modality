package org.modality_project.base.client.aggregates.person;

import org.modality_project.base.shared.entities.Person;
import dev.webfx.stack.orm.entity.EntityStore;

/**
 * @author Bruno Salmon
 */
public interface PersonAggregate {

    static PersonAggregate get(EntityStore store) {
        return PersonAggregateImpl.get(store);
    }

    static PersonAggregate getOrCreate(EntityStore store) {
        return PersonAggregateImpl.getOrCreate(store);
    }

    Person getPreselectionProfilePerson();

}
