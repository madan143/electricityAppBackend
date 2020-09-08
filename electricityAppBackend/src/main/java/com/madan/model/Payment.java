package com.madan.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Payment {

	@Id
	public String id;
	public String uniqueServNum;
	public String paymentType;
	public String paymentAmt;
	public String nameOnCard;
	public String creditCardNum;
	public String expiration;
	public String cvv;
	public Date paymentDt;
		
	public Payment() {
	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUniqueServNum() {
		return uniqueServNum;
	}

	public void setUniqueServNum(String uniqueServNum) {
		this.uniqueServNum = uniqueServNum;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentAmt() {
		return paymentAmt;
	}

	public void setPaymentAmt(String paymentAmt) {
		this.paymentAmt = paymentAmt;
	}

	public String getCreditCardNum() {
		return creditCardNum;
	}

	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	public Date getPaymentDt() {
		return paymentDt;
	}

	public void setPaymentDt(Date paymentDt) {
		this.paymentDt = paymentDt;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", uniqueServNum=" + uniqueServNum + ", paymentType=" + paymentType
				+ ", paymentAmt=" + paymentAmt + ", nameOnCard=" + nameOnCard + ", creditCardNum=" + creditCardNum
				+ ", expiration=" + expiration + ", cvv=" + cvv + ", paymentDt=" + paymentDt + "]";
	}

}