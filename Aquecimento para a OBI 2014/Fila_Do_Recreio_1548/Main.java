package Fila_Do_Recreio_1548;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		int contTroca = 0;
		for (int i = 0; i < entrada; i++) {
			int qtdDeAlunos = sc.nextInt();
			int[] alunos = new int[qtdDeAlunos];
			for (int j = 0; j < qtdDeAlunos; j++) {
				alunos[j] = sc.nextInt();
			}
			for (int j = 0; j < alunos.length - 1; j++) {
				for (int j2 = j; j2 < alunos.length; j2++) {
					if(alunos[j] < alunos[j2]){
						int aux = alunos[j];
						alunos[j] = alunos[j2];
						alunos[j2] = aux;
						contTroca = contTroca + 2;
					}
				}
			}
			
			System.out.println(qtdDeAlunos - contTroca);
			contTroca = 0;
		}	
	}
}
			