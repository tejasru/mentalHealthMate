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
public class DoctorAppointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int docAppointmentId;
private String patientName;
private Date time;
private String uPhone;

private Boolean visitedStatus;
@ManyToOne
private Doctor doctor;
public DoctorAppointment(int docAppointmentId, String patient_name, Date time, String uphone, Boolean visitedStatus,
		Doctor doctor) {
	super();
	this.docAppointmentId = docAppointmentId;
	this.patientName = patient_name;
	this.time = time;
	this.uPhone = uphone;
	this.visitedStatus = visitedStatus;
	this.doctor = doctor;
}
public DoctorAppointment() {
	super();
}
public int getDocAppointment_id() {
	return docAppointmentId;
}
public void setDocAppointment_id(int docAppointment_id) {
	this.docAppointmentId = docAppointment_id;
}
public String getPatient_name() {
	return patientName;
}
public void setPatient_name(String patient_name) {
	this.patientName = patient_name;
}
public Date getTime() {
	return time;
}
public void setTime(Date time) {
	this.time = time;
}
public String getUphone() {
	return uPhone;
}
public void setUphone(String uphone) {
	this.uPhone = uphone;
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
	return "Doctor_Appointment [docAppointment_id=" + docAppointmentId + ", patient_name=" + patientName + ", time="
			+ time + ", uphone=" + uPhone + ", visitedStatus=" + visitedStatus + ", doctor=" + doctor + "]";
}

}