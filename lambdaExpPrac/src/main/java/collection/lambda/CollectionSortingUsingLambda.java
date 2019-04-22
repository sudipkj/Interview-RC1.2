package collection.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionSortingUsingLambda {
	public static void main(String[] args) {
		
		
		List<Integer> ls = new ArrayList<>();
		ls.add(55);
		ls.add(33);
		ls.add(65);
		ls.add(55);
		ls.add(24);
		ls.add(66);
		
		System.out.println("Before sorting : "+ ls);
		Collections.sort(ls);
		System.out.println("After sorting "+ ls);
		
		// Using lambda
		Comparator<Integer> ct = (n,p) -> n>p?-1 : n<p?+1 : 0;
		
		
		Collections.sort(ls, ct);
		System.out.println("After sorting with lambda in descending order" + ls);
		
		Set<Integer> set = new TreeSet<>(ct);
		set.add(55);
		set.add(33);
		set.add(65);
		set.add(55);
		set.add(24);
		set.add(66);
		
		System.out.println("Order of treeset " + set);
		
		
		// Sort tree map in descending order
		Map<Integer, String> map = new TreeMap<>(ct);
		map.put(1, "Sudip");
		map.put(23, "Guru");
		map.put(4, "Rakesh");
		map.put(6, "Deba");
		map.put(8, "Purnima");
		System.out.println("sorted map is " + map);
		
		
		
	}
}
