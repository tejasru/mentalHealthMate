package com.demo.SpringBootRESTWebService.dtos;

import java.util.Date;
import java.util.List;

import com.demo.SpringBootRESTWebService.model.MedicalHistory;
import com.demo.SpringBootRESTWebService.model.Medications;

public class DiagnosisDTO {
	private int diagnosisDTO_id;
	private String diagnosis_name;
	private Date date;
	private List<MedicationsDTO> medication;
	private MedicalHistory medicalHistory;
	
	
	public DiagnosisDTO() {
		super();
	}
	public DiagnosisDTO(int diagnosisDTO_id, String diagnosis_name, Date date, List<MedicationsDTO> medication,
			MedicalHistory medicalHistory) {
		super();
		this.diagnosisDTO_id = diagnosisDTO_id;
		this.diagnosis_name = diagnosis_name;
		this.date = date;
		this.medication = medication;
		this.medicalHistory = medicalHistory;
	}
	public MedicalHistory getMedicalHistory() {
		return medicalHistory;
	}
	public void setMedicalHistory(MedicalHistory medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	public int getDiagnosisDTO_id() {
		return diagnosisDTO_id;
	}
	public void setDiagnosisDTO_id(int diagnosisDTO_id) {
		this.diagnosisDTO_id = diagnosisDTO_id;
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
	public List<MedicationsDTO> getMedication() {
		return medication;
	}
	public void setMedication(List<MedicationsDTO> medication) {
		this.medication = medication;
	}
	
	@Override
	public String toString() {
		return "DiagnosisDTO [diagnosisDTO_id=" + diagnosisDTO_id + ", diagnosis_name=" + diagnosis_name + ", date="
				+ date + ", medication=" + medication + "]";
	}

	
	
}
