package com.demo.SpringBootRESTWebService.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootRESTWebService.model.Doctor_payment;
import com.demo.SpringBootRESTWebService.model.UserPayment;

@Repository
public interface Doctor_PaymentRepo extends JpaRepository<Doctor_payment, Integer> {
	
	List<Doctor_payment> findAllPayment();

}
