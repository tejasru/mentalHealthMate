package com.demo.SpringBootRESTWebService.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity(name="User_Table")
public class Users {
	@Id
private int id;
private String username;
private String name;
private String email;
private int age;
private String phoneno;
@OneToOne
private Address address;
private String gender;
private String password;
@OneToMany(mappedBy="user")
private List<Appointment> appointment;
@OneToMany(mappedBy="user1")
private List<FeedBack> feedback;
@OneToOne(mappedBy="user2")
private MedicalHistory diagnosis;
@OneToMany(mappedBy="user3")
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
public List<FeedBack> getFeedback() {
	return feedback;
}
public void setFeedback(List<FeedBack> feedback) {
	this.feedback = feedback;
}
public MedicalHistory getDiagnosis() {
	return diagnosis;
}
public void setDiagnosis(MedicalHistory diagnosis) {
	this.diagnosis = diagnosis;
}
public SiteGeneratedReport getsReport() {
	return (SiteGeneratedReport) sReport;
}
public void setsReport(SiteGeneratedReport sReport) {
	this.sReport = (List<SiteGeneratedReport>) sReport;
}
public Users(int id, String username, String name, String email, int age, String phoneno, Address address,
		String gender, String password, List<Appointment> appointment, List<FeedBack> feedback,
		MedicalHistory diagnosis, SiteGeneratedReport sReport) {
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
	this.feedback = feedback;
	this.diagnosis = diagnosis;
	this.sReport = (List<SiteGeneratedReport>) sReport;
}
public Users() {
	super();
}
@Override
public String toString() {
	return "Users [id=" + id + ", username=" + username + ", name=" + name + ", email=" + email + ", age=" + age
			+ ", phoneno=" + phoneno + ", address=" + address + ", gender=" + gender + ", password=" + password
			+ ", appointment=" + appointment + ", feedback=" + feedback + ", diagnosis=" + diagnosis + ", sReport="
			+ sReport + "]";
}


}
