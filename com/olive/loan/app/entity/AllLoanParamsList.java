package com.olive.loan.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name="tbl_all_loans_params")
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class AllLoanParamsList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="loan_id")
	private String loanId;
	
	@Column(name="loan_type")
	private String loanType;
	@Column(name="version_id") 
	private int versionId;
	
	@Column(name = "data_json", columnDefinition = "jsonb")
	 @Type(type = "jsonb")
	 private String loanParamsList;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public int getVersionId() {
		return versionId;
	}

	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}

	
	public String getLoanParamsList() {
		return loanParamsList;
	}

	public void setLoanParamsList(String loanParamsList) {
		this.loanParamsList = loanParamsList;
	}

	public AllLoanParamsList(long id, String loanId, String loanType, int versionId, String loanParamsList) {
		super();
		this.id = id;
		this.loanId = loanId;
		this.loanType = loanType;
		this.versionId = versionId;
		this.loanParamsList = loanParamsList;
	}

	public AllLoanParamsList() {
		super();
	}

	@Override
	public String toString() {
		return "AllLoanParamsList [id=" + id + ", loanId=" + loanId + ", loanType=" + loanType + ", versionId="
				+ versionId + ", loanParamsList=" + loanParamsList + "]";
	}

    
	

}
