package supplier.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<String> sp = () -> "Sudip";
		
		System.out.println(sp.get());
		
		// Supplier has the only functionality to return without any input.
		
		Supplier<List<String>> sup = () -> {
			List<String> ls = new ArrayList<>();
			ls.add("Sudip");
			ls.add("Pooja");
			return ls;
		};
		
		System.out.println("Values of list " + sup.get());
		
		
	}

}
