package Consumo_1014;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dist = sc.nextInt();
		float cons = sc.nextFloat();
		
		System.out.printf("%.3f",dist/cons);
		System.out.println(" km/l");	
	}
}
