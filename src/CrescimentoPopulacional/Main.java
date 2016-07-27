package CrescimentoPopulacional;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,x,y,z,m;
		int cont = 0;
		float p1,p2;
		t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			p1 = sc.nextFloat();
			p2 = sc.nextFloat();
			
			while (y >= x) {
				z = (int) ((x * p1)/ 100);
				m = (int) ((y * p2)/ 100);
				x = z + x;
				y = y + m;
				cont++;
			if (cont > 100) {
				System.out.println("Mais de 1 seculo.");
				break;
			}
		}
			if (cont <= 100) {
				System.out.println(cont+" anos.");	
			}
			cont = 0;
		}
    		
	}	
}
