package com.demo.SpringBootRESTWebService.model;

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
private String anxity;
private String hyperActivity;
private String schizophrenia;
private String ocd;
private String autism;
private String stress;
private String ptsd;
private String parenoia;
@ManyToOne
private Users user3;
public String getAnxity() {
	return anxity;
}
public void setAnxity(String anxity) {
	this.anxity = anxity;
}
public String getHyperActivity() {
	return hyperActivity;
}
public void setHyperActivity(String hyperActivity) {
	this.hyperActivity = hyperActivity;
}
public String getSchizophrenia() {
	return schizophrenia;
}
public void setSchizophrenia(String schizophrenia) {
	this.schizophrenia = schizophrenia;
}
public String getOcd() {
	return ocd;
}
public void setOcd(String ocd) {
	this.ocd = ocd;
}
public String getAutism() {
	return autism;
}
public void setAutism(String autism) {
	this.autism = autism;
}
public String getStress() {
	return stress;
}
public void setStress(String stress) {
	this.stress = stress;
}
public String getPtsd() {
	return ptsd;
}
public void setPtsd(String ptsd) {
	this.ptsd = ptsd;
}
public String getParenoia() {
	return parenoia;
}
public void setParenoia(String parenoia) {
	this.parenoia = parenoia;
}
public Users getUser3() {
	return user3;
}
public void setUser3(Users user3) {
	this.user3 = user3;
}
public SiteGeneratedReport(String anxity, String hyperActivity, String schizophrenia, String ocd, String autism,
		String stress, String ptsd, String parenoia, Users user3) {
	super();
	this.anxity = anxity;
	this.hyperActivity = hyperActivity;
	this.schizophrenia = schizophrenia;
	this.ocd = ocd;
	this.autism = autism;
	this.stress = stress;
	this.ptsd = ptsd;
	this.parenoia = parenoia;
	this.user3 = user3;
}
public SiteGeneratedReport() {
	super();
}
@Override
public String toString() {
	return "SiteGeneratedReport [anxity=" + anxity + ", hyperActivity=" + hyperActivity + ", schizophrenia="
			+ schizophrenia + ", ocd=" + ocd + ", autism=" + autism + ", stress=" + stress + ", ptsd=" + ptsd
			+ ", parenoia=" + parenoia + "]";
}




}
