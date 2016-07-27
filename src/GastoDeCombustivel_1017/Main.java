package GastoDeCombustivel_1017;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextInt();
		float b = sc.nextInt();
		
		System.out.printf("%.3f",(a * b)/12);
		System.out.println();
	}
}
