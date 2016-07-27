package JogoDaEstrategia_1940;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jogadores = sc.nextInt();
		int rodadas = sc.nextInt();
		int pontos = 0;
		int[] pontosJogadores = new int[jogadores];
		int ind = 0;
		int aux = 0;
		int maior = 0;
		for (int i = 0; i < jogadores * rodadas; i++) {
			pontos = sc.nextInt();
			pontosJogadores[ind] = pontosJogadores[ind] + pontos;
			ind++;
			if(ind == jogadores){
				for (int j = 0; j < pontosJogadores.length; j++) {
					if(pontosJogadores[j] >= maior){
						maior = pontosJogadores[j];
						aux = j;
					}
				}
				ind = 0;
			}
		}
		System.out.println(aux + 1);
	}
}