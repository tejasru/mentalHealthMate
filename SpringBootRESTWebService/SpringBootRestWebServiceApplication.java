package com.demo.SpringBootRESTWebService;



import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.SpringBootRESTWebService.dao.DoctorDao;
import com.demo.SpringBootRESTWebService.dao.SiteGeneratedReportRepo;
import com.demo.SpringBootRESTWebService.dao.UserDao;
import com.demo.SpringBootRESTWebService.model.Address;
import com.demo.SpringBootRESTWebService.model.Diagnosis;
import com.demo.SpringBootRESTWebService.model.Doctor;
import com.demo.SpringBootRESTWebService.model.Doctor_Appointment;
import com.demo.SpringBootRESTWebService.model.Doctor_payment;
import com.demo.SpringBootRESTWebService.model.MedicalHistory;
import com.demo.SpringBootRESTWebService.model.SiteGeneratedReport;
import com.demo.SpringBootRESTWebService.model.Users;

@SpringBootApplication
public class SpringBootRestWebServiceApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringBootRestWebServiceApplication.class, args);
	UserDao ud=context.getBean(UserDao.class);
	SiteGeneratedReportRepo sgr1=context.getBean(SiteGeneratedReportRepo.class);
	DoctorDao dd=context.getBean(DoctorDao.class);
	MedicalHistory mh=new MedicalHistory(1,"normal","egg",null,null);
	Diagnosis d=new Diagnosis(1,"xyz",null,null,null);
	Users user=new Users(1,"anisha_11","anisha","malode@gmaill.com",22,"12345567888",null,"female","anisha123",null,null,null);
	Address address=new Address(1,"pusad","xyz",123456,null);
SiteGeneratedReport sr=new SiteGeneratedReport(1,1,2,3,4,5,6,7,8,null,null);
List<SiteGeneratedReport> list=new ArrayList<SiteGeneratedReport>();
	user.setDiagnosis(mh);
	mh.setUser2(user);
	address.setUser4(user);
	user.setAddress(address);
	d.setMedicalHistory(mh);
	d.setMedication(null);
	user.setsReport(list);
	sr.setUser3(user);
	Users user1=ud.save(user);
	
	sgr1.save(sr);
	
	
	System.out.println(user1);
	
	Doctor dc=new Doctor(12,"Sanskruti",null,"Anisha","MBBS","sans@abc.com","8834992845","xyz123",null);
	Doctor_Appointment dca=new Doctor_Appointment(101,"Sanskruti",null,"94230005423",true,dc,null);
	Doctor_payment dp=new Doctor_payment(101,12500,false);
	dca.setDpayment(dp);
	Doctor d1=dd.save(dc);
	System.out.println(d1);
	
	
	
	}

}
