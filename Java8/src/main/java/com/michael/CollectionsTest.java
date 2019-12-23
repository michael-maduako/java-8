package com.michael;

import java.util.*;

public class CollectionsTest {

	public static void main(String[] args) {
		Map<String,String> map= new HashMap<>();
		map.put("1", "ABC");
		map.put("2", "DEF");
		map.put("3", "GHI");
		map.put("4", "JKL");
		map.put("5", "MNO");
		
		map.forEach((key,value)->{System.out.print(key);
							System.out.println(value);});
		
		
	}

}
