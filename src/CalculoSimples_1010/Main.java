package CalculoSimples_1010;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		float c1 = sc.nextFloat();
	
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		float c2 = sc.nextFloat();
		
		float total = (b1 * c1) + (b2 * c2);
		System.out.printf("VALOR A PAGAR: R$ %.2f",total);
		System.out.println();
		
	}
}
