package Fatorial_1936;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		int aux = 0;
		int fat = 1;
		int num = 1;
		int auxFat = 0;
		
		while(entrada != 0){
			while(entrada >= fat){
				auxFat = fat;
				num++;
				fat = 1;
				for (int i = 1; i < num; i++) {
						fat = fat * i;
				}
			}
			entrada = entrada - auxFat;
			aux++;
			fat = 1;
			num = 1;
		}
		System.out.println(aux);
	}
}
