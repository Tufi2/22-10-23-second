package practice1;

public class RecursiveFactorial {
	public static void main(String[] args) {
		int number = 5;
		long factorial = calculateFactorial(number);
		System.out.println("Factorial of " + number + " is " + factorial);
	}

	public static long calculateFactorial(int n) {
		// Base case: factorial of 0 is 1
		if (n == 0) {
			return 1;
		} else {
			// Recursive case: n! = n * (n-1)!
			return n * calculateFactorial(n - 1);
		}
	}
}
//to commit