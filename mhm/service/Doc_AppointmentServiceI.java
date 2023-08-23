package com.demo.mhm.service;

import java.util.List;

import com.demo.mhm.model.DoctorAppointment;

public interface Doc_AppointmentServiceI {

	List<DoctorAppointment> findAllappointment(int docAppointment_id);

}
