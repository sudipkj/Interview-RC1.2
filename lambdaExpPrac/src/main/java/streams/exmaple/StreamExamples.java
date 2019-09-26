package streams.exmaple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<>();
		marks.add(20);
		marks.add(5);
		marks.add(6);
		marks.add(21);
		marks.add(4);
		marks.add(61);

		// Filter all even numbers into a collection using streams
		marks = marks.stream().filter(i -> i % 2 == 0).sorted((a, b) -> a > b ? -1 : a < b ? +1 : 0)
				.collect(Collectors.toList());
		System.out.println(marks);

		// list all squeares of the numbers in list
		int max = marks.stream().map(i -> i * i).max((a, b) -> -a.compareTo(b)).get();
		System.out.println(max);

		// Scenario : Filter out number those are divisible by 10 and print in ascending
		// order

		List<Integer> salary = new ArrayList<>();
		salary.add(200);
		salary.add(5000);
		salary.add(600000);
		salary.add(2102);
		salary.add(455600);
		salary.add(60021);

		Comparator<Integer> cp = (a, b) -> a > b ? -1 : a < b ? +1 : 0;
		List<Integer> salLs = salary.stream().filter(a -> a % 10 == 0).sorted(cp).collect(Collectors.toList());

		System.out.println("Divisible by 10 and sorted in descending order list is " + salLs);

		// Filter not divisible by 10 and add 66 and sort it in descending order

		Predicate<Integer> p = s -> s % 10 == 0;
		Function<Integer, Integer> fn = a -> a + 66;
		salLs = salary.stream().filter(p.negate()).map(fn).sorted(cp).collect(Collectors.toList());
		System.out.println("Not divisible by 10 lsit " + salLs);
		
		salLs = salary.stream().parallel().filter(p.negate()).map(fn).sorted(cp).collect(Collectors.toList());
		
		System.out.println("Using parallel stream of stream class ls is " + salLs);
		
		// using parallelstream
		salLs = salary.parallelStream().filter(p.negate()).map(fn).sorted(cp).collect(Collectors.toList());
		System.out.println("using parallel stream L "+ salLs);
	}

}
