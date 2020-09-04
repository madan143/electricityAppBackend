package com.madan.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	@Id
	public String id;
	public String userName;
	public String customerName;
	public String mobileNumber;
	public String email;
	public String address;
	public String password;
	public String hintQuestion;
	public String hintAnswer;
	public String uniqueServNum;
	

	public User() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHintQuestion() {
		return hintQuestion;
	}

	public void setHintQuestion(String hintQuestion) {
		this.hintQuestion = hintQuestion;
	}

	public String getHintAnswer() {
		return hintAnswer;
	}

	public void setHintAnswer(String hintAnswer) {
		this.hintAnswer = hintAnswer;
	}

	public String getUniqueServNum() {
		return uniqueServNum;
	}

	public void setUniqueServNum(String uniqueServNum) {
		this.uniqueServNum = uniqueServNum;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", customerName=" + customerName + ", mobileNumber="
				+ mobileNumber + ", email=" + email + ", address=" + address + ", password=" + password
				+ ", hintQuestion=" + hintQuestion + ", hintAnswer=" + hintAnswer + ", uniqueServNum=" + uniqueServNum
				+ "]";
	}

}