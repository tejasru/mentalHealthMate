package com.demo.mhm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.DoctorAppointment;
@Repository
public interface DoctorAppointmentRepo extends JpaRepository<DoctorAppointment, Integer> {
	@Query(value="select * from doc_appointment where doctor_doctor_id=:docAppointment_id",nativeQuery=true)
	List<DoctorAppointment> findAllById(int docAppointment_id);

}
