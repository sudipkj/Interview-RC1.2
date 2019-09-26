package doubleColon.example;

import java.util.ArrayList;
import java.util.List;

public class DoubleColonExample implements Test {

	public DoubleColonExample(String name) {
		System.out.println("In Constructor. Name is " + name);
	}

	public DoubleColonExample() {

	}

	public static void main(String[] args) {

		// Scenario : Call instance method of same class
		Test t = new DoubleColonExample()::printName;
		t.printName();

		List<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("For");
		list.add("GEEKS");
		list.forEach(DoubleColonExample::getStaticName);

		list.forEach(DoubleColonExample::new);
	}

	// Instance method as below
	public void printName() {
		System.out.println("My name is sudip");
	}

	public String getName(int i) {
		return "Sudip";
	}

	public static void getStaticName(String name) {
		System.out.println(name);
	}

	public static void printStaticName() {
		System.out.println("Printing static name in this static method");
	}
}

@FunctionalInterface
interface Test {
	public void printName();

	public static void printStaticName() {
		System.out.println("Printing static name in this static method");
	}

}
