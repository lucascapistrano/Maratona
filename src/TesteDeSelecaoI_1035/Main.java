package TesteDeSelecaoI_1035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		boolean entrou = false;
		
		if(b > c){
			if(d > a){
				if((c+d) > (a+b)){
					if(c > 0 && d >0){
						if(a % 2 == 0){
							entrou = true;
						}
					}
				}
	      	}
		}
		
		if(entrou){
			System.out.println("Valores aceitos");
		}else{
			System.out.println("Valores nao aceitos");
		}
	}
	
}
