package com.snaacker.jpa.repository;

import com.snaacker.jpa.persistent.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
