package com.michael;

public class WelcomeLambda {
	public static void main(String[] args) {
		Welcome welcome2= x->System.out.println("Michael"+x);
		wel(welcome2,"Tamirat");
	}
	
	
	
	private static void wel(Welcome welcome, String name) {
		welcome.display(name);
	}
}
