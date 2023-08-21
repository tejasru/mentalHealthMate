package com.demo.SpringBootRESTWebService.controller;

import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootRESTWebService.service.Doc_PaymentServiceI;
import com.demo.SpringBootRESTWebService.service.PaymentServiceI;

@RequestMapping("/DocPayment")
@RestController
@CrossOrigin("*")

public class Doctor_paymentController {
	

private static final ResponseEntity<?> ResponseEnity = null;
@Autowired
private Doc_PaymentServiceI Doc_PayserviceImp;

@GetMapping("")
public ResponseEntity<?> getAllPayment()
{
	return ResponseEnity.ok(Doc_PayserviceImp.findAllPayment());
	
}


}
