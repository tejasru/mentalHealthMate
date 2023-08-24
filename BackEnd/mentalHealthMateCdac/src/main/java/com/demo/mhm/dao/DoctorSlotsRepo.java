package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.Doctor_Freeslot;

@Repository
public interface DoctorSlotsRepo extends JpaRepository<Doctor_Freeslot, Integer> {

//	Doctor_Freeslot addSlotById(int slotId);

}