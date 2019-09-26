package predicates.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class TestPredicates {

	public static void main(String[] args) {

		// Scenario 1 : Check 2 numbers, first is greater then 10

		Predicate<Integer> p = a -> a > 10;
		System.out.println(p.test(20));

		// Scenario 2 check if the first number is less than the second number
		BiPredicate<Integer, Integer> bp = (a, b) -> a < b;
		System.out.println(bp.test(102, 50));

		// Scenatio 3 filter out the lists that are divisible by 3
		List<Integer> ls = new ArrayList<>();
		ls.add(2);
		ls.add(33);
		ls.add(12);
		ls.add(55);
		ls.add(24);
		ls.add(17);

		Predicate<Integer> ps = a -> a % 3 == 0;
		ls = divisible(ps, ls);

		System.out.println("Filtered List is " + ls);

		// Scenario 4 : Filter out names starting with K and Su and length more than 5
		// characters
		List<String> names = new ArrayList<>();
		names.add("Sudip");
		names.add("Kunal");
		names.add("Sun");
		names.add("Sandeep");
		names.add("Sudipta");
		names.add("Sujeevani");

		Predicate<String> pt = a -> a.startsWith("S") && a.length() > 5;
		names = getFilteredNames(pt, names);
		System.out.println("Names starting with S " + names);

	}

	private static List<String> getFilteredNames(Predicate<String> pt, List<String> ls) {
		List<String> fls = new ArrayList<>();

		for (String string : ls) {
			if (pt.test(string)) {
				fls.add(string);
			}
		}

		return fls;
	}

	private static List<Integer> divisible(Predicate<Integer> p, List<Integer> ls) {
		List<Integer> filteredList = new ArrayList<>();
		for (Integer integer : ls) {
			if (p.test(integer)) {
				filteredList.add(integer);
			}
		}

		return filteredList;
	}
}
