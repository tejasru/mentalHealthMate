package com.demo.mhm.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.DiagnosisRepo;
import com.demo.mhm.dao.DoctorAppointmentRepo;
import com.demo.mhm.dao.MedicalHistoryRepo;
import com.demo.mhm.dao.MedicationsRepo;
import com.demo.mhm.dao.SiteGeneratedReportRepo;
import com.demo.mhm.dao.UserRepo;
import com.demo.mhm.dto.PatientAppointmentDTO;
import com.demo.mhm.dto.SendMedicalHistoryDTO;
import com.demo.mhm.model.Diagnosis;
import com.demo.mhm.model.DoctorAppointment;
import com.demo.mhm.model.MedicalHistory;
import com.demo.mhm.model.Medications;
import com.demo.mhm.model.SiteGeneratedReport;
import com.demo.mhm.model.Users;
@Service
@Transactional
public class DocAppointserviceImpl implements DocAppointmentServiceI{

	@Autowired
	DoctorAppointmentRepo dar;
	@Autowired
	UserRepo ur;
	@Autowired
	SiteGeneratedReportRepo sgrr;
	@Autowired
	DiagnosisRepo dr;
	@Autowired
	MedicationsRepo mr;
	@Autowired
	MedicalHistoryRepo mhr;
	
	

	@Override
	public List<DoctorAppointment> findAllappointment(int docAppointment_id) {
		// TODO Auto-generated method stub
		List<DoctorAppointment> docList =  dar.findAllById(docAppointment_id);
		
		return docList;
	}



	@Override
	public PatientAppointmentDTO findByname(String name) {
		// TODO Auto-generated method stub
		Map<Diagnosis,List<Medications>> diagnosisMeds = new LinkedHashMap<>();
		Users u = ur.getByName(name);
		MedicalHistory mh = mhr.getByUserId(u.getId());
		SiteGeneratedReport sgr = sgrr.getByUserId(u.getId());
		System.out.println(sgr);
		List<Diagnosis> lDiagnosis = dr.findAllByMedicalHistoryId(mh.getMedical_id());
		for(Diagnosis d: lDiagnosis) {
		List<Medications> medications = mr.findAllByDiagnosisName(d.getDiagnosis_id());
		diagnosisMeds.put(d,medications);
		}
		//MedicalHistory medicalHistory, Map<Diagnosis, List<Medications>> diagnosisMeds
		SendMedicalHistoryDTO smhDTO = new SendMedicalHistoryDTO(mh,diagnosisMeds);
		//SiteGeneratedReport siteReport, SendMedicalHistoryDTO medicalHistory
		PatientAppointmentDTO paDTO = new PatientAppointmentDTO(sgr,smhDTO);
		return paDTO;
	}
	
//	for(DoctorAppointment da: docList) {
//		//boolean visiedStatus, SiteGeneratedReport siteReport, MedicalHistory medicalHistory
//		String patientName = da.getPatient_name();
//		Users u = ur.getByName(patientName);

//	}
	

}
