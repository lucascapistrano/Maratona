package Matriz123;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0; 
	
		
		while (sc.hasNext()) {
			a = sc.nextInt();
			int matriz[][] = new int[a][a];
			matriz[0][0] = 1;
			matriz[0][a-1]=2;
			
			int x = a-1;
			
			
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < a; j++) {
					if (matriz[i][j] != 1 && matriz[i][j] != 2) {
						matriz[i][j]=3;
					}
				}
				
				matriz[i][i] = 1;
				matriz[i][x] = 2;
				x--;
			
			}
		
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < a; j++) {
					System.out.print(matriz[i][j]);
				}
				System.out.println();
			}
			
			
		
		}
		
		
		
		
	}
	
}
