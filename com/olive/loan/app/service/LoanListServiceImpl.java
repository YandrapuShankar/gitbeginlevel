package com.olive.loan.app.service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import com.google.gson.Gson;
import com.olive.loan.app.dao.LoanListRepository;
import com.olive.loan.app.entity.LoanList;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.util.Util;
import com.olive.loan.app.vo.DeviceDetails;
import com.olive.loan.app.vo.LoanListResponse;

@Service
public class LoanListServiceImpl implements LoanListService {

	@Autowired
	private LoanListRepository loanListRepo;
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
     
	@Async
	@Override
	public void getLoanList(@Valid DeviceDetails req, DeferredResult<Result<List<LoanListResponse>>> dr) {
	try {
		Result<List<LoanListResponse>> result = new Result<List<LoanListResponse>>();
		 Sort sortByUserId = Sort.by(Sort.Direction.ASC, "sortingOrderId");

		List<LoanList> list = loanListRepo.findAll(sortByUserId);
		List<LoanListResponse> listResp = new ArrayList<LoanListResponse>();
		
		logger.info("listResponse::{}",new Gson().toJson(listResp));

//		LoanListResponse loanListResponse = new LoanListResponse();
		for (LoanList loanList : list) {
			LoanListResponse loanListResponse = new LoanListResponse();
			loanListResponse.setLoanId(loanList.getLoanId());
			loanListResponse.setLoanProviderContact(loanList.getLoanProviderContact());
			loanListResponse.setLoanProviderName(loanList.getLoanProviderName());
			loanListResponse.setLoanType(loanList.getLoanType());
			loanListResponse.setMaximumLoanAmount(loanList.getMaximumLoanAmount());
			loanListResponse.setProcessingCharges(loanList.getProcessingCharges());
			loanListResponse.setRateOfInterest(loanList.getRateOfInterest());
			loanListResponse.setRepayment(loanList.getRepayment());
			loanListResponse.setTenureOfTheLoan(loanList.getTenureOfTheLoan());
			loanListResponse.setMaximumAmount(loanList.getMaximumAmount());
			loanListResponse.setInterestRate(loanList.getInterestRate());
			loanListResponse.setTenureOfLoan(loanList.getTenureOfLoan());
			loanListResponse.setAmountRepayment(loanList.getAmountRepayment());
			loanListResponse.setAmountInNumbers(loanList.getAmountInNumbers());
			loanListResponse.setTextData(loanList.getTextData());
			
			String base64EncodedHash = loanList.getTextData();

	        // Decode the Base64-encoded hash
	       byte[] decodedBytes = Base64.getDecoder().decode(base64EncodedHash);

	        // Convert the decoded bytes to a String assuming it's text-based data
			
			
	        String decodedData = new String(decodedBytes);

	        // Print the decoded data
	        System.out.println("Decoded Data: " + decodedData);
		
			
			listResp.add(loanListResponse);
			
		}
		
		
		result.setCode("00000");
		result.setResult("SUCCESS");
		result.setData(listResp);
		
		dr.setResult(result);
		logger.info("listResponse::{}",new Gson().toJson(result));

		
		return;
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xFF & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
	
	
	

}
