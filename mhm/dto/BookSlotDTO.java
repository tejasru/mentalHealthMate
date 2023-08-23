package com.demo.mhm.dto;

public class BookSlotDTO {
	
	private int doctorId;
	private int slot;
	private int userId;
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public BookSlotDTO(int doctorId, int slot, int userId) {
		super();
		this.doctorId = doctorId;
		this.slot = slot;
		this.userId = userId;
	}
	public BookSlotDTO() {
		super();
	}
	@Override
	public String toString() {
		return "BookSlotDTO [doctorId=" + doctorId + ", slot=" + slot + ", userId=" + userId + "]";
	}
	
}
