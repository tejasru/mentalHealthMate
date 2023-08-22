package com.demo.mhm.dto;

public class UserCredentialDTO {
	
	private String uname;
	private String password;
	public UserCredentialDTO(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}
	public UserCredentialDTO() {
		super();
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserCredentialDTO [uname=" + uname + ", password=" + password + "]";
	}
	

}
