package com.demo.SpringBootRESTWebService.service;

import java.util.List;

import com.demo.SpringBootRESTWebService.model.Doctor_payment;

public interface Doc_PaymentServiceI {

	List<Doctor_payment> findAllPayment();

}
