package com.olive.loan.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import com.google.gson.Gson;
import com.olive.loan.app.dao.DeviceInfoRepository;
import com.olive.loan.app.dao.UserRespository;
import com.olive.loan.app.entity.DeviceInfo;
import com.olive.loan.app.entity.RegistrationData;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.RegistrationReq;
import com.olive.loan.app.vo.RegistrationResp;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{
	@Autowired
	private UserRespository userRepository;
	
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DeviceInfoRepository deviceInfoRepository;
	
	@Async
	@Override
	public void userRegistration(RegistrationReq registrationReq, DeferredResult<Result<String>> dr) {
		
		try {
			RegistrationData registration=new RegistrationData();
			DeviceInfo deviceInfo=new DeviceInfo();
			   Result<String>result=new Result<String>();
			
			RegistrationData registrationData=userRepository.findByUserNameAndMobileNumberAndUserEmailAndUserPassWordAndUserDateOfBirth(registrationReq.getUserName(),registrationReq.getMobileNumber(),registrationReq.getUserEmail(),registrationReq.getPassWord(),registrationReq.getUserDateOfBirth());
			logger.info("The registrationDataResponse{}",new Gson().toJson(registrationData));
           
			logger.info("The registrationReq{}",new Gson().toJson(registrationReq));
			if(registrationData!=null)
			{
				  result.setCode("01");
				  result.setResult("FAILURE");
				  result.setData("User Registered already");
				  dr.setResult(result);
				  return ;
				
		}	
			  
			
			else if(registrationReq.getUserEmail()!=null&&registrationReq.getUserName()!=null&&registrationReq.getMobileNumber()!=null
					  &&registrationReq.getUserDateOfBirth()!=null&&registrationReq.getPassWord()!=null&&registrationReq.getUserOccupation()!=null)
					    
			  {
				  
			  registration.setUserEmail(registrationReq.getUserEmail()); 
			  registration.setUserName(registrationReq.getUserName());
			  registration.setMobileNumber(registrationReq.getMobileNumber());
			  registration.setUserPassWord(registrationReq.getPassWord());
			  registration.setUserDateOfBirth(registrationReq.getUserDateOfBirth());
			  registration.setUserOccupation(registrationReq.getUserOccupation());
			  registration.setStatus("ACTIVE");
			  
			  
			  deviceInfo.setMobileNumber(registrationReq.getDetails().getMobileNumber());
			  deviceInfo.setAppId(registrationReq.getDetails().getAppId());
			  deviceInfo.setAppVersion(registrationReq.getDetails().getAppVersion());
			  deviceInfo.setGeocode(registrationReq.getDetails().getGeoCode());
			  deviceInfo.setLocation(registrationReq.getDetails().getLocation());
			  deviceInfo.setIp(registrationReq.getDetails().getIp());
			  deviceInfo.setType(registrationReq.getDetails().getType());
			  deviceInfo.setDeviceId(registrationReq.getDetails().getDeviceId());
			  deviceInfo.setOs(registrationReq.getDetails().getOs());
			  deviceInfo.setGcmid(registrationReq.getDetails().getGcmId());
			  deviceInfo.setAppName(registrationReq.getDetails().getAppName());
			  
			  deviceInfoRepository.save(deviceInfo);
			  
			  userRepository.save(registration);
			  
			  result.setCode("00000");
			  result.setResult("SUCCESS");
			  result.setData("User Registered Successfully");
			  dr.setResult(result);
				logger.info("The finalResponse{}",new Gson().toJson(result));

			  return;
			  }
			result.setCode("01");
			  result.setResult("FAILURE");
			  result.setData("failed,please fill every field of the registration");
			  dr.setResult(result);
			  return;
			
			
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
