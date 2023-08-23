package com.demo.mhm.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_Appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int appointment_id;
private String dName;
private String dphoneno;
private Date time;
private String status;
@OneToOne(cascade=CascadeType.REMOVE)
private UserPayment payment;
@ManyToOne
private Users user2;
public Appointment(int appointment_id, String dName, String dphoneno, Date time, String status, UserPayment payment,
		Users user2) {
	super();
	this.appointment_id = appointment_id;
	this.dName = dName;
	this.dphoneno = dphoneno;
	this.time = time;
	this.status = status;
	this.payment = payment;
	this.user2 = user2;
}
public Appointment() {
	super();
}
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
public Users getUser2() {
	return user2;
}
public void setUser2(Users user2) {
	this.user2 = user2;
}
@Override
public String toString() {
	return "Appointment [appointment_id=" + appointment_id + ", dName=" + dName + ", dphoneno=" + dphoneno + ", time="
			+ time + ", status=" + status + ", payment=" + payment + ", user2=" + user2 + "]";
}

}
