package Esfera;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.000");
		
		int r = sc.nextInt();
		
		Double v = (4.0/3) * 3.14159 * Math.pow(r, 3); 
		
		
		
		System.out.print("VOLUME = "+dec.format(v)+"\n");
		
	}
	
}
