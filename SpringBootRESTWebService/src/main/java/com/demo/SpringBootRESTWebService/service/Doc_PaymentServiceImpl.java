package com.demo.SpringBootRESTWebService.service;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootRESTWebService.dao.Doctor_PaymentRepo;
import com.demo.SpringBootRESTWebService.dao.UserPaymentRepo;
import com.demo.SpringBootRESTWebService.model.Doctor_payment;
import com.demo.SpringBootRESTWebService.model.UserPayment;

@Service
@Transactional
public class Doc_PaymentServiceImpl implements Doc_PaymentServiceI {
	
	@Autowired
	Doctor_PaymentRepo dpr;
	

	@Override
	public List<Doctor_payment> findAllPayment() {
		// TODO Auto-generated method stub
		return dpr.findAllPayment();
	}

}
