package com.demo.mhm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.DoctorAppointmentRepo;
import com.demo.mhm.model.DoctorAppointment;
@Service
@Transactional
public class Doc_AppointserviceImpl implements Doc_AppointmentServiceI{

	@Autowired
	DoctorAppointmentRepo dar;
	

	@Override
	public List<DoctorAppointment> findAllappointment(int docAppointment_id) {
		// TODO Auto-generated method stub
		return dar.findAll();
	}

}
