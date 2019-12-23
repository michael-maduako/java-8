package com.michael;

import java.util.*;
import java.util.stream.Collectors;


public class MethodReferenceTest {
	private Employee insert(Person person) {
		Employee e1= new Employee(person.getName(),21);
		return e1;
		
	}
	
	
	private void convertToEmp(List<Person> personList) {
		System.out.println("Using lambda functions");
		personList.stream()
		.map(person->this.insert(person))
		.collect(Collectors.toList())
		.forEach(s->System.out.println(s));//(Using lambda functions)
		
		System.out.println("Using Method reference");
		personList.stream()
		.map(this::insert)
		.collect(Collectors.toList())
		.forEach(System.out::println);//(Using method reference)
	}
	
	public static void main(String[] args) {
		MethodReferenceTest m1=new MethodReferenceTest();
		List<Person> personList=new ArrayList<>();
		personList.add(new Person("Abdul"));
		personList.add(new Person("Jack"));
		personList.add(new Person("Mobusher"));
		personList.add(new Person("Karthi"));
		personList.add(new Person("Edson"));

		m1.convertToEmp(personList);

	}

}
