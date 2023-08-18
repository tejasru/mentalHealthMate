package com.demo.SpringBootRESTWebService.model;

import java.util.HashMap;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Medical_history_table")
public class MedicalHistory {
@Id	
private int Medical_id;
private String familyHistory;
private String Allergies;

private HashMap<Diagnosis,Set<Medications>> diagnosis;
@OneToOne
private Users user2;


public MedicalHistory() {
	super();
}
public MedicalHistory(int medical_id, String familyHistory, String allergies,
		HashMap<Diagnosis, Set<Medications>> diagnosis, Users user2) {
	super();
	Medical_id = medical_id;
	this.familyHistory = familyHistory;
	Allergies = allergies;
	this.diagnosis = diagnosis;
	this.user2 = user2;
}
@Override
public String toString() {
	return "MedicalHistory [Medical_id=" + Medical_id + ", familyHistory=" + familyHistory + ", Allergies=" + Allergies
			+ ", diagnosis=" + diagnosis + ", user2=" + user2 + "]";
}
int getMedical_id() {
	return Medical_id;
}
public void setMedical_id(int medical_id) {
	Medical_id = medical_id;
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
public HashMap<Diagnosis, Set<Medications>> getDiagnosis() {
	return diagnosis;
}
public void setDiagnosis(HashMap<Diagnosis, Set<Medications>> diagnosis) {
	this.diagnosis = diagnosis;
}
public Users getUser2() {
	return user2;
}
public void setUser2(Users user2) {
	this.user2 = user2;
}




}
