package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.Doctor;
@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer>{
	@Query( value="select * from Doctor_Table where doctor_name=:username",nativeQuery= true)
Doctor FindByDuserName(String username);
}
