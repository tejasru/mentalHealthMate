package com.demo.SpringBootRESTWebService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootRESTWebService.dao.UserPaymentRepo;
import com.demo.SpringBootRESTWebService.model.UserPayment;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentServiceI{

	@Autowired
	UserPaymentRepo upr;
	
	
	@Override
	public List<UserPayment> findAllPayment() {
		// TODO Auto-generated method stub
		return upr.findAllPayment();
	}

}
