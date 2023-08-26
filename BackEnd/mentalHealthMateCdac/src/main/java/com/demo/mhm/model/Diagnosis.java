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
private int diagnosisId;
private String diagnosisName;
private Date date;
@ManyToOne
private MedicalHistory med;
public Diagnosis(int diagnosis_id, String diagnosis_name, Date date, MedicalHistory med) {
	super();
	this.diagnosisId = diagnosis_id;
	this.diagnosisName = diagnosis_name;
	this.date = date;
	this.med = med;
}
public Diagnosis() {
	super();
}
public int getDiagnosis_id() {
	return diagnosisId;
}
public void setDiagnosis_id(int diagnosis_id) {
	this.diagnosisId = diagnosis_id;
}
public String getDiagnosis_name() {
	return diagnosisName;
}
public void setDiagnosis_name(String diagnosis_name) {
	this.diagnosisName = diagnosis_name;
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
	return "Diagnosis [diagnosis_id=" + diagnosisId + ", diagnosis_name=" + diagnosisName + ", date=" + date
			+ ", med=" + med + "]";
}

}
