package com.demo.mhm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Free_slot")
public class Doctor_Freeslot {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int slotId;
private boolean slotStatus;
private int slot;
@ManyToOne
private Doctor doctor1;
public int getSlotId() {
	return slotId;
}
public void setSlotId(int slotId) {
	this.slotId = slotId;
}
public boolean isSlotStatus() {
	return slotStatus;
}
public void setSlotStatus(boolean slotStatus) {
	this.slotStatus = slotStatus;
}
public int getSlot() {
	return slot;
}
public void setSlot(int slot) {
	this.slot = slot;
}
public Doctor getDoctor1() {
	return doctor1;
}
public void setDoctor1(Doctor doctor1) {
	this.doctor1 = doctor1;
}
@Override
public String toString() {
	return "Doctor_Freeslot [slotId=" + slotId + ", slotStatus=" + slotStatus + ", slot=" + slot + ", doctor1="
			+ doctor1 + "]";
}
public Doctor_Freeslot(int slotId, boolean slotStatus, int slot, Doctor doctor1) {
	super();
	this.slotId = slotId;
	this.slotStatus = slotStatus;
	this.slot = slot;
	this.doctor1 = doctor1;
}
public Doctor_Freeslot() {
	super();
}


	
}