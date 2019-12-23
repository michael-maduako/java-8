package com.michael;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierAndConsumerTest {

	private static void listNames(Supplier<String> supplier) {
		System.out.println(supplier.get());
	}

	private static void listNames2(String name) {
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		List<String> names= new ArrayList<>();
		names.add("Abdul");names.add("Sam");names.add("Jack");
		
		names.stream().forEach((item)->{listNames(()->item);});
		
		Consumer<String> c= SupplierAndConsumerTest::listNames2;
		c.accept("Servlet");c.accept("Java");c.accept("Spring");
		
	}

}
