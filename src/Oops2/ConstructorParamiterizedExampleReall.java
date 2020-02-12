package Oops2;

public class ConstructorParamiterizedExampleReall {
	
	int x;
	int y;
	
	ConstructorParamiterizedExampleReall (int a , int b){
		
		x =a;
		y =b;
		
		System.out.println(x+y);
	}
	
	/*void display() {         // we dont need method (if you have its okey)
		
		
		
	}*/
	
	

	public static void main(String[] args) {
		
		ConstructorParamiterizedExampleReall h = new ConstructorParamiterizedExampleReall(12, 13);
			
		
		//h.display();
	}

}
