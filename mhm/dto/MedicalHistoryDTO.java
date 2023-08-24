package com.demo.mhm.dto;

import java.util.Arrays;

public class MedicalHistoryDTO {
	private int userId;
	private String Allergies;
	private String familyHistory;
	private String diagnosis[];
	private String Medication[];
	
	
	public MedicalHistoryDTO() {
		super();
	}
	public MedicalHistoryDTO(int userId, String allergies, String familyHistory, String[] diagnosis,
			String[] medication) {
		super();
		this.userId = userId;
		Allergies = allergies;
		this.familyHistory = familyHistory;
		this.diagnosis = diagnosis;
		Medication = medication;
	}
	@Override
	public String toString() {
		return "MedicalHistoryDTO [userId=" + userId + ", Allergies=" + Allergies + ", familyHistory=" + familyHistory
				+ ", diagnosis=" + Arrays.toString(diagnosis) + ", Medication=" + Arrays.toString(Medication) + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAllergies() {
		return Allergies;
	}
	public void setAllergies(String allergies) {
		Allergies = allergies;
	}
	public String getFamilyHistory() {
		return familyHistory;
	}
	public void setFamilyHistory(String familyHistory) {
		this.familyHistory = familyHistory;
	}
	public String[] getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String[] diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String[] getMedication() {
		return Medication;
	}
	public void setMedication(String[] medication) {
		Medication = medication;
	}
}
