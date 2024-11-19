package com.learning.libraryManagerSpringBoot.titile;

import org.springframework.data.repository.CrudRepository;

public interface BookItemRespository extends CrudRepository<BookItem, Long> {
    BookItem findBookItemByItemPhysicalId(final Long itemPhysicalId);
}
