package com.olive.loan.app.vo;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

public class DeviceDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "mobile number field is mandatory")
	@NotEmpty(message = "mobile number field is mandatory")
	//@Length(min = 14,max = 14,message = "Invalid length of mobileNumber")
	@Pattern(regexp = "^[0]{1}[0]{1}[2]{1}[0]{1}[0-9]{10}",message = "Invalid mobile number")
	public String mobileNumber;
	
	@Length(min = 1,max = 255,message = "Invalid geocode")
	@Pattern(regexp = "^(-?\\d+(\\.\\d+)?),\\s*(-?\\d+(\\.\\d+)?)$",message = "Invalid geocode")
	@NotNull(message = "geoCode field is mandatory")
	public String geoCode;
	
	@Length(min = 1,max = 255,message = "Invalid location")
	@NotNull(message = "location field is mandatory")
	public String location;
	
	@Length(min = 1,max = 255,message = "Invalid ip")
	@Pattern(regexp = "^(([1-9]?\\d|1\\d\\d|2[0-5][0-5]|2[0-4]\\d)\\.){3}([1-9]?\\d|1\\d\\d|2[0-5][0-5]|2[0-4]\\d)$",message = "Invalid ip")
	@NotNull(message = "ip field is mandatory")
	public String ip;
	
	@Length(min = 1,max = 255,message = "Invalid type")
	@NotEmpty(message = "type field is mandatory")
	public String type;
	
	@NotNull(message = "deviceId field is mandatory")
	@Length(min = 1,max = 255,message = "Invalid deviceId")
	@NotEmpty(message = "deviceId field is mandatory")
	@Pattern(regexp = "^[|A-Za-z0-9]*$",message = "Invalid deviceId")
	public String deviceId;
	
	@Length(min = 1,max = 255,message = "Invalid os")
	@Pattern(regexp = "^[A-Za-z0-9\\. ]*$",message = "Invalid os")
	@NotEmpty(message = "os field is mandatory")
	public String os;
	
	@Length(min = 1,max = 255,message = "Invalid appId")
	@Pattern(regexp = "^[A-Za-z0-9\\.]*$",message = "Invalid appId")
	@NotEmpty(message = "appId field is mandatory")
	public String appId;
	
	@Length(min = 1,max = 255,message = "Invalid appName")
	@Pattern(regexp = "^[0-9A-Za-z\\.]*$",message = "Invalid appName")
	@NotEmpty(message = "appName field is mandatory")
	public String appName;
	 
	@Length(min = 1,max = 10,message = "Invalid appVersion")
	@NotEmpty(message = "appVersion field is mandatory")
	@Pattern(regexp = "^[0-9\\.]*$",message = "Invalid appVersion")
	public String appVersion;
	
	@Length(min = 1,max = 255,message = "Invalid gcmId")
	@NotEmpty(message = "gcmId field is mandatory")
	public String gcmId;
	
	
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGeoCode() {
		return geoCode;
	}

	public void setGeoCode(String geoCode) {
		this.geoCode = geoCode;
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

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	

	public String getGcmId() {
		return gcmId;
	}

	public void setGcmId(String gcmId) {
		this.gcmId = gcmId;
	}
	
	public boolean validateRequestAppId(String appId) {
		return this.appId.equals(appId);
	}

	@Override
	public String toString() {
		return "DeviceDetails [mobileNumber=" + mobileNumber + ", geocode=" + geoCode + ", location=" + location
				+ ", ip=" + ip + ", type=" + type + ", deviceId=" + deviceId + ", os=" + os + ", appId=" + appId
				+ ", appName=" + appName + "]";
	}
	
	
}
