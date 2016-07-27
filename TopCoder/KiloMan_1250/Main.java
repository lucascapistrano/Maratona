package KiloMan_1250;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {
			int y = sc.nextInt();
			int array[] = new int[y];
			int cont = 0;
			
			for (int j = 0; j < y; j++) {
				array[j] = sc.nextInt();
			}
			
			sc.nextLine();
			
			String pulo = sc.nextLine();
			
			for (int j = 0; j < y; j++) {
				if(pulo.charAt(j) == 'S' && array[j] <= 2){
					cont++;
				}else if (pulo.charAt(j) == 'J' && array[j] > 2){
					cont++;
				}
			}
			
			System.out.println(cont);
		}
	}
}
