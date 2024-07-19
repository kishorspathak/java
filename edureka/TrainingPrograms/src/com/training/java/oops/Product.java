package com.training.java.oops;

public class Product {
	private int productId;
	private String productName;
	
	//Define setters and getters to be able to get and set values of private member datas from other class 
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}


}
