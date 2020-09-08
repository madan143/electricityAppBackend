package com.madan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.madan.model.Card;

@Repository 
public interface CardRepository extends MongoRepository<Card,
  String> {
  
	@Query("{'nameOnCard' : ?0 , 'creditCardNum' : ?1, 'expiration' : ?2, 'cvv' : ?3}")
	public Card validateCardDetails(String nameOnCard, String creditCardNum, String  expiration, String cvv);
	  
  }
 