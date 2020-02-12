package OverLoadingExamples;

public class MethodOverLoadingExample {
	

	void add (int a, int b) 
	{
		System.out.println(a+b);
		}
	
	void add (int a, double b)     // we overlaod the method with changing the datatype
	{
		System.out.println(a+b);
		}// method OverLoading the feature that allows a class to have more then one method have the same name
	
	void add (double a, double b)   // we overlaod the method again with changing the datatype
	{
		System.out.println(a+b);
		}
	void add (int a, int b,int c)   //we overlaod the method again with changing the datatype
	{
		System.out.println(a+b+c);
		}
	void add (String a, int b,int c)   //we overlaod the method again with changing the datatype
	{
		System.out.println(a+b+c);
		}
	
	
	public static void main(String[] args) {
		
		MethodOverLoadingExample mo = new MethodOverLoadingExample();
		mo.add(12, 12);
		mo.add(20,20.2);
		mo.add(20.11, 20.11);
		mo.add(20, 20, 20);
	}

}
