	
import  java.util.Scanner;

public class FibonacciNumber {
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("Type any count of fibonacci numbers: ");
	    
	    int n = in.nextInt();
	    int a = 1;
	    int b = 1;
	    int fib = 2;
	    int i = 2; // we started function from the second iteration
	    in.close();
	    
	    System.out.println("Fibonacci numbers: " + n + ":" );
	    System.out.print(a + "+" + b);
	    
	    while (i < n) {
	        fib = a + b;
	        a = b;
	        b = fib;
	        i++;
	        System.out.print(";"+ fib);
	    }
	}
}