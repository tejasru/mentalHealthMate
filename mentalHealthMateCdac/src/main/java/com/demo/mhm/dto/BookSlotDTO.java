package com.demo.mhm.dto;

public class BookSlotDTO {
	
	private int doctor_id;
	private int slotId;
	public BookSlotDTO(int doctor_id, int slotId) {
		super();
		this.doctor_id = doctor_id;
		this.slotId = slotId;
	}
	public BookSlotDTO() {
		super();
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public int getSlotId() {
		return slotId;
	}
	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}
	@Override
	public String toString() {
		return "BookSlotDTO [doctor_id=" + doctor_id + ", slotId=" + slotId + "]";
	}

}
