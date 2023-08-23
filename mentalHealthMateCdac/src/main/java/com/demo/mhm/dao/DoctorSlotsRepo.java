package com.demo.mhm.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.mhm.model.Doctor_Freeslot;

public interface DoctorSlotsRepo extends JpaRepository<Doctor_Freeslot, Integer> {

	Optional<Doctor_Freeslot> addSlotById(int slotId);

}
