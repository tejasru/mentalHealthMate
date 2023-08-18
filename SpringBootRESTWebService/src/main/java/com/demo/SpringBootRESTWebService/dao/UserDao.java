package com.demo.SpringBootRESTWebService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootRESTWebService.model.Product;
import com.demo.SpringBootRESTWebService.model.Users;
@Repository
public interface UserDao extends JpaRepository<Users, Integer> {

}
