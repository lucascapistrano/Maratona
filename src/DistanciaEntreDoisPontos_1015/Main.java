package DistanciaEntreDoisPontos_1015;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();
		
		System.out.printf("%.4f",Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1))));
		System.out.println();	
	}
}
