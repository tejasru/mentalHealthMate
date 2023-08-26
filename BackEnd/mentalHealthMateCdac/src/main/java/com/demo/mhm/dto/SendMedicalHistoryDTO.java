package com.demo.mhm.dto;

import java.util.List;
import java.util.Map;

import com.demo.mhm.model.Diagnosis;
import com.demo.mhm.model.MedicalHistory;
import com.demo.mhm.model.Medications;


public class SendMedicalHistoryDTO {
	
	private MedicalHistory medicalHistory;
	private Map<Diagnosis,List<Medications>> diagnosisMeds;
	@Override
	public String toString() {
		return "SendMedicalHistoryDTO [medicalHistory=" + medicalHistory + ", diagnosisMeds=" + diagnosisMeds + "]";
	}
	public MedicalHistory getMedicalHistory() {
		return medicalHistory;
	}
	public void setMedicalHistory(MedicalHistory medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	public Map<Diagnosis, List<Medications>> getDiagnosisMeds() {
		return diagnosisMeds;
	}
	public void setDiagnosisMeds(Map<Diagnosis, List<Medications>> diagnosisMeds) {
		this.diagnosisMeds = diagnosisMeds;
	}
	public SendMedicalHistoryDTO(MedicalHistory medicalHistory, Map<Diagnosis, List<Medications>> diagnosisMeds) {
		super();
		this.medicalHistory = medicalHistory;
		this.diagnosisMeds = diagnosisMeds;
	}
	public SendMedicalHistoryDTO() {
		super();
	}
	
	
}
