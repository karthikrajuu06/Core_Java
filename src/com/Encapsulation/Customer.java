package com.Encapsulation;

public class Customer {

	private	long mobileNumber;
	private String operatorName;
	private int rechargeAmount;
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public int getRechargeAmount () {
		return rechargeAmount;
}
	
public void setMobileNumber(long mobileNumber) {
	
		this.mobileNumber = mobileNumber;
}
public void setOperatorName(String operatorName) {
	this.operatorName = operatorName;
}
public void setRechargeAmount(int rechargeAmount) {
	if(rechargeAmount>10) {
	this.rechargeAmount  = rechargeAmount;
}else {
	System.out.println("Not Valid");
}
}
}