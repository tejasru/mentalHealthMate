package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.Doctor_payment;

@Repository
public interface Doctor_PaymentRepo extends JpaRepository<Doctor_payment, Integer> {
	

}
