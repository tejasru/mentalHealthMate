package com.demo.mhm.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.AppointmentSlotRepo;
import com.demo.mhm.dao.DoctorAppointmentRepo;
import com.demo.mhm.dao.DoctorRepo;
import com.demo.mhm.dao.UserAppointmentRepo;
import com.demo.mhm.dao.UserRepo;
import com.demo.mhm.model.Appointment;
import com.demo.mhm.model.Doctor;
import com.demo.mhm.model.DoctorAppointment;
import com.demo.mhm.model.Doctor_Freeslot;
import com.demo.mhm.model.Users;
@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentServiceI{
	@Autowired
	private AppointmentSlotRepo slotRepository;
	@Autowired
	private DoctorRepo dr;
	@Autowired
	private UserRepo ur;
	@Autowired
	private UserAppointmentRepo uar;
	@Autowired
	private DoctorAppointmentRepo dar;


	@Override
	public List<Doctor_Freeslot> getAvailableSlotsForDoctor(int doctor_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean bookSlot(int doctorId, int slot, int userId) {
		// TODO Auto-generated method stub
		Optional<Users> uo = ur.findById(userId);
		Optional<Doctor> dO = dr.findById(doctorId);
		
		Users u = uo.get();
		Doctor d = dO.get();
		
		Appointment ua = new Appointment(12,d.getDoctor_name(),d.getPhone_no(),new Date(),"false",null,u);
		DoctorAppointment da =  new DoctorAppointment(123,u.getName(),new Date(),u.getPhoneno(),false,d);
		
		if(dar.save(da)!=null && uar.save(ua)!=null) {
			return true;
		}
		return false;
	}

}

