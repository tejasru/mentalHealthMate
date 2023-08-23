package com.demo.mhm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DocPayment_table")
public class Doctor_payment {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int paymentId;
private double amount;
private boolean pay_status;
@OneToOne
private Doctor_Appointment dpayment;
public Doctor_payment(int paymentId, double amount, boolean pay_status, Doctor_Appointment dpayment) {
	super();
	this.paymentId = paymentId;
	this.amount = amount;
	this.pay_status = pay_status;
	this.dpayment = dpayment;
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
public Doctor_Appointment getDpayment() {
	return dpayment;
}
public void setDpayment(Doctor_Appointment dpayment) {
	this.dpayment = dpayment;
}
@Override
public String toString() {
	return "Doctor_payment [paymentId=" + paymentId + ", amount=" + amount + ", pay_status=" + pay_status
			+ ", dpayment=" + dpayment + "]";
}

	
}