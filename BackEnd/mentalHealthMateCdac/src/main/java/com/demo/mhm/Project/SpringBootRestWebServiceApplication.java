package com.demo.mhm.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.demo.mhm.dao.UserDao;
import com.demo.mhm.model.Users;

@SpringBootApplication
public class SpringBootRestWebServiceApplication {

	public static void main(String[] args) {
			SpringApplication.run(SpringBootRestWebServiceApplication.class, args);	
			System.out.println("------------------");
	}

}
