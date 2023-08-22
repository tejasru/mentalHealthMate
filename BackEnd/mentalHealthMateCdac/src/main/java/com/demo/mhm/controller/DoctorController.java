package com.demo.mhm.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mhm.dto.DoctorCredentialDTO;
import com.demo.mhm.model.Doctor;

import com.demo.mhm.service.DoctorServiceI;



@RestController
@RequestMapping("/doctor")
@CrossOrigin(origins="*")
public class DoctorController {
	
	@Autowired
	private DoctorServiceI serviceI;
	
	@PostMapping("/register")
	public ResponseEntity<?> addDoctor(@RequestBody Doctor doctor)
	{
		 Doctor uData =serviceI.addDoctor(doctor);
		System.out.println(uData);
		 if(uData!=null)
		 return ResponseEntity.ok(uData);
		 
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDocotorId(@PathVariable("id") int doctor_id)
	{
		return ResponseEntity.ok(serviceI.getDoctorById(doctor_id));
		
	}

	@DeleteMapping("/{id}")
	public void deleteDoctorById(@PathVariable("id") int doctor_id)
	{
		serviceI.deleteDoctorById(doctor_id);
	}
		
	
//	@GetMapping("/login{dusername,password}")
//	public ResponseEntity<?> loginDoctor(@PathVariable("dusername") String duserName,@PathVariable("password") String password)
//	{
//		return serviceI.getvalidateUser(duserName,password);
//		
//	}


@PostMapping("/login")
public ResponseEntity<?> loginUser(@RequestBody DoctorCredentialDTO dcredential)
{
	Doctor dtoSend = serviceI.findUserByUserNameAndPassword(dcredential);
	if(dtoSend!=null) {
	
			return ResponseEntity.ok(dtoSend);
		}else {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		}
		
	
}
	
}
