package com.madan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.madan.model.Payment;

@Repository 
public interface PaymentRepository extends MongoRepository<Payment,
  String> {
  
	
	  
  }
 