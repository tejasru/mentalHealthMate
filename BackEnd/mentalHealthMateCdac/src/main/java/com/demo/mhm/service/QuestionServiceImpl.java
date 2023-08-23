package com.demo.mhm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.SiteGeneratedReportRepo;
import com.demo.mhm.model.SiteGeneratedReport;
@Service
@Transactional
public class QuestionServiceImpl implements QuestionServiceI{
	@Autowired
	private SiteGeneratedReportRepo sgrr;
	@Override
	public boolean saveAnswer(SiteGeneratedReport sgr) {
	if(sgrr.save(sgr)!=null) {
		return true;
	}
return false;
}
	@Override
	public SiteGeneratedReport generateReport() {
		return sgrr.generateReport();
	}
	
}