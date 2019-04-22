package lambdaExpPrac;

import lambdaServices.FuncationalIntAddService;
import lambdaServices.TestLambdaService;

public class LambdaExpert {

	public static void main(String[] args) {

		
		TestLambdaService is = ()-> System.out.println("Called print of Fucntional interface impl");
		is.print();
		
		
		FuncationalIntAddService fs = (a,b)-> a+b;
		FuncationalIntAddService fss = (a,b)-> {return a*b;};
		int sum = fs.getCalculatedValue(10, 20);
		System.out.println("calculated value is : "+ sum);
		int mul = fss.getCalculatedValue(10, 20);
		System.out.println("multiplicaitn i s : " + mul);
		
	}

}
class Impl implements TestLambdaService{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	public void Test() {
		new Impl().printError();
	}
}
