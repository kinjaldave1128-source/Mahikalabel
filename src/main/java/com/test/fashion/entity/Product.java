package com.test.fashion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	private long productId;
	
	private String productName;
	
	private String productDescription;
	
	private String brand;
	
	private String color;
	
	private String style;
	
	private String blouse;
	
	private String fabric;
	
	private String work;
	
	public Product(long productId, String productName, String productDescription, String brand, String color, String style,
			String blouse, String fabric, String work) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.brand = brand;
		this.color = color;
		this.style = style;
		this.blouse = blouse;
		this.fabric = fabric;
		this.work = work;
		
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getBlouse() {
		return blouse;
	}

	public void setBlouse(String blouse) {
		this.blouse = blouse;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

		
}

