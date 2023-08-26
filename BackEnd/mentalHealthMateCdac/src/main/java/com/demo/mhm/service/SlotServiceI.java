package com.demo.mhm.service;

import java.util.List;

import com.demo.mhm.dto.BookSlotDTO;
import com.demo.mhm.model.DoctorFreeslot;

public interface SlotServiceI {

  List<DoctorFreeslot> findAllslots(int id);

//  Doctor_Freeslot addSlotById(int slotId);

  void deleteSlotById(int slotId);


boolean addSlot(int id, int id2);

}
