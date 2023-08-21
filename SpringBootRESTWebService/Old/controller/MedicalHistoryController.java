package com.demo.SpringBootRESTWebService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootRESTWebService.model.MedicalHistory;
import com.demo.SpringBootRESTWebService.service.MedicalHistoryServiceI;

@RestController
public class MedicalHistoryController {
//	@Autowired
//	MedicalHistoryServiceI mhsi;
//	@GetMapping("/medicalHistory")
//	public ResponseEntity<?> getMedicalHistory() {
//		return ResponseEntity.ok(mhsi.medicalHistroy());
//		//return null; 
//	}
//	@PostMapping("/medicalHistory/form")
//	public ResponseEntity<?> setMedicalHistory( @RequestBody MedicalHistory mh) {
//		  //mhsi.addMedicalHistory(mh);
//		  return ResponseEntity.ok("added successfully");
//	}
}
