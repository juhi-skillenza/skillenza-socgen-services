package com.skillenza.socgen.service;

import java.util.List;

import com.skillenza.socgen.domain.User;

public interface UserService {
	
	List<User> getAllUsers();

	User saveUser(User user);

}
