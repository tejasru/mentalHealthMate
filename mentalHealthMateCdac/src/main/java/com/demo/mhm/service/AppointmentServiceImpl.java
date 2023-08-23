package com.demo.mhm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.AppointmentSlotRepo;
import com.demo.mhm.model.Doctor_Freeslot;
@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentServiceI{
	
	private AppointmentSlotRepo slotRepository;

    @Autowired
    public AppointmentServiceImpl(AppointmentSlotRepo slotRepository) {
        this.slotRepository = slotRepository;
    }

	@Override
	public List<Doctor_Freeslot> getAvailableSlotsForDoctor(int doctor_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean bookSlot(int doctor_id, int slotId) {
		// TODO Auto-generated method stub
		return false;
	}

}

