package Conversa_Internacional_1581;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entr = sc.nextInt();
		boolean saidaIngles = false;
		String primeiraLingua = "";
		for (int i = 0; i < entr; i++) {
			int qtd = sc.nextInt();
			String[] persons = new String[qtd];
			sc.nextLine();
			for (int j = 0; j < qtd; j++) {
				persons[j] = sc.nextLine();
				primeiraLingua = persons[0];
				if(!persons[j].equals(primeiraLingua)){
					saidaIngles = true;
				}
			}
			if(saidaIngles){
				System.out.println("ingles");
				saidaIngles = false;
			}else{
				System.out.println(primeiraLingua);
			}
		}
		
		
	}
}
