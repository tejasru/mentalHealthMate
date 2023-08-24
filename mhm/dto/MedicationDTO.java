package com.demo.mhm.dto;

public class MedicationDTO {
	private String Medications;

	public String getMedications() {
		return Medications;
	}

	public void setMedications(String medications) {
		Medications = medications;
	}

	public MedicationDTO(String medications) {
		super();
		Medications = medications;
	}

	public MedicationDTO() {
		super();
	}

	@Override
	public String toString() {
		return "MedicationDTO [Medications=" + Medications + "]";
	}
	
}
