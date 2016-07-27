package ComparacaoDeSubstring_1237;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a1 = "";
		String a2 = "";

		while ((a1 = br.readLine()) != null && (a2 = br.readLine()) != null) {

			int maior = 0;
			int contador = 0;

			for (int j = 0; j < a1.length(); j++) {
				for (int j2 = 0; j2 < a2.length(); j2++) {
					if (a1.charAt(j) == a2.charAt(j2)) {
						int auxInd = j;
						int auxInd2 = j2;
						int limiteEntrada1 = j;
						int limiteEntrada2 = j2;
						while (limiteEntrada1 != a1.length()
								&& limiteEntrada2 != a2.length()
								&& a2.charAt(auxInd2) == a1.charAt(auxInd)) {
							contador++;
							if (contador > maior) {
								maior = contador;
							}
							auxInd++;
							auxInd2++;
							limiteEntrada1++;
							limiteEntrada2++;
						}
						contador = 0;
					}
				}
			}
			System.out.println(maior);
		}
	}
}
