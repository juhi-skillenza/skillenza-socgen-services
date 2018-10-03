package com.skillenza.socgen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillenza.socgen.data.UserRepository;
import com.skillenza.socgen.domain.User;
import com.skillenza.socgen.service.UserService;
import com.skillenza.socgen.system.exception.ServiceException;

@Service("userService")
public class UserServiceImpl implements UserService {


	@Autowired
	private UserRepository userRepository;


	@Override
	public List<User> getAllUsers() {
		return userRepository.findAllByOrderByFirstNameAsc();
	}

	

	@Override
	public User saveUser(User user) {
		if(userRepository.exists(user.getId())) 
			throw new ServiceException("User Already Exists");
		else {
			userRepository.save(user);
			return user;
		}

	}


}
