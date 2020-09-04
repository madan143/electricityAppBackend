package com.madan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.madan.model.Complaint;
import com.madan.model.User;

@Repository 
public interface ComplaintRepository extends MongoRepository<Complaint,
  String> {
  
	
	public User findByEmail(String email);
	
  
  }
 