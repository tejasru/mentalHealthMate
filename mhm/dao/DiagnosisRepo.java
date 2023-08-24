package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.Diagnosis;

@Repository
public interface DiagnosisRepo extends JpaRepository<Diagnosis, Integer>  {

}
