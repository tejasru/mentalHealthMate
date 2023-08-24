package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.mhm.model.MedicalHistory;

public interface MedicalHistoryRepo extends JpaRepository<MedicalHistory, Integer> {

}
