package com.olive.loan.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olive.loan.app.entity.RegistrationData;

@Repository
public interface UserRespository extends JpaRepository<RegistrationData, Long> {

	
	public RegistrationData save(RegistrationData registrationData);
	public RegistrationData findByUserNameAndMobileNumberAndUserEmailAndUserPassWordAndUserDateOfBirth(String userName,String mobileNumber,String userEmail,String userPassword,String dateOfBirth);
	public RegistrationData findByMobileNumber(String mobilenumber);
	
}
