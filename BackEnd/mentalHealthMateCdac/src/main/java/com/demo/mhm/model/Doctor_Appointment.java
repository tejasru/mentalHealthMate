package com.demo.mhm.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Table;



@Entity
@Table(name="Doc_Appointment")
public class Doctor_Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int docAppointment_id;
private String patient_name;
private Date time;
private String uphone;

private Boolean visitedStatus;
@ManyToOne
private Doctor doctor;
public Doctor_Appointment(int docAppointment_id, String patient_name, Date time, String uphone, Boolean visitedStatus,
		Doctor doctor) {
	super();
	this.docAppointment_id = docAppointment_id;
	this.patient_name = patient_name;
	this.time = time;
	this.uphone = uphone;
	this.visitedStatus = visitedStatus;
	this.doctor = doctor;
}
public Doctor_Appointment() {
	super();
}
public int getDocAppointment_id() {
	return docAppointment_id;
}
public void setDocAppointment_id(int docAppointment_id) {
	this.docAppointment_id = docAppointment_id;
}
public String getPatient_name() {
	return patient_name;
}
public void setPatient_name(String patient_name) {
	this.patient_name = patient_name;
}
public Date getTime() {
	return time;
}
public void setTime(Date time) {
	this.time = time;
}
public String getUphone() {
	return uphone;
}
public void setUphone(String uphone) {
	this.uphone = uphone;
}
public Boolean getVisitedStatus() {
	return visitedStatus;
}
public void setVisitedStatus(Boolean visitedStatus) {
	this.visitedStatus = visitedStatus;
}
public Doctor getDoctor() {
	return doctor;
}
public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}
@Override
public String toString() {
	return "Doctor_Appointment [docAppointment_id=" + docAppointment_id + ", patient_name=" + patient_name + ", time="
			+ time + ", uphone=" + uphone + ", visitedStatus=" + visitedStatus + ", doctor=" + doctor + "]";
}

}