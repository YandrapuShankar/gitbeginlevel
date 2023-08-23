package com.olive.loan.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olive.loan.app.entity.OTP;

@Repository
public interface OtpRepository extends JpaRepository<OTP, String> {

	
	public OTP save(OTP Otp);
	
	public OTP findByOtpAndMobileNumberOrderByCreatedDateDesc(String mobileNumber,String OTP);
	
	
}
