/**
 * 
 */
package com.madan.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.google.gson.Gson;
import com.madan.constants.ApplicationConstants;
import com.madan.exceptions.RecordAlreadyExistException;
import com.madan.model.User;
import com.madan.repository.UserRepository;

/**
 * @author mareddy
 *
 */
@RestController
public class RegistrationController {
	
	private static Logger log = Logger.getLogger(RegistrationController.class.getName());
	
	@Autowired
	private UserRepository repository;
	
	@PostMapping("/register")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<String> createNewUser(@RequestBody User user) {
		log.info("<===============createNewUser() Method START=====================>");
		Gson gson = null;
		try {
				gson = new Gson();
				if(null!=repository.findByEmail(user.getEmail())) {
					throw new RecordAlreadyExistException();
				}else {
					String encryptCustomerKey = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
					user.setPassword(encryptCustomerKey);
					repository.insert(user);
				}
		}catch (RecordAlreadyExistException exc) {
	         throw new ResponseStatusException(
	        		 HttpStatus.ALREADY_REPORTED, "Email Id is already Registered");
	    }catch(Exception ex) {
			ex.printStackTrace();
			log.log(Level.SEVERE, "Exception in RegistrationController.createNewUser() Method due to :" + ex.getMessage());
			throw new ResponseStatusException(
	        		 HttpStatus.INTERNAL_SERVER_ERROR, ApplicationConstants.ERROR_MSG);
		}
		log.info("<===============createNewUser() Method END=====================>");
		return new ResponseEntity<>(gson.toJson(ApplicationConstants.SUCCESS_MSG), HttpStatus.OK);
	}

}
