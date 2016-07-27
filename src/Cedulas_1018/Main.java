package Cedulas_1018;

import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
    	System.out.println(valor);
    	int x = 0;
    	
				System.out.println(valor/100+" nota(s) de R$ 100,00");
	    		x = valor % 100;
	    		
	    		System.out.println(x / 50+" nota(s) de R$ 50,00");
	    		x = x % 50;
	    		
	    		System.out.println(x / 20+" nota(s) de R$ 20,00");
	    		x = x % 20;
	    		
	    		System.out.println(x / 10+" nota(s) de R$ 10,00");
	    		x = x % 10;
	    		
	    		System.out.println(x / 5+" nota(s) de R$ 5,00");
	    		x = x % 5;
	    		
	    		System.out.println(x / 2+" nota(s) de R$ 2,00");
	    		x = x % 2;
	    		System.out.println(x+" nota(s) de R$ 1,00");	
       }
}
