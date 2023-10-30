package practice1;
import java.util.Scanner;

public class Arrays22 {

	public static void main(String[] args) {
		 
	int[][]  a = new int[2][4];
	        Scanner scan =  new Scanner(System.in);
	         int i,j;
	         for(i=0;i<a.length;i++) {
	        	 for(j=0;j<a[i].length;j++) {
	        		 System.out.print("Enter the age of class " + i + " Students " + j + " : ");
	        		  a[i][j]= scan.nextInt();
	        	 }
	         }
	         
		
	         for(i=0;i<a.length;i++) {
	        	 for(j=0;j<a[i].length;j++) {
	        		 System.out.print(a[i][j] + " ");
	        		 
	        	 }
	        	 System.out.println();
	         }

	}

}
