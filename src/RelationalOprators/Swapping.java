package RelationalOprators;

public class Swapping {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping");
		
		System.out.println("The value of A is "+ a );
		
		System.out.println("The value of B is "+ b );
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping ");
		System.out.println("The value of A is " + a);
		System.out.println("The value of A is " + b);
	}

}
