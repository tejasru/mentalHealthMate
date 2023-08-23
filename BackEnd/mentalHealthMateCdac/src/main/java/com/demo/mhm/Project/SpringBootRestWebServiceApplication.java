package com.demo.mhm.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.mhm.dao.UserDao;
import com.demo.mhm.model.Users;


@SpringBootApplication
public class SpringBootRestWebServiceApplication {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(SpringBootRestWebServiceApplication.class, args);

		UserDao ud=context.getBean(UserDao.class);
		Users user=new Users(1,"anisha_11","anisha","malode@gmaill.com",22,"12345567888",'f',"anisha123");
	Users u=	ud.save(user);
	}

}
