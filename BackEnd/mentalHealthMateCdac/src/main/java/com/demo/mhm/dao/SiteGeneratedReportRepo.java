package com.demo.mhm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.SiteGeneratedReport;
@Repository
public interface SiteGeneratedReportRepo extends JpaRepository<SiteGeneratedReport, Integer> {
@Query(value="select * from site_generated_table order by site_gen_rep_id desc limit 1",nativeQuery=true)
SiteGeneratedReport generateReport();
@Query(value="select * from site_generated_table where user4_id=:id order by site_gen_rep_id desc limit 1",nativeQuery=true)
SiteGeneratedReport getByUserId(int id);
@Query(value="select * from site_generated_table where user4_id=:id",nativeQuery=true)
List<SiteGeneratedReport> findAllById(int id);

}
