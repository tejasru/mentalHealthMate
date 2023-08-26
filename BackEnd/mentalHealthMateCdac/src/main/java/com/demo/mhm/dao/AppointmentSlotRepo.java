package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.DoctorFreeslot;
@Repository
public interface AppointmentSlotRepo extends JpaRepository<DoctorFreeslot, Integer> {

}
