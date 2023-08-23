package com.demo.mhm.service;

import java.util.List;

import com.demo.mhm.model.Doctor_Freeslot;

public interface SlotServiceI {

  List<Doctor_Freeslot> findAllslots();

  Doctor_Freeslot addSlotById(int slotId);

  void deleteSlotById(int slotId);

}
