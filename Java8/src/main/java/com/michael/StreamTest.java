package com.michael;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		String[] sArray= {"a","b","c","d"};
		
		Stream<String> stream1= Arrays.stream(sArray);
		stream1.forEach(x->System.out.print(x));
		System.out.println();
		
		Stream<String> stream2= Stream.of(sArray);
		//stream2.forEach(System.out::print);
		
		List<String> list=stream2.collect(Collectors.toList());
		System.out.println(list);
		
		
		List<String> test= Arrays.asList("Welcome", "ignore","to","Java8");
		test.stream()
		.filter(x->!"ignore".equals(x))
		.forEach(y->System.out.println(y));
		
		test.stream()
		.filter((s)->!s.startsWith("i"))
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		
		
		int result =IntStream.of(1,2,3,4).reduce(0, (x,y)->x*y);
		System.out.println(result);
	}

}
