package OverRidingMethod;

class bank {
	
	double rateOfIntrest() {
		return 0;
		
	}
	
}

class Citi extends bank{
	
	double rateOfIntrest () {
		
		return 0;
		
		
	}
	
	
}

class bankOfAmerica extends bank{
	
	double rateOfIntrest () {
		
		return 5.5;
		
	}
	
	
}

class CapitalOne extends bank{
	
	double rateOfIntrest(){
		
		return 22.2;
		
	}
	
	
}

public class OverRidingExample {

	public static void main(String[] args) {
		
		Citi ct = new Citi();
		System.out.println(ct.rateOfIntrest()+" :Intrest Rate of Citi bank");
		bankOfAmerica bnk = new bankOfAmerica();
		System.out.println(bnk.rateOfIntrest()+" :Intrest Rate of Bank Of America");
		CapitalOne cpt = new CapitalOne();
		System.out.println(cpt.rateOfIntrest()+" :Intrest Rate of Capital bank");
		
		

	}

}
