package com.demo.mhm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.UserPaymentRepo;
import com.demo.mhm.model.UserPayment;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentServiceI{

	@Autowired
	UserPaymentRepo upr;
	
	
	@Override
	public List<UserPayment> findAllPayment() {
		// TODO Auto-generated method stub
		return upr.findAll();
	}

}
