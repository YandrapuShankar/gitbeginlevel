package com.olive.loan.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_loan_parameter_data")
public class LoanParameterData {
	@Id
	@Column(name = "loan_param_id")
	private String loanParamId;

	@Column(name = "label")
	private String label;

	@Column(name = "title")
	private String title;

	@Column(name = "value_mode_id")
	private int valueModeId;

	@Column(name = "value_type_id")
	private int valueTypeId;

	@Column(name = "optional")
	private int optional;

	@Column(name = "key")
	private String key;

	@Column(name = "value")
	private String value;

	@Column(name = "validation_expression")
	private String validationExpression;

	@Column(name = "validation_message")
	private String validationMessage;
	
	
	@Column(name="option_one")
	private String optionOne;
	
	@Column(name="option_two")
	private String optionTwo;
	
	@Column(name="option_three")
	private String optionThree;
	
	@Column(name="option_four")
	private String optionFour;

	@Column(name="number_of_the_parameter")
	private int numberOfTheParameter;

	public String getLoanParamId() {
		return loanParamId;
	}

	public void setLoanParamId(String loanParamId) {
		this.loanParamId = loanParamId;
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

	public int getValueModeId() {
		return valueModeId;
	}

	public void setValueModeId(int valueModeId) {
		this.valueModeId = valueModeId;
	}

	public int getValueTypeId() {
		return valueTypeId;
	}

	public void setValueTypeId(int valueTypeId) {
		this.valueTypeId = valueTypeId;
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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

	public String getOptionOne() {
		return optionOne;
	}

	public void setOptionOne(String optionOne) {
		this.optionOne = optionOne;
	}

	public String getOptionTwo() {
		return optionTwo;
	}

	public void setOptionTwo(String optionTwo) {
		this.optionTwo = optionTwo;
	}

	public String getOptionThree() {
		return optionThree;
	}

	public void setOptionThree(String optionThree) {
		this.optionThree = optionThree;
	}

	public String getOptionFour() {
		return optionFour;
	}

	public void setOptionFour(String optionFour) {
		this.optionFour = optionFour;
	}

	public int getNumberOfTheParameter() {
		return numberOfTheParameter;
	}

	public void setNumberOfTheParameter(int numberOfTheParameter) {
		this.numberOfTheParameter = numberOfTheParameter;
	}
	

	
}
