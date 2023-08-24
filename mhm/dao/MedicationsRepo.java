package com.demo.mhm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mhm.model.*;

@Repository
public interface MedicationsRepo extends JpaRepository<Medications, Integer> {

}
