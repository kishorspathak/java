package com.training.java.oops;

public class Inventory{
	public static void main(String args[]) {
		Product prod = new Product();

		prod.setProductId(123456);
		prod.setProductName("Mobile Phone");

		System.out.println("Product Id : " + prod.getProductId() + " | Product Name : " + prod.getProductName());

		System.out.println();

		System.out.println("prod is an instance of type : " + prod.getClass().getName());
		System.out.println("prod is an instance of type : " + prod.getClass().getSimpleName());

		System.out.println();

		System.out.println("hashCode() : " + prod.hashCode());
		System.out.println("hashCode() in hexadeciaml form : " + Integer.toHexString(prod.hashCode()));
		
		System.out.println();
		System.out.println(prod); //calls toString() method of object class.

	}
}
