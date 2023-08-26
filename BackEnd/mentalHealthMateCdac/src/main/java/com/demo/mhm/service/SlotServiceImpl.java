package com.demo.mhm.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.DoctorRepo;
import com.demo.mhm.dao.DoctorSlotsRepo;
import com.demo.mhm.model.Doctor;
import com.demo.mhm.model.DoctorFreeslot;

@Service
@Transactional
public class SlotServiceImpl implements SlotServiceI {
	
	@Autowired
	DoctorSlotsRepo dsr;
	@Autowired
	DoctorRepo dr;


	@Override
	public List<DoctorFreeslot> findAllslots(int id) {
		// TODO Auto-generated method stub
		return dsr.findBydoctorId(id);
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


	@Override
	public boolean addSlot(int id,int id2) {
		// TODO Auto-generated method stub
		Optional<Doctor> d = dr.findById(id);
		Doctor doctorObject = d.get();
		//int slotId, boolean slotStatus, int slot, Doctor doctor1
		DoctorFreeslot dfs = new DoctorFreeslot(0,true,id2,doctorObject);
		if(dsr.save(dfs)!=null) {
			return true;
		}
		return false;
	}
 

}
