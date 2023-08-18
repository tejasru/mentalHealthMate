package com.demo.SpringBootRESTWebService;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.SpringBootRESTWebService.dao.UserDao;
import com.demo.SpringBootRESTWebService.model.Address;
import com.demo.SpringBootRESTWebService.model.Appointment;
import com.demo.SpringBootRESTWebService.model.FeedBack;
import com.demo.SpringBootRESTWebService.model.MedicalHistory;
import com.demo.SpringBootRESTWebService.model.Users;

@SpringBootApplication
public class SpringBootRestWebServiceApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringBootRestWebServiceApplication.class, args);
	UserDao ud=context.getBean(UserDao.class);
//	//int id, String username, String name, String email, int age, String phoneno, Address address,
//	String gender, String password, List<Appointment> appointment, List<FeedBack> feedback,
//	MedicalHistory diagnosis
	Address address=new Address("pusad","xyz",123456);
	Users user=new Users(1,"anisha_11","anisha","malode@gmaill.com",22,"12345567888",address,"female","anisha123",null,null,null);
	
	Users user1=ud.save(user);
	System.out.println(user1);
	
	
	}

}
