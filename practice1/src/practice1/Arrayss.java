package practice1;
import java.util.Scanner;

public class Arrayss {

	public static void main(String[] args) {
	int[ ] a =  new int[5];
	 Scanner scan = new Scanner(System.in);
	 for(int i=0;i<5;i++) {
		System.out.println("Enter the age : ");
		a[i]   = scan.nextInt();
		
		 
	 }
	 for(int i=0;i<5;i++) {
		 System.out.println(a[i] + " ");
	 }

	}
 
	
	
}
