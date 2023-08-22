package com.demo.mhm.service;

import java.util.List;

import com.demo.mhm.model.Product;



public interface ProductService {

	List<Product> getAllProducts();

	void addProduct(Product p);

	Product getById(int pid);

	void updateProduct( Product p);

	void deleteById(int pid);

	List<Product> getByPrice(int lpr, int hpr);

}
