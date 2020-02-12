package ThisKeyWord;

public class ThisKeyWordExample1 {
	
		// This key word is refrence variable in java that refers to the current variable 
	
	int a,b; // Instance Variable //  creating variables 
	
	// int a = 20;  these are the same 
	// int b = 40;  these are the same
	
	void getValues (int a, int b)         // Method Variable
	{ 
		this.a = a;
		this.b = b;
	} 
	
	void PrintValuea () {
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
	public static void main(String[] args) {
		
		ThisKeyWordExample1 This = new ThisKeyWordExample1();
		This.getValues(12, 12);
		This.PrintValuea();
		
	}

}
