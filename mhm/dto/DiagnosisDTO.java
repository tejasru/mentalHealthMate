package com.demo.mhm.dto;

public class DiagnosisDTO {
	private String diagnosisName;

	public String getDiagnosisName() {
		return diagnosisName;
	}

	public void setDiagnosisName(String diagnosisName) {
		this.diagnosisName = diagnosisName;
	}

	public DiagnosisDTO(String diagnosisName) {
		super();
		this.diagnosisName = diagnosisName;
	}

	public DiagnosisDTO() {
		super();
	}

	@Override
	public String toString() {
		return "DiagnosisDTO [diagnosisName=" + diagnosisName + "]";
	}
	
}
