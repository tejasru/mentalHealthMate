package com.demo.SpringBootRESTWebService.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Diagnosis {
private int diagnosis_id;
private String diagnosis_name;
private Date date;
@OneToMany
private Set<Medications> medication;
@ManyToOne
private MedicalHistory medicalHistory;
public int getDiagnosis_id() {
	return diagnosis_id;
}
public void setDiagnosis_id(int diagnosis_id) {
	this.diagnosis_id = diagnosis_id;
}
public String getDiagnosis_name() {
	return diagnosis_name;
}
public void setDiagnosis_name(String diagnosis_name) {
	this.diagnosis_name = diagnosis_name;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Set<Medications> getMedication() {
	return medication;
}
public void setMedication(Set<Medications> medication) {
	this.medication = medication;
}
public MedicalHistory getMedicalHistory() {
	return medicalHistory;
}
public void setMedicalHistory(MedicalHistory medicalHistory) {
	this.medicalHistory = medicalHistory;
}
@Override
public String toString() {
	return "Diagnosis [diagnosis_id=" + diagnosis_id + ", diagnosis_name=" + diagnosis_name + ", medication="
			+ medication + ", medicalHistory=" + medicalHistory + "]";
}
public Diagnosis(int diagnosis_id, String diagnosis_name, Date date, Set<Medications> medication,
		MedicalHistory medicalHistory) {
	super();
	this.diagnosis_id = diagnosis_id;
	this.diagnosis_name = diagnosis_name;
	this.date = date;
	this.medication = medication;
	this.medicalHistory = medicalHistory;
}
public Diagnosis() {
	super();
}

}
