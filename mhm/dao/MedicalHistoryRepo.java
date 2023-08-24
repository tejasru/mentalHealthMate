package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.MedicalHistory;
@Repository
public interface MedicalHistoryRepo extends JpaRepository<MedicalHistory, Integer> {

}
