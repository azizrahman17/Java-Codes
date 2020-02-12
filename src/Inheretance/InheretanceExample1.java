package Inheretance;

class A // parent class
{
	int a;

	void display() {
		
		System.out.println(a);
		
	}

}

class B extends A // B is child and A is parent class
 {
	int b;
	
	void print(){
		
		System.out.println(b);	
		
	}
		
} 

public class InheretanceExample1 {// single inheretance

	public static void main(String[] args) {
		
		A obj = new A();
		obj.a = 100;
		obj.display();
		
		B obj2 = new B();
		obj2.b = 200;
		obj2.a = 300;
		obj2.display();
		obj2.print();
		
		
	}

}
