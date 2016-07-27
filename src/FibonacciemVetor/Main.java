package FibonacciemVetor;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[61];
		int y[] = new int[n];
		a[0] = 0;
		a[1] = 1;
		
		for (int i = 0; i < n; i++) {
			y[i] = sc.nextInt();
		}
		
		for (int i = 2; i < 61; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		for (int i = 0; i < y.length; i++) {
			System.out.println("Fib("+y[i]+") = "+a[y[i]]);
		}
			
		
	}

}
