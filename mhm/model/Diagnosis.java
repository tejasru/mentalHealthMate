package com.demo.mhm.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="diagnosis_table")
public class Diagnosis {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int diagnosis_id;
private String diagnosis_name;
private Date date;
@ManyToOne
private MedicalHistory med;
public Diagnosis(int diagnosis_id, String diagnosis_name, Date date, MedicalHistory med) {
	super();
	this.diagnosis_id = diagnosis_id;
	this.diagnosis_name = diagnosis_name;
	this.date = date;
	this.med = med;
}
public Diagnosis() {
	super();
}
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
public MedicalHistory getMed() {
	return med;
}
public void setMed(MedicalHistory med) {
	this.med = med;
}
@Override
public String toString() {
	return "Diagnosis [diagnosis_id=" + diagnosis_id + ", diagnosis_name=" + diagnosis_name + ", date=" + date
			+ ", med=" + med + "]";
}

}
