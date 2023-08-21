package com.demo.SpringBootRESTWebService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootRESTWebService.model.Diagnosis;

@Repository
public interface DiagnosisRepo extends JpaRepository<Diagnosis, Integer>{

}
