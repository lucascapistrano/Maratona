package Lanche_1038;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x == 1){
			double m = 4;
			System.out.println("Total: R$ "+df.format((m*y)).replace(",", "."));
		}else if(x == 2){
			double m = 4.5;
			System.out.println("Total: R$ "+df.format((m*y)).replace(",", "."));
		}else if(x == 3){
			double m = 5;
			System.out.println("Total: R$ "+df.format((m*y)).replace(",", "."));
		}else if(x == 4){
			double m = 2;
			System.out.println("Total: R$ "+df.format((m*y)).replace(",", "."));
		}else if(x == 5){
			double m = 1.5;
			System.out.println("Total: R$ "+df.format((m*y)).replace(",", "."));
		}
	}
}
