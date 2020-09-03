package com.madan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.madan.model.User;

@Repository public interface UserRepository extends MongoRepository<User,
  String> {
  
	public User findByUserName(String userName);
	public User findByEmail(String email);
	
  
  }
 