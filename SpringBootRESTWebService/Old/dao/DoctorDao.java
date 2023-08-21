package com.demo.SpringBootRESTWebService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootRESTWebService.model.Doctor;
@Repository
public interface DoctorDao extends JpaRepository<Doctor, Integer>{
}
