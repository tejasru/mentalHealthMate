package com.demo.mhm.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Medical_history_table")
public class MedicalHistory {
@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int medicalId;
private String familyHistory;
private String Allergies;
private Date date;
@OneToOne
private Users user3;

public MedicalHistory() {
	super();
}

public int getMedical_id() {
	return medicalId;
}

public void setMedical_id(int medical_id) {
	this.medicalId = medical_id;
}

public String getFamilyHistory() {
	return familyHistory;
}

public void setFamilyHistory(String familyHistory) {
	this.familyHistory = familyHistory;
}

public String getAllergies() {
	return Allergies;
}

public void setAllergies(String allergies) {
	Allergies = allergies;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Users getUser3() {
	return user3;
}

public void setUser3(Users user3) {
	this.user3 = user3;
}

public MedicalHistory(int medical_id, String familyHistory, String allergies, Date date, Users user3) {
	super();
	this.medicalId = medical_id;
	this.familyHistory = familyHistory;
	Allergies = allergies;
	this.date = date;
	this.user3 = user3;
}

@Override
public String toString() {
	return "MedicalHistory [Medical_id=" + medicalId + ", familyHistory=" + familyHistory + ", Allergies=" + Allergies
			+ ", date=" + date + ", user3=" + user3 + "]";
}
}
