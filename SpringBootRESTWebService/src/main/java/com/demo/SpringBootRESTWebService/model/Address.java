package com.demo.SpringBootRESTWebService.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	
private String city;
private String street;
@Id
private int pinCode;
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
@Override
public String toString() {
	return "Address [city=" + city + ", street=" + street + ", pinCode=" + pinCode + "]";
}
public Address(String city, String street, int pinCode) {
	super();
	this.city = city;
	this.street = street;
	this.pinCode = pinCode;
}
public Address() {
	super();
}

}
