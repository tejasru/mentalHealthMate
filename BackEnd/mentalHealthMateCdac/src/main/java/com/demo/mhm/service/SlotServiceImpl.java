package com.demo.mhm.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.DoctorSlotsRepo;
import com.demo.mhm.model.Doctor;
import com.demo.mhm.model.Doctor_Freeslot;

@Service
@Transactional
public class SlotServiceImpl implements SlotServiceI {
	
	@Autowired
	DoctorSlotsRepo dsr;


	@Override
	public List<Doctor_Freeslot> findAllslots() {
		// TODO Auto-generated method stub
		return dsr.findAll();
	}

//	@Override
//	public Doctor_Freeslot addSlotById(int slotId) {
//		// TODO Auto-generated method stub
//		Optional<Doctor_Freeslot> dfs= dsr.findById(slotId);
//		if(dfs!=null) {
//			return dsr.save(dfs);
//		}
//		else{
//			return null;
//			//throw new ResourceAccessException("not found");
//		}
//	}

	@Override
	public void deleteSlotById(int slotId) {
		// TODO Auto-generated method stub
		dsr.deleteById(slotId);
	}

}
