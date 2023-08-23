package com.demo.mhm.service;

import java.util.List;

import com.demo.mhm.model.Doctor_Freeslot;

public interface AppointmentServiceI {

	List<Doctor_Freeslot> getAvailableSlotsForDoctor(int doctor_id);

	boolean bookSlot(int doctorId, int slot, int userId);

}
