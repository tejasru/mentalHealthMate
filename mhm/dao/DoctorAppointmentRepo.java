package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.DoctorAppointment;
@Repository
public interface DoctorAppointmentRepo extends JpaRepository<DoctorAppointment, Integer> {

	

}
