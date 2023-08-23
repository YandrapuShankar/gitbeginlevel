package com.olive.loan.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.olive.loan.app.dao.RegistrationDataForAllLoansRepo;
import com.olive.loan.app.entity.RegistrationDataForAllLoans;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.DeviceDetails;
import com.olive.loan.app.vo.LoanHistoryResponse;

@Service
public class LoanHistoryNewServiceImpl implements LoanHistoryNewService {
	
	@Autowired 
	 private RegistrationDataForAllLoansRepo registrationDataForAllLoansRepo;

	@Override
	public void getTheAppliedLoans(DeviceDetails req, DeferredResult<Result<List<LoanHistoryResponse>>> dr) {
		
     try {
    	 if(req.getMobileNumber()!=null)
    	 {
    	 List<RegistrationDataForAllLoans> listofRegistrationDataForAllLoans=registrationDataForAllLoansRepo.findByMobileNumberOrderByLoanDateDesc(req.getMobileNumber());
    		 
    	 Result<List<LoanHistoryResponse>> result = new Result<List<LoanHistoryResponse>>();
    	 
    	 List<LoanHistoryResponse>list=new ArrayList<LoanHistoryResponse>();
    		for(RegistrationDataForAllLoans registrationDataForAllLoans:listofRegistrationDataForAllLoans) 
    		{
    			
    			
    		String jsonObject=registrationDataForAllLoans.getUserRegistrationData();
    		
            ObjectMapper objectMapper = new ObjectMapper();

            Map<String, Object> jsonMap = objectMapper.readValue(jsonObject, new TypeReference<Map<String, Object>>() {});
               
    			String amount =(String)jsonMap.get("Amount");
    			
    			LoanHistoryResponse loanHistoryResponse=new LoanHistoryResponse();
    			loanHistoryResponse.setLoanAmount(amount);
    			loanHistoryResponse.setLoanType(registrationDataForAllLoans.getLoanType());
    			loanHistoryResponse.setStatus(registrationDataForAllLoans.getStatus());
    			loanHistoryResponse.setTxnId(registrationDataForAllLoans.getTxnId());
                list.add(loanHistoryResponse);
    		}
    		 result.setCode("00");
    		 result.setResult("success");
    		 result.setData(list);
    		 dr.setResult(result);
    		 return;
    		 
    	 }
    	 
 
     }
     catch(Exception e)
     {
    	 
    	 e.printStackTrace();
     }
	}

}
