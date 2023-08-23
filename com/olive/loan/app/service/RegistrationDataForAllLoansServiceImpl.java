package com.olive.loan.app.service;

import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.olive.loan.app.dao.RegistrationDataForAllLoansRepo;
import com.olive.loan.app.entity.RegistrationDataForAllLoans;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.VariableRequestBody;

@Service
public class RegistrationDataForAllLoansServiceImpl implements RegistrationDataForAllLoansService {

	
	@Autowired
	private RegistrationDataForAllLoansRepo registrationDataForAllLoansRepo;
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void registerAllTheUserData(VariableRequestBody variableRequestBody, DeferredResult<Result<String>> dr) {

     
		try {
			if(variableRequestBody.getLoanId()!=null&& variableRequestBody.getLoanType()!=null&&variableRequestBody.getDeviceDetails().getMobileNumber()!=null&&variableRequestBody.getData()!=null)
			{
	
			logger.debug("RequestBody:::::::{}",new Gson().toJson(variableRequestBody));	
			
		RegistrationDataForAllLoans  registrationDataForAllLoans=new RegistrationDataForAllLoans();
		
		Result<String>result=new Result<String>();
		
		registrationDataForAllLoans.setLoanId(variableRequestBody.getLoanId());
		registrationDataForAllLoans.setLoanType(variableRequestBody.getLoanType());
		registrationDataForAllLoans.setMobileNumber(variableRequestBody.getDeviceDetails().getMobileNumber());
		registrationDataForAllLoans.setStatus("Initiated");
		registrationDataForAllLoans.setTxnId(UUID.randomUUID().toString());
		registrationDataForAllLoans.setLoanDate(new Date());;
		
		ObjectMapper objectMapper = new ObjectMapper();
       
            String jsonDataString = objectMapper.writeValueAsString(variableRequestBody.getData());
            
	    registrationDataForAllLoans.setUserRegistrationData(jsonDataString);	
		
	    registrationDataForAllLoansRepo.save(registrationDataForAllLoans);
	    
	    System.out.print("Data saved successfully ");
	    result.setCode("00");
	    result.setResult("Data saved successfully");
	    result.setData(jsonDataString); 
	    dr.setResult(result);
	    return;
			}
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			logger.error("An Error occured came to catch block {}",new Gson().toJson(e));
			
		}
		
	
	}

}
