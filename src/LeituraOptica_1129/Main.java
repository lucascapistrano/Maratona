package LeituraOptica_1129;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = -1;
		boolean achou = false;
		int letra = -1;
		int aux = 0;
		while (x !=0) {
			
			x = sc.nextInt();
			int array[] = new int[5];
			
		for (int i = 0; i < x; i++) {
			
			for (int j = 0; j < 5; j++) {
				array[j] = sc.nextInt();
			}

				for (int j = 0; j < array.length; j++) {
					if(achou){
						break;
					}
					aux = 0;
					for (int j2 = 0; j2 < array.length; j2++) {
						if(array[j] <= 127 && array[j2] > 127){
							aux++;
						}
						if(aux == 4){
							letra = j;
							aux = 0;
							achou = true;
							break;
						}
					}				
			     }
			if(letra == 0){
				System.out.println("A");
			}else if(letra == 1){
				System.out.println("B");
			}else if(letra == 2){
				System.out.println("C");
			}else if(letra == 3){
				System.out.println("D");
			}else if(letra == 4){
				System.out.println("E");
			}else{
				System.out.println("*");
			}			
			achou = false;
			letra = -1;
		  }			
		}
	}
}
