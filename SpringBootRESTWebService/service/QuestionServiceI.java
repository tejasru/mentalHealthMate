package com.demo.SpringBootRESTWebService.service;

import com.demo.SpringBootRESTWebService.model.SiteGeneratedReport;

public interface QuestionServiceI {
public boolean saveAnswer(SiteGeneratedReport sgr);

public SiteGeneratedReport generateReport();

}
