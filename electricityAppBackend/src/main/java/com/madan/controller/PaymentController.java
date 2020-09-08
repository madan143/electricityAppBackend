/**
 * 
 */
package com.madan.controller;

import java.util.Date;
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
import com.madan.model.Card;
import com.madan.model.Payment;
import com.madan.repository.CardRepository;
import com.madan.repository.PaymentRepository;

/**
 * @author mareddy
 *
 */
@RestController
public class PaymentController {
	
	private static Logger log = Logger.getLogger(PaymentController.class.getName());
	
	@Autowired
	private CardRepository cardRepository;
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	@PostMapping("/payment")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<String> makePayment(@RequestBody Payment payment) {
		log.info("<===============makePayment() Method START=====================>");
		Gson gson = null;
		try {
				gson = new Gson();
				Card card = cardRepository.validateCardDetails(payment.getNameOnCard(),payment.getCreditCardNum(),
						payment.getExpiration(),payment.getCvv());
				if(null==card) {
					throw new RecordNotFoundException();
				}else {
					payment.setPaymentDt(new Date());
					paymentRepository.insert(payment);
				}
		}catch (RecordNotFoundException exc) {
	         throw new ResponseStatusException(
	        		 HttpStatus.NOT_FOUND, "Provided card details are not valid");
	    }catch(Exception ex) {
			ex.printStackTrace();
			log.log(Level.SEVERE, "Exception in PaymentController.makePayment() Method due to :" + ex.getMessage());
			throw new ResponseStatusException(
	        		 HttpStatus.INTERNAL_SERVER_ERROR, ApplicationConstants.ERROR_MSG);
		}
		log.info("<===============makePayment() Method END=====================>");
		return new ResponseEntity<>(gson.toJson(ApplicationConstants.SUCCESS_MSG), HttpStatus.OK);
	}

}
