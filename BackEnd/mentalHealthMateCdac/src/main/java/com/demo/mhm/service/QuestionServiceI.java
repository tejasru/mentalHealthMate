package com.demo.mhm.service;

import com.demo.mhm.model.SiteGeneratedReport;

public interface QuestionServiceI {
public boolean saveAnswer(SiteGeneratedReport sgr);

public SiteGeneratedReport generateReport();

}
