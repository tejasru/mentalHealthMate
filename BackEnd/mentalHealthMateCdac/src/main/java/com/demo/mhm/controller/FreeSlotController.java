package com.demo.mhm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mhm.service.PaymentServiceI;
import com.demo.mhm.service.SlotServiceI;


@RequestMapping("/FreeSlots")
@RestController
@CrossOrigin("*")

public class FreeSlotController {
	
	@Autowired
	private SlotServiceI SlotServiceI;

	@GetMapping("")
	public ResponseEntity<?> getAllslots()
	{
		return ResponseEntity.ok(SlotServiceI.findAllslots());
		

	}
	
	

}
