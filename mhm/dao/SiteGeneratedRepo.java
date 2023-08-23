package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.SiteGeneratedReport;
@Repository
public interface SiteGeneratedRepo extends JpaRepository<SiteGeneratedReport, Integer>{



	

}
