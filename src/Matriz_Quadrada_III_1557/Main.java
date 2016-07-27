package Matriz_Quadrada_III_1557;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int x = -1;
		
		while (x != 0) {
			
			x = sc.nextInt();
			if (x != 0) {
				int[][] matriz = new int[x][x];
				

				for (int i = 0; i < matriz.length; i++) {
						if (i == 0) {
							matriz[0][i] = 1;
						}else {
							matriz[0][i] = matriz[0][i - 1] * 2;
						}		
					
					}
					for (int i = 1; i < matriz.length; i++) {
						for (int j = 0; j < matriz.length; j++) {
							matriz[i][j] = matriz[i - 1][j] * 2;	
						}
					}
					

					int m = Integer.toString(matriz[matriz.length - 1][matriz.length - 1]).length();
					
					for (int i = 0; i < matriz.length; i++) {
						for (int j = 0; j < matriz.length; j++) {
							if (j == (matriz.length - 1)) {
								if (Integer.toString(matriz[i][j]).length() < m) {
								     int y = m - Integer.toString(matriz[i][j]).length();
								     String aux = " ";
								     for (int k = 0; k < y; k++) {
										System.out.print(aux);
									}
								     System.out.print(matriz[i][j]);
							}else {
									System.out.print(matriz[i][j]);
							}		
								
							}else {
								if (Integer.toString(matriz[i][j]).length() < m) {
								     int y = m - Integer.toString(matriz[i][j]).length();
								     String aux = " ";
								     for (int k = 0; k < y; k++) {
										System.out.print(aux);
									}
								     System.out.print(matriz[i][j]+" ");
							}else {
									System.out.print(matriz[i][j]+" ");
							}
						}
								
						}
						System.out.println();
					}
					
						System.out.println();
					
				}
	
			}
					}
}
