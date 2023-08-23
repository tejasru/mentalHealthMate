package com.demo.mhm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.UserPayment;

@Repository
public interface UserPaymentRepo extends JpaRepository<UserPayment, Integer>{

	


}
