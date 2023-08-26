package com.demo.mhm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.Diagnosis;

@Repository
public interface DiagnosisRepo extends JpaRepository<Diagnosis, Integer>  {
	@Query(value="select * from diagnosis_table where med_medical_id=:medical_id",nativeQuery=true)
	List<Diagnosis> findAllByMedicalHistoryId(int medical_id);
	

}
