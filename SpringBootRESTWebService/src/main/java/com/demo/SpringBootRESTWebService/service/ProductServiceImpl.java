package com.demo.SpringBootRESTWebService.service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import com.demo.SpringBootRESTWebService.dao.ProductDao;
import com.demo.SpringBootRESTWebService.model.Product;



@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
    ProductDao productDao;

	@Override
	public List<Product> getAllProducts() {
		List<Product> plist= productDao.findAll();
		System.out.println("count : "+productDao.getCount());
		System.out.println(plist);
		return plist;
		
	}

	@Override
	public void addProduct(Product p) {
		productDao.save(p);
		
	}

	@Override
	public Product getById(int pid) {
		Optional<Product> op=productDao.findById(pid);
		if(op.isPresent()) {
			return op.get();
		}
		else{
			return null;
			//throw new ResourceAccessException("not found");
		}
	}

	@Override
	public void updateProduct(Product p) {
		Optional<Product> op=productDao.findById(p.getPid());
		if(op.isPresent()) {
			Product p2=op.get();
			p2.setPname(p.getPname());
			p2.setQty(p.getQty());
			p2.setPrice(p.getPrice());
			productDao.save(p);
		}
		
		
	}

	@Override
	public void deleteById(int pid) {
		productDao.deleteById(pid);
		
	}

	@Override
	public List<Product> getByPrice(int lpr, int hpr) {
		List<Product> plist=productDao.getByPrice(lpr,hpr);
		System.out.println(plist);
		return plist;
	}
}
