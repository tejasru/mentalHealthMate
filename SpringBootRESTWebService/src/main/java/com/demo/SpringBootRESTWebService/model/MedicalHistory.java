package com.demo.SpringBootRESTWebService.model;

import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Medical_history_table")

public class MedicalHistory {
@Id	

private int Medical_id;
	
private String familyHistory;
	
private String Allergies;
private Map<Diagnosis,Set<Medications>> diagnosis;
public int getMedical_id() {
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
public Map<Diagnosis, Set<Medications>> getDiagnosis() {
	return diagnosis;
}
public void setDiagnosis(Map<Diagnosis, Set<Medications>> diagnosis) {
	this.diagnosis = diagnosis;
}
@Override
public String toString() {
	return "MedicalHistory [Medical_id=" + Medical_id + ", familyHistory=" + familyHistory + ", Allergies=" + Allergies
			+ ", diagnosis=" + diagnosis + "]";
}
public MedicalHistory(int medical_id, String familyHistory, String allergies,
		Map<Diagnosis, Set<Medications>> diagnosis) {
	super();
	Medical_id = medical_id;
	this.familyHistory = familyHistory;
	Allergies = allergies;
	this.diagnosis = diagnosis;
}
public MedicalHistory() {
	super();
}

}
