package com.olive.loan.app.vo;

public class LoanStatusRequest {
public String loanId;
public String loanType;
public DeviceDetails deviceDetails;
public String getLoanId() {
	return loanId;
}
public void setLoanId(String loanId) {
	this.loanId = loanId;
}
public String getLoanType() {
	return loanType;
}
public void setLoanType(String loanType) {
	this.loanType = loanType;
}
public DeviceDetails getDeviceDetails() {
	return deviceDetails;
}
public void setDeviceDetails(DeviceDetails deviceDetails) {
	this.deviceDetails = deviceDetails;
}

}
