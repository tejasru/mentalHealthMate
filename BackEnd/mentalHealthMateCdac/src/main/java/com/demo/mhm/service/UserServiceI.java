package com.demo.mhm.service;

import com.demo.mhm.dto.DoctorCredentialDTO;
import com.demo.mhm.dto.UserCredentialDTO;
import com.demo.mhm.model.Doctor;
import com.demo.mhm.model.Users;

public interface UserServiceI {

	Users addUser(Users user);

	Users findUserByUserNameAndPassword(UserCredentialDTO dcredential);

}
