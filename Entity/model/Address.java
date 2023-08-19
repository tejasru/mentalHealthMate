package com.demo.SpringBootRESTWebService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="address_table")
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="add_id")
private int Add_id;
private String city;
private String street;
private int pinCode;
@OneToOne
private Users user4;


public Address() {
	super();
}
public Address(int add_id, String city, String street, int pinCode, Users user4) {
	super();
	Add_id = add_id;
	this.city = city;
	this.street = street;
	this.pinCode = pinCode;
	this.user4 = user4;
}
public int getAdd_id() {
	return Add_id;
}
public void setAdd_id(int add_id) {
	Add_id = add_id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public int getPinCode() {
	return pinCode;
}
public void setPinCode(int pinCode) {
	this.pinCode = pinCode;
}
public Users getUser4() {
	return user4;
}
public void setUser4(Users user4) {
	this.user4 = user4;
}
@Override
public String toString() {
	return "Address [Add_id=" + Add_id + ", city=" + city + ", street=" + street + ", pinCode=" + pinCode + "]";
}

}
