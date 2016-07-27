package NumerosImpares;

import java.util.Scanner;

public class Main {

	
	public static void retornarImpares(int x){
		int y = 1;
		System.out.println(y);
		while(y < x){
			y += 2;
			System.out.println(y);
		}
		
		
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(1 <= x && x <= 1000){
			retornarImpares(x);
		}
	}
	
}