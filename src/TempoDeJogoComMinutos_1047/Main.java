package TempoDeJogoComMinutos_1047;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int resultado = 0;
		
		if(a1 == a2){
			resultado = 24;
		}else if(a1 < a2){
			resultado = a2 - a1;
		}else{
			while(a1 != a2){
				a1++;
				resultado++;
				if(a1 == 24){
					a1 = 0;
				}
			}
		}
		
		
		
		int min = (resultado * 60) + (b2 - b1);
		
	System.out.println("O JOGO DUROU "+(min / 60)+" HORA(S) E "+(min % 60)+" MINUTO(S)");
		
	}
}
