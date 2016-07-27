package TempoDeJogo_1046;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int resultado = 0;
		
		if(a == b){
			resultado = 24;
		}else if(a < b){
			resultado = b - a;
		}else{
			while(a != b){
				a++;
				resultado++;
				if(a == 24){
					a = 0;
				}
			}
		}
		System.out.println("O JOGO DUROU "+resultado+" HORA(S)");
	}

}
