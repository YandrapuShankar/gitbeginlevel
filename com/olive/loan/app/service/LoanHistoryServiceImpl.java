package com.olive.loan.app.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import com.google.gson.Gson;
import com.olive.loan.app.dao.LoanDataRepository;
import com.olive.loan.app.entity.LoanData;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.DeviceDetails;
import com.olive.loan.app.vo.LoanHistoryResponse;

@Service
public class LoanHistoryServiceImpl implements LoanHistoryService {

	@Autowired
	private LoanDataRepository loanDataRepo;
	
    
	Logger logger=LoggerFactory.getLogger(this.getClass());

	
	
	
	@Async
	@Override
	public void getLoanHistory(DeviceDetails req, DeferredResult<Result<List<LoanHistoryResponse>>> dr) {
		try{
		Result<List<LoanHistoryResponse>> result = new Result<List<LoanHistoryResponse>>();
		List<LoanHistoryResponse> list = new ArrayList<LoanHistoryResponse>();
		List<LoanData> loanData = loanDataRepo.findByMobileNumberOrderByLoanDateDesc(req.getMobileNumber());
		logger.info("The LoanDataResponse{}",new Gson().toJson(loanData));
				for (LoanData loan : loanData) {
					LoanHistoryResponse loanHistoryResponse = new LoanHistoryResponse();
					loanHistoryResponse.setLoanAmount(loan.getLoanAmount());
					loanHistoryResponse.setLoanType(loan.getLoanType());
					loanHistoryResponse.setStatus(loan.getStatus());
					loanHistoryResponse.setTxnId(loan.getTxnId());
					//loanHistoryResponse.setLoanDate(loan.getLoanDate());
					list.add(loanHistoryResponse);
				}
				result.setCode("00000");
				result.setResult("SUCCESS");
				result.setData(list);
				dr.setResult(result);
				logger.info("The loanHistoryResponse{}",new Gson().toJson(result));

			}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
