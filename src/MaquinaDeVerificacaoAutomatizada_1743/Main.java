package MaquinaDeVerificacaoAutomatizada_1743;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		
		int[] entrada = new int[5];
		int[] saida = new int[5];
		
		for (int i = 0; i < saida.length; i++) {
			entrada[i] = sc.nextInt();
			
			
		}
		
		for (int i = 0; i < saida.length; i++) {
			saida[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < saida.length; i++) {
			if (entrada[i] != saida[i]) {
					cont++;
			}
		}
		
		if (cont == 5) {
			System.out.println("Y");
		}else{
			System.out.println("N");
		}
	}

}
