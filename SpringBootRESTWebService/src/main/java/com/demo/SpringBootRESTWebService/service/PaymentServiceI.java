package com.demo.SpringBootRESTWebService.service;

import java.util.List;

import com.demo.SpringBootRESTWebService.model.UserPayment;

public interface PaymentServiceI {

	List<UserPayment> findAllPayment();


}
