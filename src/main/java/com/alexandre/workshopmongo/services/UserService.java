package com.alexandre.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandre.workshopmongo.domain.User;
import com.alexandre.workshopmongo.repository.UserRepotirory;

@Service
public class UserService {
	
	@Autowired
	private UserRepotirory repo;
	
	public List<User>findAll(){
	
		return repo.findAll();
	}
}
