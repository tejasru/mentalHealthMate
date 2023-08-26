package com.demo.mhm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mhm.service.DocPaymentServiceI;

@RequestMapping("/DocPayment")
@RestController
@CrossOrigin("*")
public class DoctorPaymentController {
	

@Autowired
private DocPaymentServiceI DocPayserviceImpl;


@GetMapping("/{id}")
public ResponseEntity<?> getTablesByDoctorId(@PathVariable("id") int doctorId)
{
	//System.out.println(DocPayserviceImpl.findAllappointment(paymentId));
	return ResponseEntity.ok(DocPayserviceImpl.findAllappointment(doctorId));
}
}
