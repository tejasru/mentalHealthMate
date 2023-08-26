package com.demo.mhm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="User_payment")
public class UserPayment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int uPaymentId;
private String cType;
private String bankName;
private long accountNo;
private double amount;
private long ifsc;
private String email;
@OneToOne
private Appointment appointment;


@Override
public String toString() {
	return "UserPayment [upaymentId=" + uPaymentId + ", cType=" + cType + ", bankName=" + bankName + ", accountNo="
			+ accountNo + ", amount=" + amount + ", ifsc=" + ifsc + ", email=" + email + ", appointment=" + appointment
			+ "]";
}
public UserPayment() {
	super();
}
public UserPayment(int upaymentId, String cType, String bankName, long accountNo, double amount, long ifsc,
		String email, Appointment appointment) {
	super();
	this.uPaymentId = upaymentId;
	this.cType = cType;
	this.bankName = bankName;
	this.accountNo = accountNo;
	this.amount = amount;
	this.ifsc = ifsc;
	this.email = email;
	this.appointment = appointment;
}
public int getUpaymentId() {
	return uPaymentId;
}
public void setUpaymentId(int upaymentId) {
	this.uPaymentId = upaymentId;
}
public String getcType() {
	return cType;
}
public void setcType(String cType) {
	this.cType = cType;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public long getIfsc() {
	return ifsc;
}
public void setIfsc(long ifsc) {
	this.ifsc = ifsc;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Appointment getAppointment() {
	return appointment;
}
public void setAppointment(Appointment appointment) {
	this.appointment = appointment;
}


}
