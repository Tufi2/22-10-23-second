package practice1;
import java.util.Scanner;
public class Arrays33 {

	public static void main(String[] args) {
		
	int[][][] a = new int[2][3][5];
	     Scanner scan  =   new Scanner(System.in);
	     int i,j,k;
	     for(i=0;i<2;i++) {
	    	 for(j=0;j<3;j++) {
	    		 for(k=0;k<5;k++) {
	    			 System.out.println("Enter the Age of Student from School:" +i + " Classroom:" + j + " Student:"+  k);
	    			   a[i][j][k] = scan.nextInt();
	    		 }
	    			 
	    	 }
	    	 
	    	 
	     }
	    
	     for(i=0;i<2;i++) {
	    	 for(j=0;j<3;j++) {
	    		 for(k=0;k<5;k++) {
	    			 System.out.println(a[i][j][k]+ " ");
	    			   
	    		 }
	    		 System.out.println();
	    	 }
	    	 System.out.println();
	     }

	}

}
