package com.michael;
import java.util.*;
import java.util.function.Predicate;

public class FilteringApples {
	public static void main(String... args) {
		//java 7 version
		List<String> names= Arrays.asList("a","b","c","d");
		Collections.sort(names,new Comparator<String>() {
			public int compare(String a,String b) {
				return b.compareTo(a);
			}
		});
		System.out.println("java 7"+names);
		
		//Java 8 print
		names.forEach(System.out::println);//method reference
			
		Collections.sort(names,(String a,String b) -> b.compareTo(a));
		System.out.println("Java 8 with type"+names);
		Collections.sort(names,(a,b)->b.compareTo(a));
		System.out.println("Java 8 without types "+names);
		List<Apple> inventory= Arrays.asList(new Apple(80,"green"),
											 new Apple(155,"green"),
											 new Apple(120,"red"));
		List<Apple> greenApples= filterApples(inventory,FilteringApples::isGreenApple);
		System.out.println(greenApples);
			
		List<Apple> heavyApples= filterApples(inventory,FilteringApples::isHeavyApple);
		System.out.println(heavyApples);
			
		
		List<Apple> greenApples2= filterApples(inventory,(Apple a)->"green".equals(a.getColor()));
		System.out.println(greenApples2);
		
		List<Apple> heavyApples2= filterApples(inventory,(Apple a)->a.getWeight() > 150);
		System.out.println(heavyApples2);
			
		List<Apple> weirdApples= filterApples(inventory,(Apple a)->a.getWeight() < 80 || "brown".equals(a.getColor()));
		System.out.println(weirdApples);
			
	}
	
	public static List<Apple> filterGreenApples(List<Apple> inventory){
		List<Apple> result= new ArrayList<>();
		for(Apple apple:inventory) {
			if("green".equals(apple.getColor()))
				result.add(apple);
		}
		return result;
	}
	
	public static List<Apple> filterHeavyApples(List<Apple> inventory){
		List<Apple> result= new ArrayList<>();
		for(Apple apple:inventory)
			if(apple.getWeight() > 150)
				result.add(apple);
		return result;
	}
	
	
	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}
	
	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() >150;
	}
	
	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
		List<Apple> result= new ArrayList<>();
		for(Apple apple:inventory)
			if(p.test(apple))
				result.add(apple);
		return result;
	}
	
	public static class Apple{
		private int weight=0;
		private String color= "";
		
		public Apple(int weight, String color) {
			this.weight=weight;
			this.color= color;
		}

		public Integer getWeight() { //Collection does not support primitives so use Integer instead of int!!!!!!
			return weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Apple [weight=" + weight + ", color=" + color + "]";
		}
		
		
	}
	

}
