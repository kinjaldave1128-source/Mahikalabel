package com.test.fashion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.fashion.entity.Product;
import com.test.fashion.entity.ProductDatabase;
//import com.test.fashion.repo.ProductRepo;

@Service
public class ProductService {

//	@Autowired
	//private ProductRepo productRepo;
	
	@Autowired
	private ProductDatabase productDatabase;
	
	public List<Product> getAllProducts() {
		return productDatabase.products();
		//return productRepo.findAll();
	}
}
