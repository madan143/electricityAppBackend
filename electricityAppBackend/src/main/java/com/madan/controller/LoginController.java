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
import com.madan.exceptions.AuthenticationException;
import com.madan.exceptions.RecordAlreadyExistException;
import com.madan.exceptions.RecordNotFoundException;
import com.madan.model.User;
import com.madan.repository.UserRepository;

/**
 * @author mareddy
 *
 */
@RestController
public class LoginController {
	
	private static Logger log = Logger.getLogger(LoginController.class.getName());
	
	@Autowired
	private UserRepository repository;
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<String> validateLoginDetails(@RequestBody User user) {
		log.info("<===============validateLoginDetails() Method START=====================>");
		Gson gson = null;
		User userDtls = null;
		try {
				gson = new Gson();
				userDtls = repository.findByUserName(user.getUserName());
				if(null==userDtls) {
					throw new RecordNotFoundException();
				}else if(!BCrypt.checkpw(user.getPassword(), userDtls.getPassword())) {
						throw new AuthenticationException();
				}
		}catch (RecordNotFoundException exc) {
	         throw new ResponseStatusException(
	        		 HttpStatus.NOT_FOUND, "User not registered");
	    }catch (AuthenticationException exc) {
	         throw new ResponseStatusException(
	        		 HttpStatus.UNAUTHORIZED, "Invalid credentials entered");
	    }catch(Exception ex) {
			ex.printStackTrace();
			log.log(Level.SEVERE, "Exception in LoginController.validateLoginDetails() Method due to :" + ex.getMessage());
			throw new ResponseStatusException(
	        		 HttpStatus.INTERNAL_SERVER_ERROR, ApplicationConstants.ERROR_MSG);
		}
		log.info("<===============validateLoginDetails() Method END=====================>");
		return new ResponseEntity<>(gson.toJson(ApplicationConstants.SUCCESS_MSG), HttpStatus.OK);
	}

}
