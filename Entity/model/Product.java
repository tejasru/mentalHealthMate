package com.demo.SpringBootRESTWebService.model;

import javax.persistence.Entity;
import javax.persistence.Id;





@Entity
public class Product {
  @Id
  private int pid;
  private String pname;
  private int qty;
  private float price;
public Product() {
	super();
}
public Product(int pid, String pname, int qty, float price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.qty = qty;
	this.price = price;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + "]";
}
  
}
