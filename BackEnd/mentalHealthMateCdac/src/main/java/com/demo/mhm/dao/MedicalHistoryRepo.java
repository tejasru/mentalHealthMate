package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.MedicalHistory;
@Repository
public interface MedicalHistoryRepo extends JpaRepository<MedicalHistory, Integer> {
	@Query(value="select * from medical_history_table where user3_id=:id",nativeQuery=true)
	MedicalHistory getByUserId(int id);

}
