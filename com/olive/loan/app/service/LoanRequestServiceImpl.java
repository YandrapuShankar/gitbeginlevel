package com.olive.loan.app.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import com.google.gson.Gson;
import com.olive.loan.app.dao.LoanDataRepository;
import com.olive.loan.app.dao.LoanListRepository;
import com.olive.loan.app.entity.LoanData;
import com.olive.loan.app.entity.LoanList;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.util.ZipUtil;
import com.olive.loan.app.vo.LoanRequestDetails;

@Service
public class LoanRequestServiceImpl implements LoanRequestService{
	
	
	@Autowired
	private LoanDataRepository loanDataRepo;
	
	@Autowired
	private LoanListRepository loanListRepository;

	Logger logger=LoggerFactory.getLogger(this.getClass());

	
	@Async
	@Override
	public void sendLoanReq(LoanRequestDetails req, DeferredResult<Result<String>> dr) {
	try {
		
LoanList loanlist=loanListRepository.findByLoanIdAndLoanType(req.getLoanReq().getLoanId(),req.getLoanReq().getLoanType());

     logger.info("The loanListResponse{}",new Gson().toJson(loanlist));
    	LoanData loanData = new LoanData();	
    	Result<String> result = new Result<String>();
    	
    	
    	BigDecimal reqamount = new BigDecimal(req.getLoanAmount());
    	String amountInNumbers=String.valueOf(loanlist.getAmountInNumbers());
    	
    	logger.info("reqAmount {}:::::::    amountInRupees {}:::::: ",reqamount,amountInNumbers);
    	System.out.println("the loanAmout is ::::::::::::::::::"+req.getLoanAmount());
    	logger.info("LoanRequeatBody{} ",new Gson().toJson(req));
    	int amountResult=reqamount.compareTo(loanlist.getAmountInNumbers());
    	                            
    	if(amountResult<0||amountResult==0)
    	{

        	loanData.setLoanType(req.getLoanReq().getLoanType());
        	loanData.setLoanAmount(req.getLoanAmount());
        	loanData.setLoanId(req.getLoanReq().getLoanId());
        	loanData.setTxnId(UUID.randomUUID().toString());
        	loanData.setLoanDate(new Date());
        	loanData.setFirstName(req.getFirstName());
        	loanData.setLastName(req.getLastName());
        	loanData.setAge(req.getAge());
        	loanData.setAddress(req.getAddress());
        	loanData.setMobileNumber(req.getDeviceDetails().getMobileNumber());
        	loanData.setEmail(req.getEmail());
        	loanData.setGender(req.getGender());
        	loanData.setIdentityNumber(req.getIdentityNumber());
        	loanData.setPropertyIdentificationNumber(req.getPropertyIdentificationNumber());
        	loanData.setStatus("INITIATED");
        	loanData.setIdentityType(req.getIdentityType());
        	loanData.setLoanAmount(req.getLoanAmount());
        	loanData.setPancardNumber(req.getPancardNumber());
        	//logger.debug("the Compressed Data is:::::::::::::::::{}",imageData);
        	
        	
        	loanData.setImageData(req.getImageHashedData());
//        	//loanData.setUploadDocumentProofOne(req.getUploadDocumentProofOne());
//        	loanData.setUploadDocumentProofTwo(req.getUploadDocumentProofTwo());
//        	loanData.setUploadDocumentProofThree(req.getUploadDocumentProofThree());
        	loanDataRepo.save(loanData);
        	result.setCode("00000");
        	result.setResult("SUCCESS");
        	result.setData("Data saved successfully");
        	dr.setResult(result);
        	logger.info("The loanListResponse{}",new Gson().toJson(result));
        	return;
        
    	}
    	else {
    		
    		result.setCode("01");
    		result.setResult("failure");
    		result.setData("The amount should be less than or equal to "+loanlist.getAmountInNumbers());
    		dr.setResult(result);
    	     logger.info("The loanListResponse{}",new Gson().toJson(result));
    		return;
    		
    
    	}
    	

	}catch (Exception e) {
		e.printStackTrace();
		logger.error("error",e.getMessage());
	}
	}

}
