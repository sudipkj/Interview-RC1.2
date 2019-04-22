package streams.exmaple;

import java.util.ArrayList;
import java.util.List;
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
	marks = marks.stream().filter(i->i%2==0).sorted((a,b)-> a>b?-1:a<b?+1:0).collect(Collectors.toList());
	System.out.println(marks);
	
	// list all squeares of the numbers in list
	int max = marks.stream().map(i-> i*i).max((a,b)-> - a.compareTo(b)).get();
	System.out.println(max);
	
	}

}
