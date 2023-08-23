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
import com.olive.loan.app.vo.LoanStatusRequest;
import com.olive.loan.app.vo.LoanStatusRespVo;
import com.olive.loan.app.vo.LoanStatusResponse;

@Service
public class LoanStatusServiceImpl implements LoanStatusService {

	@Autowired
	private LoanDataRepository loanDataRepo;
	
	
	Logger logger=LoggerFactory.getLogger(this.getClass());


	@Async
	@Override
	public void getLoanStatus(LoanStatusRequest req, DeferredResult<Result<LoanStatusResponse>> dr) {
		try {
		Result<LoanStatusResponse> result = new Result<LoanStatusResponse>();
		List<LoanData>loanData = loanDataRepo.findByMobileNumberAndLoanIdAndLoanType(
				req.getDeviceDetails().getMobileNumber(), req.getLoanId(), req.getLoanType());
		logger.info("The loanData{}::",new Gson().toJson(loanData));
		LoanStatusResponse loanStatusResponse = new LoanStatusResponse();
		List<LoanStatusRespVo>listresp=new ArrayList<LoanStatusRespVo>();
		if (loanData != null) 
			for(LoanData loanDataObject:loanData)
			{
				LoanStatusRespVo loandata=new LoanStatusRespVo();
				loandata.setId(loanDataObject.getId());
				loandata.setLoanId(loanDataObject.getLoanId());
				loandata.setLoanType(loanDataObject.getLoanType());
				loandata.setTxnId(loanDataObject.getTxnId());
				loandata.setStatus(loanDataObject.getStatus());
				loandata.setLoanAmount(loanDataObject.getLoanAmount());
				listresp.add(loandata) ;				
			}
		
		loanStatusResponse.setLoanData(listresp);
		result.setCode("00000");
		result.setResult("SUCCESS");
		result.setData(loanStatusResponse);
		dr.setResult(result);
		logger.info("The finalLoanStatusResponse{}::",new Gson().toJson(result));
		return;
	}
		
	catch (Exception e) {
		e.printStackTrace();
	}
	}
}
