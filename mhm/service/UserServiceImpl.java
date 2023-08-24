package com.demo.mhm.service;

import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.MedicalHistoryRepo;
import com.demo.mhm.dao.UserRepo;
import com.demo.mhm.dto.MedicalHistoryDTO;
import com.demo.mhm.dto.UserCredentialDTO;
import com.demo.mhm.model.MedicalHistory;
import com.demo.mhm.model.Users;

@Service
@Transactional
public class UserServiceImpl implements UserServiceI{
	
	@Autowired
	UserRepo ur;
	@Autowired
	MedicalHistoryRepo mhr;
	

	@Override
	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		return ur.save(user);
	}


	@Override
	public Users findUserByUserNameAndPassword(UserCredentialDTO uc) {
		// TODO Auto-generated method stub
		Users d=ur.FindByUsername(uc.getUname());
		String rawPassword = uc.getPassword();
		if(d != null &&( (rawPassword.equals(d.getPassword()))&&(uc.getUname().equals(d.getName())))){
			
			return d;
		}
		return null;
	
	}


	@Override
	public boolean addMedicalHistory(MedicalHistoryDTO mdh) {
		// TODO Auto-generated method stub
		Optional<Users> d = ur.findById(mdh.getUserId());
		Users u = d.get();
		MedicalHistory mh = new MedicalHistory(23,mdh.getFamilyHistory(),mdh.getAllergies(),new Date(),u);
		mhr.save(mh);
		
		return false;
	}

}
