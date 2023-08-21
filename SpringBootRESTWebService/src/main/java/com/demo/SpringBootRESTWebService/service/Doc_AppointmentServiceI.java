package com.demo.SpringBootRESTWebService.service;

import java.util.List;

import com.demo.SpringBootRESTWebService.model.Doctor_Appointment;

public interface Doc_AppointmentServiceI {

	List<Doctor_Appointment> findAllappointment();

}
