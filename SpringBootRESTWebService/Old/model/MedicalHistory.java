package com.demo.SpringBootRESTWebService.model;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Medical_history_table")
public class MedicalHistory {
@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int Medical_id;
private String familyHistory;
private String Allergies;
@OneToMany(mappedBy="medicalHistory",cascade=CascadeType.REMOVE)
private Set<Diagnosis> diagnosis;
@OneToOne
private Users user2;


public MedicalHistory() {
	super();
}


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


public Set<Diagnosis> getDiagnosis() {
	return diagnosis;
}


public void setDiagnosis(Set<Diagnosis> diagnosis) {
	this.diagnosis = diagnosis;
}


public Users getUser2() {
	return user2;
}


public void setUser2(Users user2) {
	this.user2 = user2;
}


@Override
public String toString() {
	return "MedicalHistory [Medical_id=" + Medical_id + ", familyHistory=" + familyHistory + ", Allergies=" + Allergies
			+ ", diagnosis=" + diagnosis + "]";
}


public MedicalHistory(int medical_id, String familyHistory, String allergies, Set<Diagnosis> diagnosis, Users user2) {
	super();
	Medical_id = medical_id;
	this.familyHistory = familyHistory;
	Allergies = allergies;
	this.diagnosis = diagnosis;
	this.user2 = user2;
}



}
