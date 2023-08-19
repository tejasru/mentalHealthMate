package com.demo.SpringBootRESTWebService.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity(name="User_Table")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String username;
private String name;
private String email;
private int age;
private String phoneno;
@OneToOne(mappedBy="user4",cascade=CascadeType.ALL)
private Address address;
private String gender;
private String password;
@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
private List<Appointment> appointment;
@OneToOne(mappedBy="user2",cascade=CascadeType.ALL)
private MedicalHistory diagnosis;
@OneToMany(mappedBy="user3",cascade=CascadeType.ALL)
private List<SiteGeneratedReport> sReport;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public List<Appointment> getAppointment() {
	return appointment;
}
public void setAppointment(List<Appointment> appointment) {
	this.appointment = appointment;
}
public MedicalHistory getDiagnosis() {
	return diagnosis;
}
public void setDiagnosis(MedicalHistory diagnosis) {
	this.diagnosis = diagnosis;
}
public List<SiteGeneratedReport> getsReport() {
	return sReport;
}
public void setsReport(List<SiteGeneratedReport> sReport) {
	this.sReport = sReport;
}
public Users(int id, String username, String name, String email, int age, String phoneno, Address address,
		String gender, String password, List<Appointment> appointment, MedicalHistory diagnosis,
		List<SiteGeneratedReport> sReport) {
	super();
	this.id = id;
	this.username = username;
	this.name = name;
	this.email = email;
	this.age = age;
	this.phoneno = phoneno;
	this.address = address;
	this.gender = gender;
	this.password = password;
	this.appointment = appointment;
	this.diagnosis = diagnosis;
	this.sReport = sReport;
}
public Users() {
	super();
}
@Override
public String toString() {
	return "Users [id=" + id + ", username=" + username + ", name=" + name + ", email=" + email + ", age=" + age
			+ ", phoneno=" + phoneno + ", address=" + address + ", gender=" + gender + ", password=" + password
			+ ", appointment=" + appointment + ", diagnosis=" + diagnosis + ", sReport=" + sReport + "]";
}




}
