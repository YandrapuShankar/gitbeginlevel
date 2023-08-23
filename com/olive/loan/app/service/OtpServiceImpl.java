package com.olive.loan.app.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import com.google.gson.Gson;
import com.olive.loan.app.dao.OtpRepository;
import com.olive.loan.app.dao.UserRespository;
import com.olive.loan.app.entity.OTP;
import com.olive.loan.app.entity.RegistrationData;
import com.olive.loan.app.util.OTPService;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.util.Util;
import com.olive.loan.app.vo.ChangePassWordReq;
import com.olive.loan.app.vo.OtpRequestVo;
import com.olive.loan.app.vo.OtpResponse;
import com.olive.loan.app.vo.VerifyOtpReq;

@Service
public class OtpServiceImpl implements OtpService {
	
	
	@Autowired
	private UserRespository userRespository;
	
	
	@Autowired
	private OtpRepository otpRepository;
	
	@Autowired
	Environment env;
	
	@Autowired
	private OTPService otpservice;
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	private UserRespository userRepository;

	

	@Override
	public void otpSave(OtpRequestVo otpRequestVo, DeferredResult<Result<OtpResponse>> dr) {
		Result<OtpResponse>result=new Result<OtpResponse>();
		
		//logger.info("mobileNumber{}",otpRequestVo.getDeviceDetails().getMobileNumber());
		
		Date dataAndTime=new Date();
		try {
		 
			
			RegistrationData registrationData= userRepository.findByMobileNumber(otpRequestVo.getDeviceDetails().getMobileNumber());
		if(otpRequestVo.getDeviceDetails().getMobileNumber()!=null&&registrationData!=null)
		{
			
			String	mobileNumber = otpRequestVo.getDeviceDetails().getMobileNumber().length() == 10 ? "91" + otpRequestVo.getDeviceDetails().getMobileNumber() : otpRequestVo.getDeviceDetails().getMobileNumber();
			OTP oTP=new OTP();
			int otp=otpservice.generateOTP(mobileNumber);
			String OTP = Integer.toString(otp);
			
			oTP.setMobileNumber(mobileNumber);
			oTP.setCreatedDate(dataAndTime);
			oTP.setOtp(Util.getBase64Encoded(OTP));
			oTP.setStatus("ACTIVE");
			otpRepository.save(oTP);
			
			OtpResponse otpResponse=new OtpResponse();
	        
			otpResponse.setDateAndTime(dataAndTime);
			otpResponse.setOtp(OTP);
			otpResponse.setStatus("ACTIVE");
			result.setCode("00");
			result.setResult("otp sent successfully");
			result.setData(otpResponse);
			dr.setResult(result);
		logger.info("OtpSendResponse{} ",otpResponse);	
			return;
		
		}
		else {
			
			result.setCode("01");
			result.setResult("failed,please enter the registered mobile number");
			result.setData(null);
			dr.setResult(result);
			
			return;
			
		}
		
		
		
		}
		
	catch(Exception e)
		{
		
		e.printStackTrace();
		}
		
	}



	@Override
	public void verifyOtp(VerifyOtpReq verifyOtpReq, DeferredResult<Result<String>> dr) {
		String otp= verifyOtpReq.getOtp();
		System.out.println("otpReq.otp:::::::::::::::::::::::::::::::"+otp);
		
		
	String	mobileNumber = verifyOtpReq.getDeviceDetails().getMobileNumber().length() == 10 ? "91" + verifyOtpReq.getDeviceDetails().getMobileNumber() : verifyOtpReq.getDeviceDetails().getMobileNumber();
		System.out.println("otpReq.mobileNumber:::::::::::::::::::::::::::::::"+mobileNumber);
		
		String validTime=env.getProperty("validTime");
		Result<String> result = new Result<String>();
				try {
			if(otp != null && mobileNumber != null){
				System.out.println();
				String unHashedOtp=Util.getBase64Encoded(otp);
		
			System.out.println("the unhased password is::"+unHashedOtp);	
				
			OTP	otp1= otpRepository.findByOtpAndMobileNumberOrderByCreatedDateDesc(unHashedOtp,mobileNumber);
			
			logger.info("The Otp records{} ",new Gson().toJson(otp1));
		
				System.out.println("otp1:::::::::::::::::::::::::::::::"+otp1);
				 if (verifyOtpReq.getOtp().equals(Util.getBase64Decoded(otp1.getOtp()))&&Util.getMinutesTimeDiff(otp1.getCreatedDate(), new Date())<=Integer.parseInt(validTime)){
					 
					 result.setCode("00");
						result.setResult("sucess");
						result.setData("Otp verification done sucessfully");
						otp1.setStatus("used");
						dr.setResult(result);
						otpRepository.save(otp1);
						
						return;
				 }else if(Util.getMinutesTimeDiff(otp1.getCreatedDate(), new Date()) >Integer.parseInt(validTime)){
					 
					    
					    otp1.setStatus("expired");
					    otpRepository.save(otp1);
						result.setCode("01");
						result.setResult("failue");
						result.setData("otp got expired ");
						dr.setResult(result);
						logger.info("The Otp verifyResponse{} ",new Gson().toJson(result));
						return;
						
					}else{
						result.setCode("01");
						result.setResult("failue");
						result.setData("Otp verification not done sucessfully ");
						dr.setResult(result);
						logger.info("The Otp verifyResponse{} ",new Gson().toJson(result));
						return;
					}
				
			}else{
				result.setCode("01");
				result.setResult("failue");
				result.setData("Otp not Found ");
				dr.setResult(result);
				logger.info("The Otp verifyResponse{} ",new Gson().toJson(result));
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return;
	}



	@Override
	public void changePassWord(ChangePassWordReq changePassWordReq, DeferredResult<Result<String>> dr) {
		try {
			
			Result<String>result=new Result<String>();
			
			if(changePassWordReq.getDeviceDetails().getMobileNumber()!=null&&changePassWordReq.getChangePassword()!=null&&changePassWordReq.getConformPassWord()!=null)
			{
				
				if(changePassWordReq.getChangePassword().equals(changePassWordReq.getConformPassWord()))
						{
				String mobileNumber=changePassWordReq.getDeviceDetails().getMobileNumber();
				String passWord=changePassWordReq.getConformPassWord();
				RegistrationData registrationData=userRespository.findByMobileNumber(mobileNumber);
				
				logger.info("the registrationdata{} ",new Gson().toJson(registrationData));
				
				registrationData.setUserPassWord(passWord);
				userRespository.save(registrationData);
				
				result.setCode("00");
				result.setResult("success");
				result.setData("password changed  successfully");
				dr.setResult(result);
				 return;
						}
				else 
				{
					result.setCode("01");
					result.setResult("failure");
					result.setData("password and confirm password should be same");
					dr.setResult(result);
					return;
					
				}
				
				
				
			}
			else {
				
				result.setCode("01");
				result.setResult("failure");
				result.setData("change password failed successfully");
				dr.setResult(result);
				
				
				
				
			}
			
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return;
		
		
	}
	
	
	
	

}
