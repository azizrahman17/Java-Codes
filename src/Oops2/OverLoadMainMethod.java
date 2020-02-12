package Oops2;

public class OverLoadMainMethod {
	
	
	public void main (int x) {
		
		System.out.println(x);
		
	}
	
	public void main (int x, int y) {
		
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		
		OverLoadMainMethod om = new OverLoadMainMethod();
		om.main(20);
		om.main(20, 20);
	}

}
