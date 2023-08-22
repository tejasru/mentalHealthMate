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
private int doctor_id;
private String duserName;
private String doctor_name;
private String qualification;
private String email;
private String phone_no;
private String password;
public Doctor(int doctor_id, String duserName, String doctor_name, String qualification, String email, String phone_no,
		String password) {
	super();
	this.doctor_id = doctor_id;
	this.duserName = duserName;
	this.doctor_name = doctor_name;
	this.qualification = qualification;
	this.email = email;
	this.phone_no = phone_no;
	this.password = password;
}
public Doctor() {
	super();
}
public int getDoctor_id() {
	return doctor_id;
}
public void setDoctor_id(int doctor_id) {
	this.doctor_id = doctor_id;
}
public String getDuserName() {
	return duserName;
}
public void setDuserName(String duserName) {
	this.duserName = duserName;
}
public String getDoctor_name() {
	return doctor_name;
}
public void setDoctor_name(String doctor_name) {
	this.doctor_name = doctor_name;
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
	return phone_no;
}
public void setPhone_no(String phone_no) {
	this.phone_no = phone_no;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Doctor [doctor_id=" + doctor_id + ", duserName=" + duserName + ", doctor_name=" + doctor_name
			+ ", qualification=" + qualification + ", email=" + email + ", phone_no=" + phone_no + ", password="
			+ password + "]";
}

}