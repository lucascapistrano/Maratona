package Media1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();	
		float b = sc.nextFloat();
		
		
		double aux = ((a * 3.5) + (b * 7.5)) / 11;
	System.out.printf("MEDIA = %.5f",aux);
	System.out.println();
	
	}
	
}
