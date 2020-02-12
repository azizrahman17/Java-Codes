package IfElse;

public class IfElseGreatestOfThreeNumber {

	public static void main(String[] args) {
		int a = 50;
		int b = 100;
		int c = 20;
		
		if(a>b && a>c) {
			
			System.out.println("A is Greatest "+a);
			
		}
		else if (b>a && b>c) {
			
			System.out.println("B is Greatest " +b);
		}
		
		else {
			
			System.out.println("C is Greatest "+c);
			
		}
		
	}

}
