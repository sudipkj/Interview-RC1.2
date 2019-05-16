package com.sudip.mircoservices.currencycalculationservice;

public class TestInstanceStaticConstructor {

	public static void main(String[] args) {

		TestInstanceStaticConstructor t =  new TestInstanceStaticConstructor();
	}
	public TestInstanceStaticConstructor() {
		System.out.println("Constructor is called");
	}
	static {
		System.out.println("Static block is called");
	}
	{
		System.out.println("Instance Initializer is called");
	}

}
