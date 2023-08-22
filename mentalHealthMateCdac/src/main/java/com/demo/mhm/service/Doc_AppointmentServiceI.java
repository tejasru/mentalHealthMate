package com.demo.mhm.service;

import java.util.List;

import com.demo.mhm.model.Doctor_Appointment;

public interface Doc_AppointmentServiceI {

	List<Doctor_Appointment> findAllappointment(int docAppointment_id);

}
