package com.demo.mhm.service;

import java.util.List;

import com.demo.mhm.dto.PatientAppointmentDTO;
import com.demo.mhm.model.DoctorAppointment;

public interface DocAppointmentServiceI {
	
	List<DoctorAppointment> findAllappointment(int docAppointment_id);

	PatientAppointmentDTO findByname(String name);

}
