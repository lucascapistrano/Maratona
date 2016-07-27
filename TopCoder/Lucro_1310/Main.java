package Lucro_1310;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int valorDia = sc.nextInt();
		int lucroDia[] = new int[x];
		int cont = 1;
		int somaTotal = 0;
		
		for (int i = 0; i < x; i++) {
			lucroDia[i] = sc.nextInt();
		}
		
		for (int i = 0; i < lucroDia.length; i++) {
			for (int j = 1; j < lucroDia.length; j++) {
				int soma = lucroDia[i] + lucroDia[j];
				if(valorDia * cont > soma){
					break;
				}else{
					somaTotal = soma + somaTotal;
				}
			}
		}
		
	}

}
