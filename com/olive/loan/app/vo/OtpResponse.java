package com.olive.loan.app.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OtpResponse {
	
	

	private String otp;
	
	private Date dateAndTime;
	
	private String status;
	
	
	
	public String getOtp() {
		return otp;
	}


	public void setOtp(String otp) {
		this.otp = otp;
	}


	public Date getDateAndTime() {
		return dateAndTime;
	}


	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	

	
	


	public OtpResponse() {
		super();
	}


	public OtpResponse(String otp, Date dateAndTime, String status, Long count) {
		super();
		this.otp = otp;
		this.dateAndTime = dateAndTime;
		this.status = status;
		
	}

	

}
