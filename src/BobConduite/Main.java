package BobConduite;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		String texto = sc.nextLine();
		  
		String frutas[] = texto.split(" ");  
		System.out.println(frutas[0]); //imprime banana  
		System.out.println(frutas[1]); //imprime maçã  
		System.out.println(frutas[2]); //imprime laranja  

		
		
		
	}

}
