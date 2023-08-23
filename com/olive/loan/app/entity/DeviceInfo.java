package com.olive.loan.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Device table should be unique on below parameters mobile, imei, app
 * 
 */
@Entity
@Table(name = "tbl_device_info")
public class DeviceInfo implements java.io.Serializable {

	private static final long serialVersionUID = 6699205308926854346L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="mobilnumber",length = 20)
	public String mobileNumber;
	
	@Column(name="geocode" )
	public String geocode;
	
	@Column(name="location" )
	public String location;
	
	
	@Column(name ="ip" )
	public String ip;
	
	@Column(name = "type")
	public String type;
	
	
	@Column(name = "os" )
	public String os;
	
	
	@Column(name="appid" )
	public String appId;

	@Column(name = "imei" )
	public String imei;

	
	@Column(name = "gcmid" )
	private String gcmid;

	
	@Column(name = "created_by", length = 100)
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	private Date createdDate = new Date();
	
	 @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "change_date")
	private Date changeDate ; 

	@Column(name = "appversion",length = 10)
	private String appVersion;
	 
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = " binddate")
	private Date bindDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bindexpirydate")
	private Date  bindExpiryDate;
	
	@Column(name="deviceId")
	private String deviceId;
	
	@Column(name="appName")
	private String appName;
	 
	

	public long getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getGcmid() {
		return gcmid;
	}

	public void setGcmid(String gcmid) {
		this.gcmid = gcmid;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGeocode() {
		return geocode;
	}

	public void setGeocode(String geocode) {
		this.geocode = geocode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Date getBindDate() {
		return bindDate;
	}

	public void setBindDate(Date bindDate) {
		this.bindDate = bindDate;
	}

	public Date getBindExpiryDate() {
		return bindExpiryDate;
	}

	public void setBindExpiryDate(Date bindExpiryDate) {
		this.bindExpiryDate = bindExpiryDate;
	}

	  public Date getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}  

	 

}
