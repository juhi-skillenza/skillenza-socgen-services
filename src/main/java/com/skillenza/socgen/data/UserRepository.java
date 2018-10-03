package com.skillenza.socgen.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.skillenza.socgen.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

	List<User> findAllByOrderByFirstNameAsc();
	
	User findUserById(String id);
}
