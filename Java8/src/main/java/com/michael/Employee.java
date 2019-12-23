package com.michael;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {
	String name;
	int age;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Employee(String name,int age) {
		super();
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name+" age= "+age + "]";
	}
	
	
	
}


class PredicateEmp{
	public static Predicate<Employee> ageGreaterthan21(){
		return p->p.getAge() > 21;
	}
	
	public static List<Employee> filterEmployees(List<Employee> emp, Predicate<Employee> p){
		return emp.stream().filter(p).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		Employee e1= new Employee("Abdul",25);
		Employee e2= new Employee("Jack",24);
		Employee e3= new Employee("Tamirat",21);
		Employee e4= new Employee("Karthi",20);
		
		List<Employee> list= new ArrayList<>();
		list.addAll(Arrays.asList(new Employee[] {e1,e2,e3,e4}));
		
		System.out.println(filterEmployees(list, ageGreaterthan21()));
		
	}
}
