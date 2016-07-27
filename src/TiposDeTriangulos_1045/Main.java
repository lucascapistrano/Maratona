package TiposDeTriangulos_1045;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		float[] n = new float[3];
		float aux = 0;
	
		for (int i = 0; i < 3; i++) {
			n[i] = sc.nextFloat();
	    }
		
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = 1; j < n.length; j++) {
				if(n[i] < n[j]){
					aux = n[i];
				    n[i] = n[j];
				    n[j] = aux;
				}
			}
		}
		
		
		if(n[0] >= n[1]+n[2]){
			System.out.println("NAO FORMA TRIANGULO");
		}else{
			
			if((n[0] * n[0]) == ((n[1] * n[1]) + (n[2] * n[2]))) {
				System.out.println("TRIANGULO RETANGULO");
			}if((n[0] * n[0]) > ((n[1] * n[1]) + (n[2] * n[2]))) {
				System.out.println("TRIANGULO OBTUSANGULO");	
			}if((n[0] * n[0]) < ((n[1] * n[1]) + (n[2] * n[2]))) {
				System.out.println("TRIANGULO ACUTANGULO");
			}if(n[0] == n[1] && n[0] == n[2]){
				System.out.println("TRIANGULO EQUILATERO");
			}if((n[0] == n[1] && n[0] != n[2]) || (n[0] == n[2] && n[0] != n[1])|| (n[1] == n[2] && n[1] != n[0])){
				System.out.println("TRIANGULO ISOSCELES");
			}
			
			
		}
	}
}
