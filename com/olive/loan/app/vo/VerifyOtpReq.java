package com.olive.loan.app.vo;

public class VerifyOtpReq {



private String otp;

private DeviceDetails deviceDetails;

public String getOtp() {
	return otp;
}

public void setOtp(String otp) {
	this.otp = otp;
}

public VerifyOtpReq(String otp, DeviceDetails deviceDetails) {
	super();
	this.otp = otp;
	this.deviceDetails = deviceDetails;
}

public DeviceDetails getDeviceDetails() {
	return deviceDetails;
}

public void setDeviceDetails(DeviceDetails deviceDetails) {
	this.deviceDetails = deviceDetails;
}

public VerifyOtpReq() {
	super();
}




}
