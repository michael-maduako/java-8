package com.michael;

import java.util.*;

public class OptionalTest {

	public static void main(String[] args) {
		Optional<String> test= Optional.of("MALE");
		String test1="Yes";
		String test2=null;

		System.out.println("NonEmpty Optional "+test);
		System.out.println("NonEmpty Optional test value "+test.get());
		System.out.println("NonEmpty Optional "+Optional.empty());
		
		System.out.println("ofNullable on NonEmpty Optional "+Optional.ofNullable(test1));
		System.out.println("ofNullable on Empty Optional "+Optional.ofNullable(test2));
		//System.out.println("ofNullable on NonEmpty Optional "+Optional.of(test2));

		

	}

}
