package com.sudip.mircoservices.currencycalculationservice;

import java.util.HashMap;
import java.util.Map;

public class CalculateNumberOfOccurences {
	
	
	public static void main(String[] args) {
		// A string is given
		
		//use letters as keys and occurrence as values in hashMap
		
		String saying = "This is the first sentence";
		String strArry[] = {"Sudip kumar Jana", "Pooja Singh"};
		
		Map<Character, Integer> myMap = new HashMap<>();
		
		for (String string : strArry) {
			for (char c : string.toCharArray()) {
				if(myMap.containsKey(c)) {
					Integer val = myMap.get(c);
					val++;
					myMap.put(c, val);
				}else {
					myMap.put(c,1 );
				}
			}
		}
		
		
		System.out.println(myMap);
	}
}
