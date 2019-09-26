package coding.practice;

import java.util.HashMap;
import java.util.Map;

public class CountCharOccurences {

	public static void main(String[] args) {

		String str = "I am going to school";

		// 1. Iterate over the string for chars and store it in char array

		char[] stringArray = str.toCharArray();
		System.out.println(stringArray);

		// 2. Put char one by one in map as key

		Map<Character, Integer> charMap = new HashMap<>();

		for (char c : stringArray) {

			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 0);
			}

		}
		// 3. Iterate over and increment for every count in map

		System.out.println(charMap);
	}

}
