package Oops2;

public class ConstractorOverLoadingExample {
	
	 ConstractorOverLoadingExample(int a, int b) {
		
		 System.out.println(a + b);
	}
	ConstractorOverLoadingExample(double a, int b) {
		
		 System.out.println(a + b);
	}
	ConstractorOverLoadingExample(int a, int b, int c) {
		
		 System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		
		ConstractorOverLoadingExample co = new ConstractorOverLoadingExample(1000, 2000);
		//ConstractorOverLoadingExample co1 = new ConstractorOverLoadingExample(100.0, 2000);
		//ConstractorOverLoadingExample co2 = new ConstractorOverLoadingExample(1000, 2000,300);
	}

}
