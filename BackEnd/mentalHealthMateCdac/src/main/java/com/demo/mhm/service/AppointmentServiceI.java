package com.demo.mhm.service;

import java.util.List;

import com.demo.mhm.model.DoctorFreeslot;

public interface AppointmentServiceI {

	List<DoctorFreeslot> getAvailableSlotsForDoctor(int doctor_id);

	boolean bookSlot(int doctorId, int slot, int userId);

}
