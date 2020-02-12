package FinalVariable;


final class Bike1 { // Final class can not be Extendes into child class
	
	int speed = 40;
	void run () {
		
		System.out.println(speed);
		
	}
	
}

//class Honda extends Bike1 {        // (final class cant be extends the child class/ another class )
	
	
	
	
//}


public class FinalKeyExample {
	
	 final int speed = 40; // Final key is use for Final value. Later we cant change the value
	

	public static void main(String[] args) {
		FinalKeyExample F = new FinalKeyExample();
		// F.speed = 900;
		
		System.out.println(F.speed);
		
		
		

	}

}
