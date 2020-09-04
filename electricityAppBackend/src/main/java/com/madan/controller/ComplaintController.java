/**
 * 
 */
package com.madan.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.google.gson.Gson;
import com.madan.constants.ApplicationConstants;
import com.madan.model.Complaint;
import com.madan.repository.ComplaintRepository;

/**
 * @author mareddy
 *
 */
@RestController
public class ComplaintController {
	
	private static Logger log = Logger.getLogger(ComplaintController.class.getName());
	
	@Autowired
	private ComplaintRepository repository;
	
	@PostMapping("/complaint")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<String> createNewComplaint(@RequestBody Complaint complaint) {
		log.info("<===============createNewComplaint() Method START=====================>");
		Gson gson = null;
		try {
				gson = new Gson();
					repository.insert(complaint);
				
		}catch(Exception ex) {
			ex.printStackTrace();
			log.log(Level.SEVERE, "Exception in ComplaintController.createNewComplaint() Method due to :" + ex.getMessage());
			throw new ResponseStatusException(
	        		 HttpStatus.INTERNAL_SERVER_ERROR, ApplicationConstants.ERROR_MSG);
		}
		log.info("<===============createNewComplaint() Method END=====================>");
		return new ResponseEntity<>(gson.toJson(ApplicationConstants.SUCCESS_MSG), HttpStatus.OK);
	}

}
