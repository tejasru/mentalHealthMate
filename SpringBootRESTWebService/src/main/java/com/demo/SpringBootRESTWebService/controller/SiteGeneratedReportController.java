package com.demo.SpringBootRESTWebService.controller;

import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootRESTWebService.service.SiteGenReportI;

@RequestMapping("/SiteReport")
@RestController
@CrossOrigin("*")

public class SiteGeneratedReportController {

@Autowired
private SiteGenReportI SiteGenReportImp;

@GetMapping("")
public ResponseEntity<?>getAllReports();
{
    return ResponseUtil.success(SiteGenReportImp.getAllReports());	
}
}
