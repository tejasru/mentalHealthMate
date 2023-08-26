package com.demo.mhm.dto;


import com.demo.mhm.model.SiteGeneratedReport;

public class PatientAppointmentDTO {
	private SiteGeneratedReport siteReport;
	private SendMedicalHistoryDTO medicalHistory;

	public SiteGeneratedReport getSiteReport() {
		return siteReport;
	}
	public void setSiteReport(SiteGeneratedReport siteReport) {
		this.siteReport = siteReport;
	}
	public SendMedicalHistoryDTO getMedicalHistory() {
		return medicalHistory;
	}
	public void setMedicalHistory(SendMedicalHistoryDTO medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	public PatientAppointmentDTO(SiteGeneratedReport siteReport,
			SendMedicalHistoryDTO medicalHistory) {
		super();
		this.siteReport = siteReport;
		this.medicalHistory = medicalHistory;
	}
	public PatientAppointmentDTO() {
		super();
	}
	@Override
	public String toString() {
		return "PatientAppointmentDTO [siteReport=" + siteReport
				+ ", medicalHistory=" + medicalHistory + "]";
	}
	
}
