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
import com.madan.exceptions.RecordNotFoundException;
import com.madan.model.BillDetails;
import com.madan.repository.BillDetailsRepository;

/**
 * @author mareddy
 *
 */
@RestController
public class BillInquiryController {

	private static Logger log = Logger.getLogger(BillInquiryController.class.getName());

	@Autowired
	private BillDetailsRepository repository;

	@PostMapping("/inquiry")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<String> getBillDetails(@RequestBody BillDetails details) {
		log.info("<===============getBillDetails() Method START=====================>");
		Gson gson = null;
		BillDetails existingBillDtls = null;
		try {
				gson = new Gson();
				existingBillDtls = repository.findByUniqueServNum(details.getUniqueServNum());
				if(null==existingBillDtls) {
					throw new RecordNotFoundException();
				}
		}catch (RecordNotFoundException exc) {
			throw new ResponseStatusException(
	        		 HttpStatus.NOT_FOUND, "Invalid Unique Service number");
	    }catch(Exception ex) {
			ex.printStackTrace();
			log.log(Level.SEVERE, "Exception in BillInquiryController.getBillDetails() Method due to :" + ex.getMessage());
			throw new ResponseStatusException(
	        		 HttpStatus.INTERNAL_SERVER_ERROR, ApplicationConstants.ERROR_MSG);
		}
		log.info("<===============getBillDetails() Method END=====================>");
		return new ResponseEntity<>(gson.toJson(existingBillDtls), HttpStatus.OK);
	}

}
