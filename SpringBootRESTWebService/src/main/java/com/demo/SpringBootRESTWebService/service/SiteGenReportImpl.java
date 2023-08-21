package com.demo.SpringBootRESTWebService.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootRESTWebService.dao.SiteGeneratedRepo;


@Service
@Transactional
public class SiteGenReportImpl implements SiteGenReportI {
	
	@Autowired
	SiteGeneratedRepo sgr;

	
	public Object getAllReports() {
		
		return sgr.getAllReports();
		
	}

}
