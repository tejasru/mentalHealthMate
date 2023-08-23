package com.demo.mhm.dto;

public class DoctorCredentialDTO {
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DoctorCredentialDTO [username=" + username + ", password=" + password + "]";
	}
	public DoctorCredentialDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public DoctorCredentialDTO() {
		super();
	}
	

}
