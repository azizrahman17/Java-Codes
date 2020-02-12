package Oops2;

public class ConstructorParameterizedExample {
	
	int x;
	int y;
	
	
	 ConstructorParameterizedExample() { // Default Constructors

		 x = 10;     //  value inside the constructor
		 y = 20;
		 
	}
	
	 void display(){
		 
		 System.out.println(y+x);
		 
	 }
	
	

	public static void main(String[] args) {

		ConstructorParameterizedExample G = new ConstructorParameterizedExample();
		G.display();

	}

}
