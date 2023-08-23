package com.demo.mhm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mhm.service.Doc_AppointmentServiceI;

@RequestMapping("/DocAppointment")
@RestController
@CrossOrigin("*")
public class DoctorAppointmentController {
	
	@Autowired
	private Doc_AppointmentServiceI Doc_AppointServiceImpl;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getTablesByWaiterId(@PathVariable("id") int docAppointment_id)
	{
		return ResponseEntity.ok(Doc_AppointServiceImpl.findAllappointment(docAppointment_id));
	}
}
