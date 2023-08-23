package com.olive.loan.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_otp_info")
@Data
@Builder
@AllArgsConstructor
@Setter
@Getter
public class OTP {
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;
	@Column(name = "mobilenumber")
    private String mobileNumber;
	@Column(name="status")
    private String status;
	@Column(name="otp")
    private String otp;
	@Column(name="createddate")
	 private Date createdDate;
	@Column(name="trycount")
    private long tryCount=0l;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public long getTryCount() {
		return tryCount;
	}
	public void setTryCount(long tryCount) {
		this.tryCount = tryCount;
	}
	public OTP() {
		super();
	}
	public OTP(String id, String mobileNumber, String status, String otp, Date createdDate, long tryCount) {
		super();
		this.id = id;
		this.mobileNumber = mobileNumber;
		this.status = status;
		this.otp = otp;
		this.createdDate = createdDate;
		this.tryCount = tryCount;
	}
	@Override
	public String toString() {
		return "OTP [id=" + id + ", mobileNumber=" + mobileNumber + ", status=" + status + ", otp=" + otp
				+ ", createdDate=" + createdDate + ", tryCount=" + tryCount + "]";
	}
	
	
	
}
