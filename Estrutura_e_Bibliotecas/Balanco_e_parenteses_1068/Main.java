package Balanco_e_parenteses_1068;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int aux = 0;
			int fecha = 0;
			int abre = 0;
			StringBuilder entrada = new StringBuilder();
			entrada.append(sc.nextLine());
			boolean resultadoFalso = false;
			
			while(aux < entrada.length()){
				if(entrada.charAt(aux) == ')'){
					fecha++;
					if(fecha > abre){
						resultadoFalso = true;
						break;
					}
				}else if(entrada.charAt(aux) == '('){
					abre++;
				}
				aux++;
			}
			
			if(abre != fecha){
				resultadoFalso = true;
			}
			
			if(resultadoFalso){
				System.out.println("incorrect");
			}else{
				System.out.println("correct");
			}
		}
	}
}