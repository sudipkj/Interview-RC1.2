package function.simple;

import java.util.function.Function;

public class SimpleFunction {

	public static void main(String[] args) {

	// Function will have one input and one output - functional method name is aplly
		
	//Simple Example of Function.
		
	Function<String,Integer> fs = s -> s.length();
	System.out.println("Calling simple function " + fs.apply("Sudip"));
		
	// Square of intefer
	
	Function<Integer,Integer> sqr = s -> s*s;
	System.out.println("Square of number is " + sqr.apply(43));
	}

}
