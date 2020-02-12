package Oops;

public class OopsExample1 {
	int eid;
	String eName;
	double sal;
	int deptNo;
	String job;
	
	/////                                  this above part is class 
	void display () {
		
		System.out.println(eid);
		System.out.println(eName);
		System.out.println(sal);
		System.out.println(deptNo);
		System.out.println(job);
	}
										// this above part is method

	public static void main(String[] args) {
		
		//  1)  Class ==>   collection of Variables and method
		//  2)  Method ==>  block of code which contents a logic
		//  3)  Object ==>  object Instance of the class
	
	
		OopsExample1 emp1 = new OopsExample1(); /// here we create object
		emp1.eid = 102;
		emp1.eName = "aziz";
		emp1.sal = 1200000;
		emp1.deptNo = 120;
		emp1.job = "Developer";
		emp1.display();
		OopsExample1 emp2 = new OopsExample1();
		
		System.out.println();

		emp2.eid = 103;
		emp2.eName = "rahman";
		emp2.sal = 120;
		emp2.deptNo = 12;
		emp2.job = "QA tester";
		emp2.display(); // here we call method
		
		
		
		
		
		
		

	
	}

}
