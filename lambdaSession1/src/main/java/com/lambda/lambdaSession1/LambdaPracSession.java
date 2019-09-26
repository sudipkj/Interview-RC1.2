package com.lambda.lambdaSession1;

public class LambdaPracSession {

	public static void main(String[] args) {
		
		Calculable cal = (int [] arr) -> {
			int total = 0;
			for(int i= 0; i< arr.length; i++) {
				total = total + arr[i];
			}
			return total;
		};
		int total = cal.calculate(14, 22, 248);
		System.out.println(total);
		
	}

}

interface Calculable{
	public abstract int calculate(int ... a);
	
	default void print() {
		System.out.println("I am in default method of java 8 in calculable");
	}
	public static void getSomething() {
		System.out.println("In static mehtod");
	}
}
interface Playable {
	default void print () {
		System.out.println("In am in Playable in default method of java8");
	}
	
	public static void getSomething() {
		System.out.println("In static mehtod");
	}
}

class A implements Calculable, Playable{

	@Override
	public int calculate(int... a) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void print() {
		System.out.println("Default implementation");
		Playable.super.print();
	}
	
	public static void main(String[] args) {
		new A().print();
	}
}
