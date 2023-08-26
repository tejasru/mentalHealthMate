package com.demo.mhm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mhm.service.SiteGenReportI;

@RequestMapping("/SiteReport")
@RestController
@CrossOrigin("*")
public class SiteGeneratedReportController {

@Autowired
private SiteGenReportI SiteGenReportImp;

@GetMapping("/{id}")
public ResponseEntity<?> getAllReports(@PathVariable("id") int id)
{
    return ResponseEntity.ok(SiteGenReportImp.getAllReports(id));	
}
}
