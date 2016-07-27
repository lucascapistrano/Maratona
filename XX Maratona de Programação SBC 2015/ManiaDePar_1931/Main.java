package ManiaDePar_1931;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cidades = sc.nextInt();
		int estradas = sc.nextInt();
		
		int city = 0;
		int pedagio = 0;
		sc.nextLine();
		
		for (int i = 0; i < estradas; i++) {
			String entrada = sc.nextLine();
			String[] spl = entrada.split(" ");
			if (spl[0].equals("1")) {
				city = Integer.parseInt(spl[1]);
				pedagio = pedagio + Integer.parseInt(spl[2]);
			} else {
				for (int j = 0; j < spl.length; j++) {
					if (spl[0].toString().equals(String.valueOf(city))) {
						if ( spl[1].equals(String.valueOf(cidades))) {
							
						}
					}	
				}
			}
		}
	}
}
