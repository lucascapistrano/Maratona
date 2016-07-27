package Bolsa_de_Valores_1932;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dias = sc.nextInt();
		int vlCorretora = sc.nextInt();
		int lucro = 0;
		int indMaior = 0;
		int maior = 0;
		int menor = 2000;
		int indMenor = 0;
		ArrayList<Integer> cot = new ArrayList<>();
		for (int i = 0; i < dias; i++) {
			int cotacoes = sc.nextInt();
			cot.add(cotacoes);
			if (cot.get(i) >= maior) {
				maior = cot.get(i);
				indMaior = i;
				System.out.println(maior);
			}
			if (cot.get(i) <= menor) {
				menor = cot.get(i);
				indMenor = i;
				System.out.println(menor);
			}
		}
		
		if (!(cot.size() == 1)) {
			do{
				if (maior - (menor + vlCorretora) > 0) {				
					lucro = lucro + maior - (menor + vlCorretora);
				}
				cot.remove(indMaior);
				cot.remove(indMenor);
				maior = 0;
				menor = 2000;
				for (int i = 0; i < cot.size(); i++) {
					if (cot.get(i) >= maior) {
						maior = cot.get(i);
						indMaior = i;
					}
				}
				if (indMaior == 0) {
					cot.remove(indMaior);
					menor = 0;
				} else {				
					for (int i = 0; i < indMaior; i++) {
						if (cot.get(i) <= menor) {
							menor = cot.get(i);
							indMenor = i;
						}
					}
				}
			}while (maior - (menor + vlCorretora) > 0);	
		}
			System.out.println(lucro);	
		}
}
