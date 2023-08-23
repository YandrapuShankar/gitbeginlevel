package com.olive.loan.app.vo;

import java.util.List;

public class LoanParameter {

	public LoanParameter() {
		super();
	}

	public String label;

	public String title;

	public int valueModeID;

	public int valueTypeID;

	public int optional;

	public String key;

	public String value;
	
	public String validationExpression;

	public String validationMessage;

    public List<IdentityDropDownVo>list;
    
    
        
	public LoanParameter(String value) {
		this.value=value;
	}

	

	public List<IdentityDropDownVo> getList() {
		return list;
	}



	public void setList(List<IdentityDropDownVo> list) {
		this.list = list;
	}



	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getValueModeID() {
		return valueModeID;
	}

	public void setValueModeID(int valueModeID) {
		this.valueModeID = valueModeID;
	}

	public int getValueTypeID() {
		return valueTypeID;
	}

	public void setValueTypeID(int valueTypeID) {
		this.valueTypeID = valueTypeID;
	}

	public int getOptional() {
		return optional;
	}

	public void setOptional(int optional) {
		this.optional = optional;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValidationExpression() {
		return validationExpression;
	}

	public void setValidationExpression(String validationExpression) {
		this.validationExpression = validationExpression;
	}

	public String getValidationMessage() {
		return validationMessage;
	}

	public void setValidationMessage(String validationMessage) {
		this.validationMessage = validationMessage;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
