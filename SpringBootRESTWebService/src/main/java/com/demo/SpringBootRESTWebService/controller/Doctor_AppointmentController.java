package com.demo.SpringBootRESTWebService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootRESTWebService.service.Doc_AppointmentServiceI;

@RequestMapping("/DocAppointment")
@RestController
@CrossOrigin("*")
public class Doctor_AppointmentController {
	
	private Doc_AppointmentServiceI Doc_AppointServiceImpl;
	
	@GetMapping("")
	public ResponseEntity<?> getAllPayment()
	{
		return ResponseEntity.ok(Doc_AppointServiceImpl.findAllappointment());
		
	}

	
}
