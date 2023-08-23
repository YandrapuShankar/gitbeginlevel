package com.olive.loan.app.vo;

public class OtpRequestVo {

	public DeviceDetails deviceDetails;

	public DeviceDetails getDeviceDetails() {
		return deviceDetails;
	}

	public void setDeviceDetails(DeviceDetails deviceDetails) {
		this.deviceDetails = deviceDetails;
	}

	public OtpRequestVo(DeviceDetails deviceDetails) {
		super();
		this.deviceDetails = deviceDetails;
	}

	public OtpRequestVo() {
		super();
	}
	
}
