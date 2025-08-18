package com.redhat.training.openshift.todoapi;


import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.MethodProperties;
import io.quarkus.rest.data.panache.ResourceProperties;


@ResourceProperties(path = "/todo/api/items")
public interface ItemResource extends PanacheEntityResource<Item, Long> {
    @MethodProperties(exposed = true)
    Item add(Item item);

    @MethodProperties(exposed = true)
    Item update(Long id, Item existingItem);

    @MethodProperties(exposed = true)
    boolean delete(Long id);
}