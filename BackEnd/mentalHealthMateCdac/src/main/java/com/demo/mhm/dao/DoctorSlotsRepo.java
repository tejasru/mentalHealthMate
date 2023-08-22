package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.mhm.model.Doctor_Free_slot_time_table;

public interface DoctorSlotsRepo extends JpaRepository<Doctor_Free_slot_time_table, Integer> {

}
