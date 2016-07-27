package Formula_de_Bhaskara_1036;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00000");
		
		Double a,b,c,x,m,y = -1.0;
		
		
		while (sc.hasNext()) {
		
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			m = ((b*b) - (4*a*c));
			
			if ((a == 0) || (m < 0)) {
				System.out.println("Impossivel calcular");
			}else {
			
				x = (-b + Math.sqrt(m) )/ (2*a);
				y = (-b - Math.sqrt(m)) / (2*a);
				
				System.out.printf("R1 = "+dc.format(x).toString());
				System.out.println();
				System.out.printf("R2 = "+dc.format(y).toString());
				System.out.println();
				
			}
			
				
			
		}
				

	}

}
