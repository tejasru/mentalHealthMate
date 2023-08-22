package com.demo.mhm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mhm.service.PaymentServiceI;

@RequestMapping("/Payment")
@RestController
@CrossOrigin("*")

public class PaymentController {

@Autowired
private PaymentServiceI PayserviceImp;

@GetMapping("")
public ResponseEntity<?> getAllPayment()
{
	return ResponseEntity.ok(PayserviceImp.findAllPayment());
	

}


}
