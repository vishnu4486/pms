package com.pms.dto;

public class LoginDto {

	private String userName;
	private String password;
//	public LoginDto(String userName, String password) {
//		super();
//		this.userName = userName;
//		this.password = password;
//	}
//	public LoginDto() {
//		super();
//	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
