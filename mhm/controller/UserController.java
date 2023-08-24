package com.demo.mhm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mhm.dto.MedicalHistoryDTO;
import com.demo.mhm.dto.UserCredentialDTO;
import com.demo.mhm.model.Users;
import com.demo.mhm.service.UserServiceI;

@RequestMapping("/user")
@RestController
@CrossOrigin("*")

public class UserController {
	
	@Autowired
	private UserServiceI serviceI;
	
	@PostMapping("/register")
	public ResponseEntity<?> addUser(@RequestBody Users user)
	{
		 Users uData =serviceI.addUser(user);
		
		 if(uData!=null) {
		 return ResponseEntity.ok(uData);}
		 else
		 {
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();}
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody UserCredentialDTO dcredential)
	{
		Users dtoSend = serviceI.findUserByUserNameAndPassword(dcredential);
		if(dtoSend!=null) {
		
				return ResponseEntity.ok(dtoSend);
			}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

			}
		
	}
	
	@PostMapping("/addMedicalHistory")
	public ResponseEntity<?> addMedicalHistory(@RequestBody MedicalHistoryDTO medicalHistoryDTO,HttpStatus status){
		boolean out = serviceI.addMedicalHistory(medicalHistoryDTO);
		return ResponseEntity.ok(status);
	}

}
