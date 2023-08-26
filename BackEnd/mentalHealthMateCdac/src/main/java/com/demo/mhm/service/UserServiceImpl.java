package com.demo.mhm.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.DiagnosisRepo;
import com.demo.mhm.dao.MedicalHistoryRepo;
import com.demo.mhm.dao.MedicationsRepo;
import com.demo.mhm.dao.UserRepo;
import com.demo.mhm.dto.DiagnosisDTO;
import com.demo.mhm.dto.MedicalHistoryDTO;
import com.demo.mhm.dto.MedicationDTO;
import com.demo.mhm.dto.UserCredentialDTO;
import com.demo.mhm.model.Diagnosis;
import com.demo.mhm.model.MedicalHistory;
import com.demo.mhm.model.Medications;
import com.demo.mhm.model.Users;

@Service
@Transactional
public class UserServiceImpl implements UserServiceI{
	
	@Autowired
	UserRepo ur;
	@Autowired
	MedicalHistoryRepo mhr;
	@Autowired
	DiagnosisRepo diagnosisRepo;
	@Autowired
	MedicationsRepo medicationsRepo;
	

	@Override
	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		return ur.save(user);
	}


	@Override
	public Users findUserByUserNameAndPassword(UserCredentialDTO uc) {
		// TODO Auto-generated method stub
		Users d=ur.FindByUsername(uc.getUname());
		String rawPassword = uc.getPassword();
		if(d != null &&(rawPassword.equals(d.getPassword()))){
			return d;
		}
		return null;
	
	}


	@Override
	public boolean addMedicalHistory(MedicalHistoryDTO mdh) {
		// TODO Auto-generated method stub
		List<DiagnosisDTO> dList=mdh.getDiagnosisDTO();
		System.out.println(dList);
		List<MedicationDTO> medList = mdh.getMedicationDTO();
		Optional<Users> d = ur.findById(mdh.getUserId());
		Users u = d.get();
		MedicalHistory mh = new MedicalHistory(0,mdh.getFamilyHistory(),mdh.getAllergies(),new Date(),u);
		System.out.println(mh);
		mhr.save(mh);
		
		int i=0;
		for(DiagnosisDTO diagDTO: dList) {
			Diagnosis diagnosis = new Diagnosis(0,diagDTO.getDiagnosisName(),new Date(),mh);
			System.out.println(diagnosis);
			MedicationDTO medDTO = medList.get(i);
			Medications medication = new Medications(0,medDTO.getMedications(),diagnosis);
			i++;
			diagnosisRepo.save(diagnosis);
			medicationsRepo.save(medication);
		}
		
		
		return false;
	}


	@Override
	public boolean updateAllergy(int id, String allergy) {
		MedicalHistory mh = mhr.getByUserId(id);
		System.out.println(mh);
		mh.setAllergies(allergy);
		if(mhr.save(mh)!=null) {
			return true;
		}
		return false;
	}

}
