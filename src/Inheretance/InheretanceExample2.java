package Inheretance;


class A1 {    // multiple inheretance 
	
	int a;
	
	void display (){
		
		System.out.println(a);
		
	}
	
}

class B1 extends A1 {
	
	int b;
	void print () {
		
		System.out.println(b);
		
	}
	
	
	
}

class C1 extends B1 {
	
	int c;
	
	void show () {
		
		System.out.println(c);
		
	}
	
	
}


public class InheretanceExample2 {

	public static void main(String[] args) {
		
		C1 obj = new C1();
		
		obj.a = 20;
		obj.b = 40;
		obj.c = 60;
		
		obj.display();
		obj.print();
		obj.show();
		
		
		
		
	}

}
