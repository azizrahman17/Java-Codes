package Switch;

import javax.rmi.CORBA.StubDelegate;

public class switchExample {

	public static void main(String[] args) {

		String studentName = "khan";
		switch (studentName) {

		case "khan":
			System.out.println("987654345");
			break;
		case "ahmad":
			System.out.println("ahmad");
			break;
		case "khalid":
			System.out.println("khalid");
			break;
		case "janan":
			System.out.println("janan");
			break;
		default:
			System.out.println("there are not name matched");

		}

	}

}
