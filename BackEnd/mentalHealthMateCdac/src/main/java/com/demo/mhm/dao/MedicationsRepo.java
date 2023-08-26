package com.demo.mhm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.Medications;

@Repository
public interface MedicationsRepo extends JpaRepository<Medications, Integer> {
	@Query(value="select * from medication_table where diagnosis_diagnosis_id=:diagnosis_id",nativeQuery=true)
	List<Medications> findAllByDiagnosisName(int diagnosis_id);

}
