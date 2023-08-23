package com.demo.mhm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="User_Table")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String username;
private String name;
private String email;
private int age;
private String phoneno;
private char gender;
private String password;


public Users(int id, String username, String name, String email, int age, String phoneno, char gender,
		String password) {
	super();
	this.id = id;
	this.username = username;
	this.name = name;
	this.email = email;
	this.age = age;
	this.phoneno = phoneno;
	this.gender = gender;
	this.password = password;
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getUsername() {
	return username;
}



public void setUsername(String username) {
	this.username = username;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getPhoneno() {
	return phoneno;
}

public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	return "Users [id=" + id + ", username=" + username + ", name=" + name + ", email=" + email + ", age=" + age
			+ ", phoneno=" + phoneno + ", gender=" + gender + ", password=" + password + "]";
}


public Users() {
	super();
}

}

