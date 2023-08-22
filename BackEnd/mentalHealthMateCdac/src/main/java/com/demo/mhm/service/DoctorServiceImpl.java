package com.demo.mhm.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.demo.mhm.dao.DoctorRepo;
import com.demo.mhm.dto.DoctorCredentialDTO;
import com.demo.mhm.model.Doctor;



@Service
@Transactional
public class DoctorServiceImpl implements DoctorServiceI{
	
	@Autowired
	private DoctorRepo dd;
	
	
	

	@Override
	public Doctor addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
	
		return dd.save(doctor);
	}
	@Override
	public void deleteDoctorById(int id) {
		
		// TODO Auto-generated method stub
		 dd.deleteById(id);
	}
	@Override
	public Doctor getDoctorById(int doctor_id) {
		// TODO Auto-generated method stub
		Optional<Doctor> op= dd.findById(doctor_id);
		if(op.isPresent()) {
			return op.get();
		}
		else{
			return null;
			//throw new ResourceAccessException("not found");
		}
	}
	@Override
	public Doctor findUserByUserNameAndPassword(DoctorCredentialDTO dc) {

	Doctor d=dd.FindByDuserName(dc.getUsername());
			String rawPassword = dc.getPassword();
			if(d != null &&( (rawPassword.equals(d.getPassword()))&&(dc.getUsername().equals(d.getDuserName())))){
				
				return d;
			}
			return null;
		
	}
	


}
