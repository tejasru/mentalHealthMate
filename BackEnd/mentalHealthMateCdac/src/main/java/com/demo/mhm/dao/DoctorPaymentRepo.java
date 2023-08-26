package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.DoctorPayment;

@Repository
public interface DoctorPaymentRepo extends JpaRepository<DoctorPayment, Integer> {
	

}
