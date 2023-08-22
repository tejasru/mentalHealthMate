package com.demo.mhm.service;

import org.springframework.http.ResponseEntity;

import com.demo.mhm.dto.DoctorCredentialDTO;
import com.demo.mhm.model.Doctor;


public interface DoctorServiceI {

	Doctor addDoctor(Doctor doctor);

	void deleteDoctorById(int id);

	Doctor getDoctorById(int doctor_id);

	Doctor findUserByUserNameAndPassword(DoctorCredentialDTO dcredential);



	

}
