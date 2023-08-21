package com.demo.SpringBootRESTWebService.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.demo.SpringBootRESTWebService.model.Product;
import com.demo.SpringBootRESTWebService.model.*;
@Repository
public interface UserDao extends JpaRepository<Users, Integer> {
//	int id, String username, String name, String email, int age, String phoneno, Address address,
//	String gender, String password, List<Appointment> appointment, List<FeedBack> feedback,
//	MedicalHistory diagnosis
	
	
	
}