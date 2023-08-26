package com.demo.mhm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.DoctorFreeslot;

@Repository
public interface DoctorSlotsRepo extends JpaRepository<DoctorFreeslot, Integer> {
	@Query(value="select * from free_slot where doctor1_doctor_id=:id",nativeQuery=true)
	List<DoctorFreeslot> findBydoctorId(int id);

//	Doctor_Freeslot addSlotById(int slotId);

}
