package DesafioDeSaoPetesburgo_1206;

import java.util.Scanner;

public class Main {
	
	public static int retornarColuna(char pos){
		
		if(pos == 'a'){
			return 0;
		}else if(pos == 'b'){
			return 1;
		}else if(pos == 'c'){
			return 2;
		}else if(pos == 'd'){
			return 3;
		}else if(pos == 'e'){
			return 4;
		}else if(pos == 'f'){
			return 5;
		}else if(pos == 'g'){
			return 6;
		}else if(pos == 'h'){
			return 7;
		}
		return 0;
	}
	
	public static int retornarLinha(char pos){
		if(pos == '1'){
			return 0;
		}else if(pos == '2'){
			return 1;
		}else if(pos == '3'){
			return 2;
		}else if(pos == '4'){
			return 3;
		}else if(pos == '5'){
			return 4;
		}else if(pos == '6'){
			return 5;
		}else if(pos == '7'){
			return 6;
		}else if(pos == '8'){
			return 7;
		}
		return 0;
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int x = sc.nextInt();
			sc.nextLine();
			String pecas[] = new String[x];
		    String matriz[][] = new String[8][8];
			
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					matriz[i][j] = ".";
				}
			}
			
			for (int i = 0; i < x; i++) {
				pecas[i] = sc.next();
				matriz[retornarLinha(pecas[i].charAt(2))][retornarColuna(pecas[i].charAt(1))] = "O";
			}
		    
			
			
		    for (int i = 0; i < x; i++) {
				
				if(pecas[i].charAt(0) == 'P'){ //Peão
			
					
				    int linha = retornarLinha(pecas[i].charAt(2)) - 1;
				    int coluna = retornarColuna(pecas[i].charAt(1)) - 1;
				 
				    for (int j = linha; j <= linha; j++) {
						for (int j2 = coluna; j2 <= coluna + 2; j2 = j2 + 2) {
							if(j >= 0 && j <= 7 && j2 >= 0 && j2 <= 7 && !(j == linha + 1 && j2 == coluna + 1)){
								if(matriz[j][j2] != "0" && matriz[j][j2] != "N"){
									matriz[j][j2] = "x";	
								}else{
									matriz[j][j2] = "N";
								}
							}
						}
					}	
				}
				
				else if(pecas[i].charAt(0) == 'T') //Torre
				{
					  int linha = retornarLinha(pecas[i].charAt(2));
					  int coluna = retornarColuna(pecas[i].charAt(1));		
					  
					
					for (int j = linha + 1; j < 8; j++) {
						if(matriz[j][coluna] == "O" || matriz[j][coluna] == "N"){
							matriz[j][coluna] = "N";
							break;
						}
						matriz[j][coluna] = "x";
					}
					
					for (int j = linha - 1; j >= 0; j--) {
						if(matriz[j][coluna] == "O" || matriz[j][coluna] == "N"){
							matriz[j][coluna] = "N";
							break;
						}
						matriz[j][coluna] = "x";
					}
					
					for (int j = coluna - 1; j >= 0; j--) {
						if(matriz[linha][j] == "O" || matriz[linha][j] == "N"){
							matriz[linha][j] = "N";
							break;
						}
						matriz[linha][j] = "x";
					}
					
					for (int j = coluna + 1; j < 8; j++) {
						if(matriz[linha][j] == "O" || matriz[linha][j] == "N"){
							matriz[linha][j] = "N";
							break;
						}
						matriz[linha][j] = "x";
					}
					
			  }
				else if(pecas[i].charAt(0) == 'B') //Bispo
			  {
		
					  int aux = retornarLinha(pecas[i].charAt(2));
					  int y = retornarColuna(pecas[i].charAt(1));		
					  
					  while((aux != 0) && (y != 7))
					  {
							aux--;
							y++;
							if(matriz[aux][y] == "O" || matriz[aux][y] == "N"){
								matriz[aux][y] = "N";
								break;
							}
							matriz[aux][y] = "x";		
					  }
					  
					  aux = retornarLinha(pecas[i].charAt(2));
					  y = retornarColuna(pecas[i].charAt(1));
					  
					  while((aux != 0) && (y != 0))
					  {  
						  aux--;
						  y--;
						  if(matriz[aux][y] == "O" || matriz[aux][y] == "N"){
							  matriz[aux][y] = "N";
								break;
							}
						  matriz[aux][y] = "x";  
					  }
					  
					  aux = retornarLinha(pecas[i].charAt(2));
					  y = retornarColuna(pecas[i].charAt(1));
					  
					  while((aux != 7) && (y != 0))
					  {
							aux++;
							y--;
							if(matriz[aux][y] == "O" || matriz[aux][y] == "N"){
								matriz[aux][y] = "N";
								break;
							}
							matriz[aux][y] = "x";		
					  }
					  
					  aux = retornarLinha(pecas[i].charAt(2));
					  y = retornarColuna(pecas[i].charAt(1));
				
					  while((aux != 7) && (y != 7))
					  {  
						  aux++;
						  y++;
						  if(matriz[aux][y] == "O" || matriz[aux][y] == "N"){
							  matriz[aux][y] = "N";
							  break;
						  }
						  matriz[aux][y] = "x";  
					  }
			  		
			  }else if(pecas[i].charAt(0) == 'R'){ //Rainha
				  
				  int linha = retornarLinha(pecas[i].charAt(2));
				  int coluna = retornarColuna(pecas[i].charAt(1));
				  
				  while((linha != 0) && (coluna != 7))
				  {
						linha--;
						coluna++;
						if(matriz[linha][coluna] == "O" || matriz[linha][coluna] == "N"){
							matriz[linha][coluna] = "N";
							break;
						}
						matriz[linha][coluna] = "x";		
				  }
				  
				  linha = retornarLinha(pecas[i].charAt(2));
				  coluna = retornarColuna(pecas[i].charAt(1));
				  
				  while((linha != 0) && (coluna != 0))
				  {  
					  linha--;
					  coluna--;
					  if(matriz[linha][coluna] == "O" || matriz[linha][coluna] == "N"){
						  matriz[linha][coluna] = "N";
						  break;
						}
					  matriz[linha][coluna] = "x";  
				  }
				  
				  linha = retornarLinha(pecas[i].charAt(2));
				  coluna = retornarColuna(pecas[i].charAt(1));
				  
				  while((linha != 7) && (coluna != 0))
				  {
						linha++;
						coluna--;
						if(matriz[linha][coluna] == "O" || matriz[linha][coluna] == "N"){
							matriz[linha][coluna] = "N";
							break;
						}
						matriz[linha][coluna] = "x";		
				  }
				  
				  linha = retornarLinha(pecas[i].charAt(2));
				  coluna = retornarColuna(pecas[i].charAt(1));
			
				  while((linha != 7) && (coluna != 7))
				  {  
					  linha++;
					  coluna++;
					  if(matriz[linha][coluna] == "O" || matriz[linha][coluna] == "N"){
						  matriz[linha][coluna] = "N";
						  break;
						}
					  matriz[linha][coluna] = "x";  
				  }
			
				  linha = retornarLinha(pecas[i].charAt(2));
				  coluna = retornarColuna(pecas[i].charAt(1));
			
				  
					for (int j = linha + 1; j < 8; j++) {
						if(matriz[j][coluna] == "O" || matriz[j][coluna] == "N"){
							matriz[j][coluna] = "N";
							break;
						}
						matriz[j][coluna] = "x";
					}
					
					for (int j = linha - 1; j >= 0; j--) {
						if(matriz[j][coluna] == "O" || matriz[j][coluna] == "N"){
							matriz[j][coluna] = "N";
							break;
						}
						matriz[j][coluna] = "x";
					}
					
					for (int j = coluna - 1; j >= 0; j--) {
						if(matriz[linha][j] == "O" || matriz[linha][j] == "N"){
							matriz[linha][j] = "N";
							break;
						}
						matriz[linha][j] = "x";
					}
					
					for (int j = coluna + 1; j < 8; j++) {
						if(matriz[linha][j] == "O" || matriz[linha][j] == "N"){
							matriz[linha][j] = "N";
							break;
						}
						matriz[linha][j] = "x";
					}
									
			  }else if(pecas[i].charAt(0) == 'W'){
		  		   
			    int linha = retornarLinha(pecas[i].charAt(2)) - 1;
			    int coluna = retornarColuna(pecas[i].charAt(1)) - 1;
			 
			    for (int j = linha; j <= linha + 2; j++) {
					for (int j2 = coluna; j2 <= coluna + 2; j2++) {
						if(j >= 0 && j <= 7 && j2 >= 0 && j2 <= 7 && !(j == linha + 1 && j2 == coluna + 1)){
							if(matriz[j][j2] != "0" || matriz[j][j2] != "N"){
								matriz[j][j2] = "x";	
							}
						}
					}
				}
			  
			  }		
		    }
			
		    sc.nextLine();					
			
			String rei = sc.next();
			
		    int linha = retornarLinha(rei.charAt(2)) - 1;
		    int coluna = retornarColuna(rei.charAt(1)) - 1;
		    int cont = 0;
		    int contX = 0;
		    
		 for (int j = linha; j <= linha + 2; j++) {
		   for (int j2 = coluna; j2 <= coluna + 2; j2++) {
			if(j >= 0 && j <= 7 && j2 >= 0 && j2 <= 7 && !(j == linha + 1 && j2 == coluna + 1)){
			cont++;
			if(matriz[j][j2] == "x" || matriz[j][j2] == "N"){
			contX++;
			}
		   }
		  }		   
	    }
		    if(cont == contX && matriz[linha + 1][coluna + 1] == "x"){
		    	System.out.println("SIM");
		    }else{
		    	System.out.println("NAO");
		    }
		  			
		    }
		}
	}
 
