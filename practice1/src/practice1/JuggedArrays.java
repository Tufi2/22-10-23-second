package practice1;
import java.util.Scanner;

public class JuggedArrays {

	public static void main(String[] args) {
	 int[][]  a = new int[2][];
	 a[0] = new int[2];
	 a[1] = new int[5];
	 
	     Scanner  scan = new Scanner(System.in);
	     for(int i=0;i<a.length;i++) {
	    	 for(int j=0;j<a[i].length;j++) {
	    		 System.out.println("Enter the age of class" + i+ " student "+j);
	    		  a[i][j]=scan.nextInt();
	    		  
	    		  
	    		  
	    		 
	    	 }
	    	 
	     } 
	     System.out.println("The ages are: ");
	     

	     for(int i=0;i<a.length;i++) {
	    	 for(int j=0;j<a[i].length;j++) {
	    		 System.out.println(a[i][j]+ " ");
	    	 }
	     }
            System.out.println();
	}

}
