package function.complex;

import java.util.function.Function;

public class FunctionWithThenAfterAndCompose {

	public static void main(String[] args) {
		
		Function<String,String> toLower = s->s.toLowerCase();
		
		Function<String,String> addSurname = s->s+" Jana";
		
		String result = toLower.andThen(addSurname).apply("Pooja");
		System.out.println(result);
		
	}

}
