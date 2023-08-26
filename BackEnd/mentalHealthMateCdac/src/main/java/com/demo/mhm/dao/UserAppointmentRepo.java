package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.Appointment;
@Repository
public interface UserAppointmentRepo extends JpaRepository<Appointment, Integer>{

}
