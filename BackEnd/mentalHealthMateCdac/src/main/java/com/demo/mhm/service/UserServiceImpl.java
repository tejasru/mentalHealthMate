package com.demo.mhm.service;

import javax.transaction.Transactional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.UserRepo;
import com.demo.mhm.dto.DoctorCredentialDTO;
import com.demo.mhm.dto.UserCredentialDTO;
import com.demo.mhm.model.Doctor;
import com.demo.mhm.model.Users;

@Service
@Transactional
public class UserServiceImpl implements UserServiceI{
	
	@Autowired
	UserRepo ur;
	

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
		System.out.println(d);
		if(d != null &&( (rawPassword.equals(d.getPassword()))&&(uc.getUname().equals(d.getName())))){
			
			return d;
		}
		return null;
	
	}

}
