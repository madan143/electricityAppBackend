package com.madan.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "complaint")
public class Complaint {

	@Id
	public String id;
	public String uniqueServNum;
	public String issueCategory;
	public String issueSubCategory;
	public String nameOfComplainer;
	public String mobileNumber;
	public String email;
	public String uploadDoc;
	
	public Complaint() {
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

	public String getIssueCategory() {
		return issueCategory;
	}

	public void setIssueCategory(String issueCategory) {
		this.issueCategory = issueCategory;
	}

	public String getIssueSubCategory() {
		return issueSubCategory;
	}

	public void setIssueSubCategory(String issueSubCategory) {
		this.issueSubCategory = issueSubCategory;
	}

	public String getNameOfComplainer() {
		return nameOfComplainer;
	}

	public void setNameOfComplainer(String nameOfComplainer) {
		this.nameOfComplainer = nameOfComplainer;
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

	public String getUploadDoc() {
		return uploadDoc;
	}

	public void setUploadDoc(String uploadDoc) {
		this.uploadDoc = uploadDoc;
	}

	@Override
	public String toString() {
		return "Complaint [id=" + id + ", uniqueServNum=" + uniqueServNum + ", issueCategory=" + issueCategory
				+ ", issueSubCategory=" + issueSubCategory + ", nameOfComplainer=" + nameOfComplainer
				+ ", mobileNumber=" + mobileNumber + ", email=" + email + ", uploadDoc=" + uploadDoc + "]";
	}

	

}