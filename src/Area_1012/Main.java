package Area_1012;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		double pi = 3.14159;
		
		
		System.out.printf("TRIANGULO: %.3f",(a * c)/2);
		System.out.println();
		System.out.printf("CIRCULO: %.3f",(c * c) * pi);
		System.out.println();
		System.out.printf("TRAPEZIO: %.3f",((a + b) * c) / 2);
		System.out.println();
		System.out.printf("QUADRADO: %.3f",(b * b));
		System.out.println();
		System.out.printf("RETANGULO: %.3f",(a * b));
		System.out.println();
		
		
	}

}
