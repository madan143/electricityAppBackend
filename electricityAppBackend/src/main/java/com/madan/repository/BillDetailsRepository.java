package com.madan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.madan.model.BillDetails;

@Repository 
public interface BillDetailsRepository extends MongoRepository<BillDetails,
  String> {
  
	public BillDetails findByUniqueServNum(String uniqueServNum);
	  
  }
 