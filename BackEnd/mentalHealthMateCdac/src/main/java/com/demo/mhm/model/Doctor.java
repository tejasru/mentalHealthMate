package com.demo.mhm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctor_table")
public class Doctor {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int doctorId;
private String dUserName;
private String doctorName;
private String qualification;
private String email;
private String phoneNo;
private String password;
public Doctor(int doctor_id, String duserName, String doctor_name, String qualification, String email, String phone_no,
		String password) {
	super();
	this.doctorId = doctor_id;
	this.dUserName = duserName;
	this.doctorName = doctor_name;
	this.qualification = qualification;
	this.email = email;
	this.phoneNo = phone_no;
	this.password = password;
}
public Doctor() {
	super();
}
public int getDoctor_id() {
	return doctorId;
}
public void setDoctor_id(int doctor_id) {
	this.doctorId = doctor_id;
}
public String getDuserName() {
	return dUserName;
}
public void setDuserName(String duserName) {
	this.dUserName = duserName;
}
public String getDoctor_name() {
	return doctorName;
}
public void setDoctor_name(String doctor_name) {
	this.doctorName = doctor_name;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone_no() {
	return phoneNo;
}
public void setPhone_no(String phone_no) {
	this.phoneNo = phone_no;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Doctor [doctorId=" + doctorId + ", dUserName=" + dUserName + ", doctorName=" + doctorName
			+ ", qualification=" + qualification + ", email=" + email + ", phoneNo=" + phoneNo + ", password="
			+ password + "]";
}


}