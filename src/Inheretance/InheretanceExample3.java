package Inheretance;

class parent { // Hierarical
	
	int a;
	
	void display (){
		
		System.out.println(a);
		
	}
	
	
}

class child1 extends parent {
	
	int b;
	
	void print () {
		
		System.out.println(b);
	
		
	}
	
	
}

class child2 extends parent{
	
	int c;
	
	void show (){
		
	
	}
	
	
}

class child3 extends parent {
	
	int d;
	
	void show2 (){
		
		System.out.println(d);	
		
	}
	
}

public class InheretanceExample3 {

	public static void main(String[] args) {
		
		child1 ch1 = new child1();
		ch1.a = 100;
		ch1.b = 200;
		ch1.display();
		ch1.print();
		
		
		
		child2 ch2 = new child2();
		ch2.a = 300;
		ch2.c = 400;
		ch2.show();
		ch2.display();
		
		
		child3  ch3 = new child3();
		
		ch3.a = 900;
		ch3.d = 800;
		ch3.display();
		ch3.show2();
		
		
		
		
		
		
	}

}
