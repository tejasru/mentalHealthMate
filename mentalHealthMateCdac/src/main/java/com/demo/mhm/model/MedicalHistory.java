package com.demo.mhm.model;

import java.util.List;

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
@OneToOne
private Users user3;
@OneToMany(cascade=CascadeType.REMOVE)
private List<Diagnosis> diagnosis;
public MedicalHistory(int medical_id, String familyHistory, String allergies, Users user3, List<Diagnosis> diagnosis) {
	super();
	Medical_id = medical_id;
	this.familyHistory = familyHistory;
	Allergies = allergies;
	this.user3 = user3;
	this.diagnosis = diagnosis;
}
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
public Users getUser3() {
	return user3;
}
public void setUser3(Users user3) {
	this.user3 = user3;
}
public List<Diagnosis> getDiagnosis() {
	return diagnosis;
}
public void setDiagnosis(List<Diagnosis> diagnosis) {
	this.diagnosis = diagnosis;
}
@Override
public String toString() {
	return "MedicalHistory [Medical_id=" + Medical_id + ", familyHistory=" + familyHistory + ", Allergies=" + Allergies
			+ ", user3=" + user3 + ", diagnosis=" + diagnosis + "]";
}


}
