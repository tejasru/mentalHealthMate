package com.demo.SpringBootRESTWebService.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_Appointment")
public class Appointment {
	@Id
	
private int appointment_id;
private String dName;
private String dphoneno;
private Date time;
private String status;
@OneToOne
private UserPayment payment;
@ManyToOne
private Users user;
public int getAppointment_id() {
	return appointment_id;
}
public void setAppointment_id(int appointment_id) {
	this.appointment_id = appointment_id;
}
public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
public String getDphoneno() {
	return dphoneno;
}
public void setDphoneno(String dphoneno) {
	this.dphoneno = dphoneno;
}
public Date getTime() {
	return time;
}
public void setTime(Date time) {
	this.time = time;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public UserPayment getPayment() {
	return payment;
}
public void setPayment(UserPayment payment) {
	this.payment = payment;
}
public Users getUser() {
	return user;
}
public void setUser(Users user) {
	this.user = user;
}
@Override
public String toString() {
	return "Appointment [appointment_id=" + appointment_id + ", dName=" + dName + ", dphoneno=" + dphoneno + ", status="
			+ status + ", payment=" + payment + ", user=" + user + "]";
}
public Appointment(int appointment_id, String dName, String dphoneno, Date time, String status, UserPayment payment,
		Users user) {
	super();
	this.appointment_id = appointment_id;
	this.dName = dName;
	this.dphoneno = dphoneno;
	this.time = time;
	this.status = status;
	this.payment = payment;
	this.user = user;
}
public Appointment() {
	super();
}



}
