package com.demo.mhm.service;

import java.util.List;

import com.demo.mhm.model.Doctor_payment;

public interface DocPaymentServiceI {

	List<Doctor_payment> findAllappointment(int paymentId);

}
