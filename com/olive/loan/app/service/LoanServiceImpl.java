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
import com.olive.loan.app.dao.LoanMasterDataRespository;
import com.olive.loan.app.dao.LoanParameterDataRepository;
import com.olive.loan.app.dao.LoanParamsList;
import com.olive.loan.app.entity.AllLoanParamsList;
import com.olive.loan.app.entity.LoanMasterData;
import com.olive.loan.app.entity.LoanParameterData;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.IdentityDropDownVo;
import com.olive.loan.app.vo.LoanDataReq;
import com.olive.loan.app.vo.LoanDataResponse;
import com.olive.loan.app.vo.LoanParameter;

@Service
public class LoanServiceImpl implements LoanService{
	
	Logger logger=LoggerFactory.getLogger(this.getClass());

	@Autowired
	private LoanMasterDataRespository loanMasterDataRepo;
	
	@Autowired
	LoanParameterDataRepository loanParameterDataRepo;
	
	@Autowired
	private LoanParamsList loanParamsList;
	
	@Async
	@Override
	public void getLoan(LoanDataReq req, DeferredResult<Result<LoanDataResponse>> dr) {
		try {
		LoanDataResponse loanDataResponse= new LoanDataResponse();
		Result<LoanDataResponse> result=new Result<LoanDataResponse>();
		List<LoanParameter> loanParameter=new ArrayList<LoanParameter>();
		List<IdentityDropDownVo>identityDropDownVo=new ArrayList<IdentityDropDownVo>();
		List<IdentityDropDownVo>genderDropDownVo=new ArrayList<IdentityDropDownVo>();
		
		LoanMasterData loanData=loanMasterDataRepo.findByLoanIdAndLoanType(req.getLoanId(), req.getLoanType());
		 
		logger.info("The LoanDataResponse{}",new Gson().toJson(loanData));
		
		
		List<LoanParameterData> paramData=loanParameterDataRepo.findByLoanParamIdInOrderByNumberOfTheParameter(new String[] {loanData.getFirstNameId(),loanData.getLastNameId(),loanData.getMobileNumberId(),loanData.getEmailId(),loanData.getOptions(),loanData.getIdentityNumberId(),loanData.getGenderId(),loanData.getPropertyIdentificationNumberId(),loanData.getAgeId(),loanData.getAddressId(),loanData.getLoanAmountId(),loanData.getPancardNumberParamId(),loanData.getUploadTheProofDocumentOne(),loanData.getUploadTheProofDocumentTwo(),loanData.getUploadTheProofDocumentThree()});
		logger.info("The LoanparamDataResponse{}",new Gson().toJson(paramData));

		System.out.println("The loanparameter group of objects are ::::::::::::::::::::::"+new Gson().toJson(paramData)+"\\n");
		for (LoanParameterData loanParameterData : paramData) {
			
			
			LoanParameter loanParam = new LoanParameter();
			loanParam.setKey(loanParameterData.getKey());
			loanParam.setLabel(loanParameterData.getLabel());
			loanParam.setOptional(loanParameterData.getOptional());
			loanParam.setTitle(loanParameterData.getTitle());
			if(loanParameterData.getValue()!=null)
			loanParam.setValue(loanParameterData.getValue());
			           
			loanParam.setValueModeID(loanParameterData.getValueModeId());
			loanParam.setValueTypeID(loanParameterData.getValueTypeId());
			loanParam.setValidationExpression(loanParameterData.getValidationExpression());
			loanParam.setValidationMessage(loanParameterData.getValidationMessage());
			
			if(("gender").equalsIgnoreCase(loanParameterData.getKey()))
			{
			
				
				
				IdentityDropDownVo identityDropDownvoOptionGenderOptionOne=new IdentityDropDownVo();
				IdentityDropDownVo identityDropDownvoOptionGenderOptionTwo=new IdentityDropDownVo();
				IdentityDropDownVo identityDropDownvoOptionGenderOptionThree=new IdentityDropDownVo();
					
				identityDropDownvoOptionGenderOptionOne.setLabel(loanParameterData.getOptionOne());
				identityDropDownvoOptionGenderOptionOne.setValue(loanParameterData.getOptionOne());
				identityDropDownvoOptionGenderOptionTwo.setLabel(loanParameterData.getOptionTwo());
				identityDropDownvoOptionGenderOptionTwo.setValue(loanParameterData.getOptionTwo());
				identityDropDownvoOptionGenderOptionThree.setLabel(loanParameterData.getOptionThree());
				identityDropDownvoOptionGenderOptionThree.setValue(loanParameterData.getOptionThree());

				
				
				
				genderDropDownVo.add(identityDropDownvoOptionGenderOptionOne);
				genderDropDownVo.add(identityDropDownvoOptionGenderOptionTwo);
				genderDropDownVo.add(identityDropDownvoOptionGenderOptionThree);
				
				loanParam.setList(genderDropDownVo);
				loanParam.setKey(loanParameterData.getKey());
				loanParam.setLabel(loanParameterData.getLabel());
				loanParam.setOptional(loanParameterData.getOptional());
				loanParam.setTitle(loanParameterData.getTitle());
				loanParam.setValue(loanParameterData.getValue());
				loanParam.setValueModeID(loanParameterData.getValueModeId());
				loanParam.setValueTypeID(loanParameterData.getValueTypeId());
				loanParam.setValidationExpression(loanParameterData.getValidationExpression());
				loanParam.setValidationMessage(loanParameterData.getValidationMessage());
				
				
			}
			
             
			if(("identityType").equals(loanParameterData.getKey()))
			{
				IdentityDropDownVo identityDropDownvoOptionOne=new IdentityDropDownVo();
				IdentityDropDownVo identityDropDownvoOptionTwo=new IdentityDropDownVo();
				IdentityDropDownVo identityDropDownvoOptionThree=new IdentityDropDownVo();
				IdentityDropDownVo identityDropDownvoOptionFour=new IdentityDropDownVo();

				identityDropDownvoOptionOne.setLabel(loanParameterData.getOptionOne());
				identityDropDownvoOptionOne.setValue(loanParameterData.getOptionOne());
				identityDropDownvoOptionTwo.setLabel(loanParameterData.getOptionTwo());
				identityDropDownvoOptionTwo.setValue(loanParameterData.getOptionTwo());
				identityDropDownvoOptionThree.setLabel(loanParameterData.getOptionThree());
				identityDropDownvoOptionThree.setValue(loanParameterData.getOptionThree());
				identityDropDownvoOptionFour.setLabel(loanParameterData.getOptionFour());
				identityDropDownvoOptionFour.setValue(loanParameterData.getOptionFour());
				
				identityDropDownVo.add(identityDropDownvoOptionOne);
				identityDropDownVo.add(identityDropDownvoOptionTwo);
				identityDropDownVo.add(identityDropDownvoOptionThree);
				identityDropDownVo.add(identityDropDownvoOptionFour);
				
			
				loanParam.setList(identityDropDownVo);
				loanParam.setKey(loanParameterData.getKey());
				loanParam.setLabel(loanParameterData.getLabel());
				loanParam.setOptional(loanParameterData.getOptional());
				loanParam.setTitle(loanParameterData.getTitle());
				loanParam.setValue(loanParameterData.getValue());
				loanParam.setValueModeID(loanParameterData.getValueModeId());
				loanParam.setValueTypeID(loanParameterData.getValueTypeId());
				loanParam.setValidationExpression(loanParameterData.getValidationExpression());
				loanParam.setValidationMessage(loanParameterData.getValidationMessage());
				
			    
			}
			loanParameter.add(loanParam);
			
			
					}
		
		
		loanDataResponse.setLoanId(req.getLoanId());
		loanDataResponse.setLoanType(req.getLoanType());
		loanDataResponse.setLoanParameter(loanParameter);
		
  // the new implementation of the json object is saving from here 
//		AllLoanParamsList allLoanParamsList=new AllLoanParamsList();
//		allLoanParamsList.setLoanId(req.getLoanId());
//		allLoanParamsList.setLoanType(req.getLoanType());
//		allLoanParamsList.setLoan_params_list(new Gson().toJson(loanParameter));
//  
//		loanParamsList.save(allLoanParamsList);
	
		result.setCode("00000");
		result.setResult("SUCCESS");
		result.setData(loanDataResponse);
		logger.info("The loanDataResponse{}",new Gson().toJson(result));

		dr.setResult(result);
		return;
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}

}
