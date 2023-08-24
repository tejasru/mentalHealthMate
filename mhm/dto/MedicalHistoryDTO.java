package com.demo.mhm.dto;

import java.util.Arrays;
import java.util.List;

import com.demo.mhm.model.Diagnosis;
import com.demo.mhm.model.Medications;

public class MedicalHistoryDTO {
	private int userId;
	private String allergies;
	private String familyHistory;
	private List<DiagnosisDTO> diagnosisDTO;
	private List<MedicationDTO> MedicationDTO;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
	allergies = allergies;
	}
	public String getFamilyHistory() {
		return familyHistory;
	}
	public void setFamilyHistory(String familyHistory) {
		this.familyHistory = familyHistory;
	}
	public List<DiagnosisDTO> getDiagnosisDTO() {
		return diagnosisDTO;
	}
	public void setDiagnosisDTO(List<DiagnosisDTO> diagnosisDTO) {
		this.diagnosisDTO = diagnosisDTO;
	}
	public List<MedicationDTO> getMedicationDTO() {
		return MedicationDTO;
	}
	public void setMedicationDTO(List<MedicationDTO> medicationDTO) {
		MedicationDTO = medicationDTO;
	}
	public MedicalHistoryDTO(int userId, String allergies, String familyHistory, List<DiagnosisDTO> diagnosisDTO,
			List<MedicationDTO> medicationDTO) {
		super();
		this.userId = userId;
		this.allergies = allergies;
		this.familyHistory = familyHistory;
		this.diagnosisDTO = diagnosisDTO;
		MedicationDTO = medicationDTO;
	}
	public MedicalHistoryDTO() {
		super();
	}
	@Override
	public String toString() {
		return "MedicalHistoryDTO [userId=" + userId + ", Allergies=" + allergies + ", familyHistory=" + familyHistory
				+ ", diagnosisDTO=" + diagnosisDTO + ", MedicationDTO=" + MedicationDTO + "]";
	}
	}
