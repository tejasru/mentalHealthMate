package com.demo.SpringBootRESTWebService.service;

import com.demo.SpringBootRESTWebService.dtos.MedicalHistoryDTO;
import com.demo.SpringBootRESTWebService.model.MedicalHistory;

public interface MedicalHistoryServiceI {

	MedicalHistoryDTO medicalHistroy();

	void addMedicalHistory(MedicalHistory mh);

}
