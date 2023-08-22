package com.demo.mhm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.demo.mhm.dao.DoctorSlotsRepo;
import com.demo.mhm.model.Doctor_Free_slot_time_table;

@Service
@Transactional
public class SlotServiceImpl implements SlotServiceI {
	
	DoctorSlotsRepo dsr;

	@Override
	public List<Doctor_Free_slot_time_table> findAllslots() {
		// TODO Auto-generated method stub
		return dsr.findAll();
	}

}
