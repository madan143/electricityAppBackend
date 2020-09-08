package com.madan.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "billdetails")
public class BillDetails {

	@Id
	public String id;
	public String consumerName;
	public String uniqueServNum;
	public String serviceNumber;
	public String eroName;
	public String address;
	public Date currentMnthBillDt;
	public String currentMnthBillAmt;
	public Date arrearMnthBillDt;
	public String arrearMnthBillAmt;
	public Date dueDt;
	public String totalAmt;
	public Date lastMnthBillDt;
	public String lastMnthBillAmt;
	
	
	public BillDetails() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public String getUniqueServNum() {
		return uniqueServNum;
	}
	public void setUniqueServNum(String uniqueServNum) {
		this.uniqueServNum = uniqueServNum;
	}
	public String getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public String getEroName() {
		return eroName;
	}
	public void setEroName(String eroName) {
		this.eroName = eroName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCurrentMnthBillDt() {
		return currentMnthBillDt;
	}
	public void setCurrentMnthBillDt(Date currentMnthBillDt) {
		this.currentMnthBillDt = currentMnthBillDt;
	}
	public String getCurrentMnthBillAmt() {
		return currentMnthBillAmt;
	}
	public void setCurrentMnthBillAmt(String currentMnthBillAmt) {
		this.currentMnthBillAmt = currentMnthBillAmt;
	}
	public Date getArrearMnthBillDt() {
		return arrearMnthBillDt;
	}
	public void setArrearMnthBillDt(Date arrearMnthBillDt) {
		this.arrearMnthBillDt = arrearMnthBillDt;
	}
	public String getArrearMnthBillAmt() {
		return arrearMnthBillAmt;
	}
	public void setArrearMnthBillAmt(String arrearMnthBillAmt) {
		this.arrearMnthBillAmt = arrearMnthBillAmt;
	}
	public Date getDueDt() {
		return dueDt;
	}
	public void setDueDt(Date dueDt) {
		this.dueDt = dueDt;
	}
	public String getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}
	public Date getLastMnthBillDt() {
		return lastMnthBillDt;
	}
	public void setLastMnthBillDt(Date lastMnthBillDt) {
		this.lastMnthBillDt = lastMnthBillDt;
	}
	public String getLastMnthBillAmt() {
		return lastMnthBillAmt;
	}
	public void setLastMnthBillAmt(String lastMnthBillAmt) {
		this.lastMnthBillAmt = lastMnthBillAmt;
	}

	@Override
	public String toString() {
		return "BillDetails [id=" + id + ", consumerName=" + consumerName + ", uniqueServNum=" + uniqueServNum
				+ ", serviceNumber=" + serviceNumber + ", eroName=" + eroName + ", address=" + address
				+ ", currentMnthBillDt=" + currentMnthBillDt + ", currentMnthBillAmt=" + currentMnthBillAmt
				+ ", arrearMnthBillDt=" + arrearMnthBillDt + ", arrearMnthBillAmt=" + arrearMnthBillAmt + ", dueDt="
				+ dueDt + ", totalAmt=" + totalAmt + ", lastMnthBillDt=" + lastMnthBillDt + ", lastMnthBillAmt="
				+ lastMnthBillAmt + "]";
	}

}