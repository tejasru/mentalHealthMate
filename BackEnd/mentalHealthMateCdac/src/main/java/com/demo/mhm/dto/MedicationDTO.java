package com.demo.mhm.dto;

public class MedicationDTO {
	private String medications;

	public String getMedications() {
		return medications;
	}

	public void setMedications(String medications) {
		this.medications = medications;
	}

	public MedicationDTO(String medications) {
		super();
		this.medications = medications;
	}

	public MedicationDTO() {
		super();
	}

	@Override
	public String toString() {
		return "MedicationDTO [Medications=" + medications + "]";
	}
	
}
