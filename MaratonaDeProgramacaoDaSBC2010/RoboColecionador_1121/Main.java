package RoboColecionador_1121;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		char[][] campoMatriz = new char[a][b];
		int linhaInicial = 0;
		int colunaInicial = 0;
		char direcaoInicial = ' ';
		
		sc.nextLine();
		
		for (int i = 0; i < a; i++) {
				String j = sc.nextLine();
				for (int k = 0; k < b; k++) {
						campoMatriz[i][k] = j.charAt(k);
						
						if(campoMatriz[i][k] == 'N' || 
							campoMatriz[i][k] == 'S' ||
							 campoMatriz[i][k] == 'L' ||
							  campoMatriz[i][k] == 'O') 
						{
							linhaInicial = i;
							colunaInicial = k;
							direcaoInicial = campoMatriz[i][k];
						}
				}
		}	
			String move = sc.nextLine();
			
			if(direcaoInicial == 'N'){
				//linha - 1;
				//[-1][0]
			}else if(direcaoInicial == 'S'){
				//linha + 1
			}else if(direcaoInicial == 'L'){
				//coluna + 1
			}else{
				//coluna - 1
			}
			
			if(move.charAt(0) == 'D'){
				
			}
			
			for (int i = 0; i < campoMatriz.length; i++) {
				for (int j = 0; j < campoMatriz.length; j++) {
					System.out.print(campoMatriz[i][j]);
				}
				System.out.println();
			}
			
			/*
			for (int i = 0; i < move.length(); i++) {
				if(move.charAt(i) == 'D'){
					
				}else if(move.charAt(i) == 'E'){
					
				}else{
					
				}
			}*/
	  }
}
