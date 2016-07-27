package Figurinhas_1028;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int menor = 0;
			int cont = 2;
			int guardar = 0;
			if(a <= b){
				menor = a;
			}else{
				menor = b;
			}
			
			while((menor % cont) != 0){
				cont++;
			}
				
			if((a % cont) == 0 && (b % cont) == 0){
				guardar = cont;
			}
			
			int aux = cont;
			
			while(cont < menor){
				cont = cont + aux;
				if((a % cont) == 0 && (b % cont) == 0){
					guardar = cont;
				}
			}
			
			System.out.println(cont);
			
		}
		
		
	}

}
