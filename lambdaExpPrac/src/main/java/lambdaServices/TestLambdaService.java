package lambdaServices;

@FunctionalInterface
public interface TestLambdaService {
	public void print();

	default void printError() {

	}

	default void printError2() {

	}

	public static void method() {

	}
}
