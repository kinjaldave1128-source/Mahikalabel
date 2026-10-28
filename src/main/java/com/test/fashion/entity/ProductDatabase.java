package com.test.fashion.entity;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDatabase {
	
	public List<Product> products(){
		List<Product> productList =  List.of(
			new Product(1, "Product 1", "Description 1", "Brand 1", "Red", "Casual", "Blouse 1", "Cotton", "Embroidery"),
			new Product(2, "Product 2", "Description 2", "Brand 2", "Blue", "Formal", "Blouse 2", "Silk", "Sequins"),
			new Product(3, "Product 3", "Description 3", "Brand 3", "Green", "Party", "Blouse 3", "Linen", "Beads")
	);
		return productList;
	}

}
