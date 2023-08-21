package com.demo.SpringBootRESTWebService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootRESTWebService.Utils.ResponseUtil;
import com.demo.SpringBootRESTWebService.model.SiteGeneratedReport;
import com.demo.SpringBootRESTWebService.service.QuestionServiceI;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class QuestionsController {
	@Autowired
	QuestionServiceI qsi;
	@PostMapping("/question")
	public boolean siteReportAnswers(@RequestBody SiteGeneratedReport sgr) {
		return qsi.saveAnswer(sgr) ;
		
		
	}
	@GetMapping("/question/sitereport")
	public ResponseEntity<?> getSiteGeneratedReport() {
		
		//return ResponseUtil.success(qsi.generateReport());
		return ResponseEntity.ok(qsi.generateReport());
	}
	
}
