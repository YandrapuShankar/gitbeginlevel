package com.olive.loan.app.vo;

public class LoginReq {

	private String mobilenumber;
	private String password;
	public LoginReq(String mobilenumber, String password) {
		super();
		this.mobilenumber = mobilenumber;
		this.password = password;
	}
	public LoginReq() {
		super();
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginReq [mobilenumber=" + mobilenumber + ", password=" + password + "]";
	}
	
	
}
