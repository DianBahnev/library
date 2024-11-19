package com.learning.libraryManagerSpringBoot.titile;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TitleRepository extends CrudRepository<Title, Long> {

    Optional<Title> findTitleByAuthorAndName(final String author, final String name);
}
