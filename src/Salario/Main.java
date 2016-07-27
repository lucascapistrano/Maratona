package Salario;

import java.awt.image.ReplicateScaleFilter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");
		int x = sc.nextInt();
		int y = sc.nextInt();
		String m = sc.next();
		
		float z = Float.parseFloat(m);
		
		float resultado = y*z;
		
		m = dc.format(resultado).toString();
		
		System.out.println("NUMBER = "+x);	
		System.out.println("SALARY = U$ "+(m.replace(",", ".")));
		
	}
	
}
