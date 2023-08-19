package com.demo.SpringBootRESTWebService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DocPayment_table")
public class Doctor_payment {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int paymentId;
private double amount;
private boolean pay_status;
public Doctor_payment(int paymentId, double amount, boolean pay_status) {
	super();
	this.paymentId = paymentId;
	this.amount = amount;
	this.pay_status = pay_status;
}
public Doctor_payment() {
	super();
}
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public boolean isPay_status() {
	return pay_status;
}
public void setPay_status(boolean pay_status) {
	this.pay_status = pay_status;
}
@Override
public String toString() {
	return "Doctor_payment [paymentId=" + paymentId + ", amount=" + amount + ", pay_status=" + pay_status + "]";
}

	
}
