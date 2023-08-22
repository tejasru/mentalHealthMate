package com.demo.mhm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.Doctor_AppointmentRepo;
import com.demo.mhm.model.Doctor_Appointment;
@Service
@Transactional
public class Doc_AppointserviceImpl implements Doc_AppointmentServiceI{

	@Autowired
	Doctor_AppointmentRepo dar;
	

	@Override
	public List<Doctor_Appointment> findAllappointment(int docAppointment_id) {
		// TODO Auto-generated method stub
		return dar.findAll();
	}

}
