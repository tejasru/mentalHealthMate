package com.demo.mhm.service;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.Doctor_PaymentRepo;
import com.demo.mhm.model.Doctor_payment;

@Service
@Transactional
public class DocPaymentServiceImpl implements DocPaymentServiceI {
	
	@Autowired
	Doctor_PaymentRepo dpr;
	



	@Override
	public List<Doctor_payment> findAllappointment(int paymentId) {
		// TODO Auto-generated method stub
		return dpr.findAll();
	}

}
