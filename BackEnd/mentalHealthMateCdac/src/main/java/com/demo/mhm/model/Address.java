package com.demo.mhm.model;

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
@Column(name="addId")
private int addId;
private String city;
private String street;
private int pinCode;
@OneToOne
private Users user1;
public Address(int add_id, String city, String street, int pinCode, Users user1) {
	super();
	this.addId = add_id;
	this.city = city;
	this.street = street;
	this.pinCode = pinCode;
	this.user1 = user1;
}
public Address() {
	super();
}
public int getAdd_id() {
	return addId;
}
public void setAdd_id(int add_id) {
	this.addId = add_id;
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
public Users getUser1() {
	return user1;
}
public void setUser1(Users user1) {
	this.user1 = user1;
}
@Override
public String toString() {
	return "Address [Add_id=" + addId + ", city=" + city + ", street=" + street + ", pinCode=" + pinCode + ", user1="
			+ user1 + "]";
}

}
