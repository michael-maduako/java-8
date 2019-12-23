package com.michael;

@FunctionalInterface
public interface Product {
	default void displayProducts() {
		System.out.println("List of Products ");
	}
	
	public void test();
	static void staticM1() {
		System.out.println("calling static method");
	}
	
	
}
interface Product2{
	default void displayProducts() {
		System.out.println("List of Products 22222");
	}
}
class ABC implements Product,Product2{
	
	public void displayProducts() {
		System.out.println("List of Products");
		Product2.super.displayProducts();
	}
	 public void test() {
		 //TODO Auto-generated method stub
	 }
	 
	 public static void main(String[] args) {
		ABC a1= new ABC();
		a1.displayProducts();
	}
}