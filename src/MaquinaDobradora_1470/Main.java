package MaquinaDobradora_1470;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNext()){
			int x = sc.nextInt();
			int [] array = new int[x];
			
			
			for (int i = 0; i < x; i++) {
			     array[i] = sc.nextInt();
			}
			
			int y = sc.nextInt();
			int [] array2 = new int[y];
			
			for (int i = 0; i < y; i++) {
				array2[i] = sc.nextInt();
			}
			
			int metade = array.length / 2;
			int metadeMenosUm = (array.length / 2) - 1;
			
			if((array.length - metade) == array2.length){
				
				if (array2[0] == array[0]) {
				int cont = 0;
				int aux = metade;
					for (int i = 1; i < array2.length; i++) {
						if (array2[i] == (array[i] + array[i + aux])) {
							 cont++;  
						}
						if (cont == metade) {
							System.out.println("S");
						}
						aux--;
					}
				}
				
				
				
			}
			
			if (array.length == array2.length) {
				
			}
			
			if ((array.length - metadeMenosUm) == array2.length) {
				
			}
			
			
			
			
			
			
			
		}
		
		
		
	}
	
}
