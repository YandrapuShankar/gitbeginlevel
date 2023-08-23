package com.olive.loan.app.vo;

import java.util.Map;

public class VariableRequestBody {
	
	private String loanType;
	
	private String loanId;
	
	private DeviceDetails deviceDetails;

	private Map<String, Object> data;

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public DeviceDetails getDeviceDetails() {
		return deviceDetails;
	}

	public void setDeviceDetails(DeviceDetails deviceDetails) {
		this.deviceDetails = deviceDetails;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public VariableRequestBody() {
		super();
	}

	public VariableRequestBody(String loanType, String loanId, DeviceDetails deviceDetails, Map<String, Object> data) {
		super();
		this.loanType = loanType;
		this.loanId = loanId;
		this.deviceDetails = deviceDetails;
		this.data = data;
	}

	@Override
	public String toString() {
		return "VariableRequestBody [loanType=" + loanType + ", loanId=" + loanId + ", deviceDetails=" + deviceDetails
				+ ", data=" + data + "]";
	}
	
	
	
}
