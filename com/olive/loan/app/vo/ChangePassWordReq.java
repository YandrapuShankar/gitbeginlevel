package com.olive.loan.app.vo;

public class ChangePassWordReq {

private DeviceDetails deviceDetails;

private String changePassword;

private String conformPassWord;

public DeviceDetails getDeviceDetails() {
	return deviceDetails;
}

public void setDeviceDetails(DeviceDetails deviceDetails) {
	this.deviceDetails = deviceDetails;
}

public String getChangePassword() {
	return changePassword;
}

public void setChangePassword(String changePassword) {
	this.changePassword = changePassword;
}

public String getConformPassWord() {
	return conformPassWord;
}

public void setConformPassWord(String conformPassWord) {
	this.conformPassWord = conformPassWord;
}

public ChangePassWordReq(DeviceDetails deviceDetails, String changePassword, String conformPassWord) {
	super();
	this.deviceDetails = deviceDetails;
	this.changePassword = changePassword;
	this.conformPassWord = conformPassWord;
}

public ChangePassWordReq() {
	super();
}

	

	
}
