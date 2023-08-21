package com.demo.SpringBootRESTWebService.dtos;

import java.util.List;
import java.util.Set;

import com.demo.SpringBootRESTWebService.model.Users;

public class MedicalHistoryDTO {
	private int Medical_id;
	private String familyHistory;
	private String Allergies;
	private List<DiagnosisDTO> diagnosis;
	private Users user2;


	public MedicalHistoryDTO() {
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


	public List<DiagnosisDTO> getDiagnosis() {
		return diagnosis;
	}


	public void setDiagnosis(List<DiagnosisDTO> diagnosis) {
		this.diagnosis = diagnosis;
	}


	@Override
	public String toString() {
		return "MedicalHistoryDTO [Medical_id=" + Medical_id + ", familyHistory=" + familyHistory + ", Allergies="
				+ Allergies + ", diagnosis=" + diagnosis + "]";
	}


	public Users getUser2() {
		return user2;
	}


	public void setUser2(Users user2) {
		this.user2 = user2;
	}





	public MedicalHistoryDTO(int medical_id, String familyHistory, String allergies, List<DiagnosisDTO> diagnosis, Users user2) {
		super();
		Medical_id = medical_id;
		this.familyHistory = familyHistory;
		Allergies = allergies;
		this.diagnosis = diagnosis;
		this.user2 = user2;
	}


}
