package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.mhm.model.Doctor_Freeslot;

public interface AppointmentSlotRepo extends JpaRepository<Doctor_Freeslot, Integer> {

}
