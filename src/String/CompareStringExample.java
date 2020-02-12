package String;

public class CompareStringExample {

	public static void main(String[] args) {
		
		String s = "wellcome";
		
		System.out.println(s.equals("wellcome")); // SHOW THE CAMPARISION OF THE CHARACTORS
		System.out.println(s.equals("welcome"));
		System.out.println(s.equals("wallcomw"));
		System.out.println(s.equalsIgnoreCase("WELLCOME"));
		
		System.out.println(s.equals("ahmad"));
	}

}
