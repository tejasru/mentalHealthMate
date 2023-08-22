package com.demo.mhm.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="site_generated_table")
public class SiteGeneratedReport {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int siteGenRepId;
private int anxity;
private int hyperActivity;
private int schizophrenia;
private int ocd;
private int autism;
private int stress;
private int ptsd;
private int parenoia;
private Date date;

@ManyToOne
private Users user4;
public SiteGeneratedReport(int siteGenRepId, int anxity, int hyperActivity, int schizophrenia, int ocd, int autism,
		int stress, int ptsd, int parenoia, Date date, Users user4) {
	super();
	this.siteGenRepId = siteGenRepId;
	this.anxity = anxity;
	this.hyperActivity = hyperActivity;
	this.schizophrenia = schizophrenia;
	this.ocd = ocd;
	this.autism = autism;
	this.stress = stress;
	this.ptsd = ptsd;
	this.parenoia = parenoia;
	this.date = date;
	this.user4 = user4;
}

public SiteGeneratedReport() {
	super();
}

public int getSiteGenRepId() {
	return siteGenRepId;
}

public void setSiteGenRepId(int siteGenRepId) {
	this.siteGenRepId = siteGenRepId;
}

public int getAnxity() {
	return anxity;
}

public void setAnxity(int anxity) {
	this.anxity = anxity;
}

public int getHyperActivity() {
	return hyperActivity;
}

public void setHyperActivity(int hyperActivity) {
	this.hyperActivity = hyperActivity;
}

public int getSchizophrenia() {
	return schizophrenia;
}

public void setSchizophrenia(int schizophrenia) {
	this.schizophrenia = schizophrenia;
}

public int getOcd() {
	return ocd;
}

public void setOcd(int ocd) {
	this.ocd = ocd;
}

public int getAutism() {
	return autism;
}

public void setAutism(int autism) {
	this.autism = autism;
}

public int getStress() {
	return stress;
}

public void setStress(int stress) {
	this.stress = stress;
}

public int getPtsd() {
	return ptsd;
}

public void setPtsd(int ptsd) {
	this.ptsd = ptsd;
}

public int getParenoia() {
	return parenoia;
}

public void setParenoia(int parenoia) {
	this.parenoia = parenoia;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Users getUser4() {
	return user4;
}

public void setUser4(Users user4) {
	this.user4 = user4;
}

@Override
public String toString() {
	return "SiteGeneratedReport [siteGenRepId=" + siteGenRepId + ", anxity=" + anxity + ", hyperActivity="
			+ hyperActivity + ", schizophrenia=" + schizophrenia + ", ocd=" + ocd + ", autism=" + autism + ", stress="
			+ stress + ", ptsd=" + ptsd + ", parenoia=" + parenoia + ", date=" + date + ", user4=" + user4 + "]";
}

}
