package com.demo.mhm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="medication_table")
public class Medications {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int medication_id;
private String medicationName;
@ManyToOne
private Diagnosis diagnosis;
public Medications(int medication_id, String medicationName, Diagnosis diagnosis) {
	super();
	this.medication_id = medication_id;
	this.medicationName = medicationName;
	this.diagnosis = diagnosis;
}
public Medications() {
	super();
}
public int getMedication_id() {
	return medication_id;
}
public void setMedication_id(int medication_id) {
	this.medication_id = medication_id;
}
public String getMedicationName() {
	return medicationName;
}
public void setMedicationName(String medicationName) {
	this.medicationName = medicationName;
}
public Diagnosis getDiagnosis() {
	return diagnosis;
}
public void setDiagnosis(Diagnosis diagnosis) {
	this.diagnosis = diagnosis;
}
@Override
public String toString() {
	return "Medications [medication_id=" + medication_id + ", medicationName=" + medicationName + ", diagnosis="
			+ diagnosis + "]";
}


}
