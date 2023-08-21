package com.demo.SpringBootRESTWebService.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootRESTWebService.dao.DiagnosisRepo;
import com.demo.SpringBootRESTWebService.dao.MedicalHistoryRepo;
import com.demo.SpringBootRESTWebService.dtos.DiagnosisDTO;
import com.demo.SpringBootRESTWebService.dtos.MedicalHistoryDTO;
import com.demo.SpringBootRESTWebService.dtos.MedicationsDTO;
import com.demo.SpringBootRESTWebService.model.Diagnosis;
import com.demo.SpringBootRESTWebService.model.MedicalHistory;
import com.demo.SpringBootRESTWebService.model.Medications;

@Service
@Transactional
public class MedicalHistoryServiceImpl implements MedicalHistoryServiceI{
	@Autowired
	MedicalHistoryRepo mhr;
	@Autowired
	DiagnosisRepo dr;
	@Override
	public MedicalHistoryDTO medicalHistroy() {
		// TODO Auto-generated method stub
		//List<DiagnosisDTO> 
		
		List<Diagnosis> diagnosis;
		List<Medications> medications;
		
		MedicalHistory medicalHistory = mhr.getMedicalHistory();
		
		diagnosis = mhr.getDiagnosis();
		System.out.println(diagnosis);
		medications = mhr.getMedications();
		//System.out.println(medications);
		List<DiagnosisDTO> diagnosisDTO = new ArrayList<DiagnosisDTO>();
		
		
		//int diagnosisDTO_id, String diagnosis_name, Date date, Set<Medications> medication,
		//MedicalHistory medicalHistory
		for(Diagnosis d: diagnosis) {
			List<MedicationsDTO> medicationsDTO = new ArrayList<MedicationsDTO>();
			for(Medications m: medications) {
				medicationsDTO.add(new MedicationsDTO(m.getMedication_id(),m.getMedicationName(),null));
			}
			DiagnosisDTO dt = new DiagnosisDTO(d.getDiagnosis_id(),d.getDiagnosis_name(),d.getDate(),null,null);
			dt.setMedication(medicationsDTO);
			diagnosisDTO.add(dt);
		}
		
		
		//int medical_id, String familyHistory, String allergies, Set<DiagnosisDTO> diagnosis, Users user2
		MedicalHistoryDTO mhd = new MedicalHistoryDTO(medicalHistory.getMedical_id(), medicalHistory.getFamilyHistory(), medicalHistory.getAllergies(),diagnosisDTO,null);
		System.out.println(mhd);
		return mhd;
		
	}
	@Override
	public void addMedicalHistory(MedicalHistory mh) {
		//mhr.save(mh);
	}

}
