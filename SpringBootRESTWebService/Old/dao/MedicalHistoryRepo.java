package com.demo.SpringBootRESTWebService.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootRESTWebService.model.Diagnosis;
import com.demo.SpringBootRESTWebService.model.MedicalHistory;
import com.demo.SpringBootRESTWebService.model.Medications;

@Repository
public interface MedicalHistoryRepo extends JpaRepository<MedicalHistory, Integer>{
@Query("select medicalHistory from MedicalHistory medicalHistory where medicalHistory.user2.id=1")
public MedicalHistory getMedicalHistory();


@Query("select diagnosis from Diagnosis diagnosis where diagnosis.medicalHistory.medical_id=1")
public List<Diagnosis> getDiagnosis();

@Query("select medications from Medications medications where medications.diagnosis.diagnosis_id=1")
public List<Medications> getMedications();
}
