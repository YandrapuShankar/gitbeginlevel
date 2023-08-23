package com.olive.loan.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.olive.loan.app.dao.LoanParamsList;
import com.olive.loan.app.entity.AllLoanParamsList;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.LoanDataReq;


@Service
public class AllLoansParamsListServiceImpl implements AllLoanParamsListService {
	
	
	@Autowired
	private LoanParamsList loanParamsList;
	
	Logger logger=LoggerFactory.getLogger(this.getClass());

	@Override
	public void getAllLoansParamsList(LoanDataReq req, DeferredResult<Result<JsonNode>> dr) {
		
	try {
		
		if(req.getLoanId()!=null&&req.getDeviceDetails().getMobileNumber()!=null&&req.getLoanType()!=null)
		{
			
			logger.debug("LoanDataReqBody is::::::::::::{}",new Gson().toJson(req));
			AllLoanParamsList allLoanParamsList=loanParamsList.findFirstByLoanIdAndLoanTypeOrderByVersionIdDesc(req.getLoanId(), req.getLoanType());
			
			logger.debug("allLoanParamsList from the db:::::::::::::::::{}",new Gson().toJson(allLoanParamsList));
			
			
			Result<JsonNode> result = new Result<JsonNode>();
			 // Step 2: Convert the record into a JSON object
	        ObjectMapper objectMapper = new ObjectMapper();
	        JsonNode recordJson = objectMapper.convertValue(allLoanParamsList, JsonNode.class);

	        // Step 3: Build the response JSON object
	        ObjectMapper responseMapper = new ObjectMapper();
	        JsonNode responseJson = responseMapper.createObjectNode()
	                .set("data", recordJson); // Set the recordJson as the value of the "data" field
	      
			System.out.println("responseJson");
			result.setCode("00");
			result.setResult("SUCCESS");
			result.setData(recordJson);
			logger.debug("LoanDataResponse is::::::::::{}",new Gson().toJson(responseJson));
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
