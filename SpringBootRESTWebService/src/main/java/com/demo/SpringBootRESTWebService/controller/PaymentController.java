package com.demo.SpringBootRESTWebService.controller;

import java.security.Provider.Service;

import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootRESTWebService.service.PaymentServiceI;

@RequestMapping("/Payment")
@RestController
@CrossOrigin("*")

public class PaymentController {

@Autowired
private PaymentServiceI PayserviceImp;

@GetMapping("")
public ResponseEntity<?> getAllPayment()
{
	return ResponseUtil.success(PayserviceImp.findAllPayment());
	

}


}
