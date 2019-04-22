package predicates.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SimplePredicates {

	public static void main(String[] args) {

		
	// Write a predicate to print whether number is greater than 10
		Predicate<Integer> p = i-> i>10;
		System.out.println(p.test(200));
		
		Predicate<String> ps = s -> s.length()>5;
		System.out.println(ps.negate().test("Sudip"));
		
	// Joining of predicate
	// Print all name of students starting with the name su
		List<String> names = new ArrayList<>();
		names.add("Sudip");
		names.add("Kunal");
		names.add("Sun");
		names.add("Sandeep");
		names.add("Sudipta");
		names.add("Sujeevani");
	
		Predicate<String> namestartsWithS = s->s.startsWith("Su");
		Predicate<String> nameEndsWithI = s->s.endsWith("i");
		System.out.println("Names starts with SU");
		filter(namestartsWithS, names);
		System.out.println("-----------------------------------");
		System.out.println("Names ends with I");
		filter(nameEndsWithI, names);
		System.out.println("-----------------------------------");
		System.out.println("Names starting with su and not I");
		filter(namestartsWithS.and(nameEndsWithI).negate(), names);
		
	}
	public static void filter(Predicate<String> ps, List<String> ls) {
		for (String name : ls) {
			if(ps.test(name)) {
				System.out.println("name is " + name);
			}
		}
	}

}
