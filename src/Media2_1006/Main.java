package Media2_1006;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		double aux = ((a * 2) + (b * 3) + (c * 5)) / 10;
		
		System.out.printf("MEDIA = %.1f",aux);
		System.out.println();
		
	}
}
