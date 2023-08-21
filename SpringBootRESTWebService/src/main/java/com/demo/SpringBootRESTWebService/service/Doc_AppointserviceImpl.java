package com.demo.SpringBootRESTWebService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.SpringBootRESTWebService.dao.Doctor_AppointmentRepo;
import com.demo.SpringBootRESTWebService.model.Doctor_Appointment;

public class Doc_AppointserviceImpl implements Doc_AppointmentServiceI{

	@Autowired
	Doctor_AppointmentRepo dar;
	
	
	
	@Override
	public List<Doctor_Appointment> findAllappointment() {
		// TODO Auto-generated method stub
		return dar.finaAllappointment();
	}

}
