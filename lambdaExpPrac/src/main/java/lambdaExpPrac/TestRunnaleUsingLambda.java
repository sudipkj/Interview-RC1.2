package lambdaExpPrac;

public class TestRunnaleUsingLambda {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = ()-> {
			for(int i =0; i<10 ; i++) {
				System.out.println("In child thread - " + i);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i =0; i<10 ; i++) {
			System.out.println("In main thread - " + i);
			Thread.sleep(1);
		}
		
	}

}
