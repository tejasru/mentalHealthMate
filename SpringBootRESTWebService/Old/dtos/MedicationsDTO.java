package com.demo.SpringBootRESTWebService.dtos;


import com.demo.SpringBootRESTWebService.model.Diagnosis;

public class MedicationsDTO {
private int medicationDTO_id;
private String medicationDTOName;
private Diagnosis diagnosisDTO;
public int getMedicationDTO_id() {
	return medicationDTO_id;
}
public void setMedicationDTO_id(int medicationDTO_id) {
	this.medicationDTO_id = medicationDTO_id;
}
public String getMedicationDTOName() {
	return medicationDTOName;
}
public void setMedicationDTOName(String medicationDTOName) {
	this.medicationDTOName = medicationDTOName;
}
public Diagnosis getDiagnosisDTO() {
	return diagnosisDTO;
}
public void setDiagnosisDTO(Diagnosis diagnosisDTO) {
	this.diagnosisDTO = diagnosisDTO;
}
@Override
public String toString() {
	return "MedicationDTO [medicationDTO_id=" + medicationDTO_id + ", medicationDTOName=" + medicationDTOName + "]";
}
public MedicationsDTO(int medicationDTO_id, String medicationDTOName, Diagnosis diagnosisDTO) {
	super();
	this.medicationDTO_id = medicationDTO_id;
	this.medicationDTOName = medicationDTOName;
	this.diagnosisDTO = diagnosisDTO;
}
public MedicationsDTO() {
	super();
}


}
