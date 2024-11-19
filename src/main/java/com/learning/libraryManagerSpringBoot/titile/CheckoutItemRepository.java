package com.learning.libraryManagerSpringBoot.titile;

import org.springframework.data.repository.CrudRepository;

public interface CheckoutItemRepository  extends CrudRepository<CheckoutItem, Long > {
}
