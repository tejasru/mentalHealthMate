package com.demo.mhm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mhm.dao.SiteGeneratedRepo;
import com.demo.mhm.model.SiteGeneratedReport;


@Service
@Transactional
public class SiteGenReportImpl implements SiteGenReportI {
	
	@Autowired
	SiteGeneratedRepo sgr;

	@Override
	public List<SiteGeneratedReport> getAllReports(int id) {
		// TODO Auto-generated method stub
		return sgr.findAll();
	}

	

}
