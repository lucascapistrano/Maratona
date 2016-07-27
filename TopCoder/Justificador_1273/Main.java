<<<<<<< HEAD
package Justificador_1273;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = -1;
		int cont = 0;
		boolean val = false;
		
		while(x != 0){
			
			x = sc.nextInt();
			
			if(x == 0){
				break;
			}
			
			
			
			sc.nextLine();
			String nome[] = new String[x];
			int maior = 0;
			for (int i = 0; i < x; i++) {
				nome[i] = sc.nextLine();
				if(nome[i].length() > maior){
					maior = nome[i].length();
				}
			}
			
			if(val){
				System.out.println();
			}
			
			for (int i = 0; i < nome.length; i++) {
				if(nome[i].length() < maior){
					int aux = maior - nome[i].length();
					for (int j = 0; j < aux; j++) {
						System.out.print(" ");
					}
					System.out.println(nome[i]);
				}else{
					System.out.println(nome[i]);
				}
			}
			
			val = true;
		}
	}
}
=======
package Justificador_1273;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = -1;
		int cont = 0;
		boolean val = false;
		
		while(x != 0){
			
			x = sc.nextInt();
			
			if(x == 0){
				break;
			}
			
			
			
			sc.nextLine();
			String nome[] = new String[x];
			int maior = 0;
			for (int i = 0; i < x; i++) {
				nome[i] = sc.nextLine();
				if(nome[i].length() > maior){
					maior = nome[i].length();
				}
			}
			
			if(val){
				System.out.println();
			}
			
			for (int i = 0; i < nome.length; i++) {
				if(nome[i].length() < maior){
					int aux = maior - nome[i].length();
					for (int j = 0; j < aux; j++) {
						System.out.print(" ");
					}
					System.out.println(nome[i]);
				}else{
					System.out.println(nome[i]);
				}
			}
			
			val = true;
		}
	}
}
>>>>>>> origin/master
