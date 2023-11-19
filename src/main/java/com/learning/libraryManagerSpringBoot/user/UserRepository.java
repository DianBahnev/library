package com.learning.libraryManagerSpringBoot.user;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository  extends CrudRepository<User, Long>{
}
