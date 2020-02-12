package MultiDimisionArray;

public class MultiArrayDimisionsExample {

	public static void main(String[] args) {
		int a [][] = new int [3][2];   // (declear) the first [][] are the rows and the second [][] are for the colunms
		a [0] [0] = 100;  //first 0 is the index of the row, and second 0 is the index of the colunm
		a [0] [1] = 200;
		
		a [1] [0] = 300;  
		a [1] [1] = 400;		
		
		a [2] [0] = 500;
		a [2] [1] = 600;
	
		System.out.println("Number of the Rows: " + a.length);
		System.out.println("Number of the Colunms: " + a[0].length);
		
		

		
		for (int i = 0; i<a.length;i++) {  // show the index of rhe rows
			
			for (int j = 0; j<a[i].length;j++) // show the index of the colunm
			
			System.out.println(a[i][j]);// show the value
			
		}
		
	}

}
