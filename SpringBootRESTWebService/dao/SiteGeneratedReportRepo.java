package com.demo.SpringBootRESTWebService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootRESTWebService.model.SiteGeneratedReport;
@Repository
public interface SiteGeneratedReportRepo extends JpaRepository<SiteGeneratedReport, Integer> {
@Query(value="select * from site_generated_table order by site_gen_rep_id desc limit 1",nativeQuery=true)
SiteGeneratedReport generateReport();

}
