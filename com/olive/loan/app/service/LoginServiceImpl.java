package com.olive.loan.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import com.google.gson.Gson;
import com.olive.loan.app.dao.UserRespository;
import com.olive.loan.app.entity.RegistrationData;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.LoginReq;
import com.olive.loan.app.vo.LoginResponse;
@Service
public class LoginServiceImpl implements LoginService{
	
	
	Logger logger=LoggerFactory.getLogger(this.getClass());


	@Autowired
	private UserRespository userRespository;
	
	@Override
	public void getLoginResponse(LoginReq loginReq, DeferredResult<Result<LoginResponse>> dr) {
		try {
			Result<LoginResponse> result=new Result<LoginResponse>();
			LoginResponse loginResponse=new LoginResponse();
			RegistrationData registrationData=userRespository.findByMobileNumber(loginReq.getMobilenumber());
			
			logger.info("The RegestrationData{}",new Gson().toJson(registrationData));
			if(registrationData!=null) {
				
				logger.info("loginRequestPassword{}  registrationData.getUserPassWord{}",loginReq.getPassword(),registrationData.getUserPassWord());
			if(loginReq.getPassword().equalsIgnoreCase(registrationData.getUserPassWord())) {
				result.setCode("00");
				result.setResult("Success");
				loginResponse.setFlag(true);
				loginResponse.setUserName(registrationData.getUserName());
				result.setData(loginResponse);
			}
			else {
				result.setCode("01");
				result.setResult("Failure");
				loginResponse.setFlag(false);
				result.setData(loginResponse);
			}
			}else {
				result.setCode("01");
				result.setResult("User Not Found");
				loginResponse.setFlag(false);
				result.setData(loginResponse);
			}
			dr.setResult(result);
			logger.info("TheFinalResponse{}::::",new Gson().toJson(result));
			return;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	

}
