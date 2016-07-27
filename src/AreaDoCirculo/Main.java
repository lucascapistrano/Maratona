package AreaDoCirculo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String r = sc.next();
			Double raio = null;
			raio = Double.parseDouble(r);
		
	    DecimalFormat dc = new DecimalFormat("0.0000");
			
		Double dv = 3.14159 * (raio * raio);
		String t = dc.format(dv).toString();
		
		System.out.println("A="+t.replace(",","."));		
	}
	
}
