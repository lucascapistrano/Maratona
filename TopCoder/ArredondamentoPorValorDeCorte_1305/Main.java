<<<<<<< HEAD
package ArredondamentoPorValorDeCorte_1305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numero1 = "";
		String numero2 = "";

		while ((numero1 = br.readLine()) != null
				&& (numero2 = br.readLine()) != null) {
			StringBuilder a = new StringBuilder();
			StringBuilder b = new StringBuilder();
			boolean achouVirgula = false;
			a.append(numero1);
			b.append(numero2);
			while (a.charAt(0) == '0') {
				a.deleteCharAt(0);
			}
			while (b.charAt(0) == '0') {
				b.deleteCharAt(0);
			}
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == '.') {
					a.replace(i, i + 1, ",");
					achouVirgula = true;
					break;
				}
			}
			if (!achouVirgula){
				a.append(",");
			}
			for (int i = 0; i < b.length(); i++) {
				if (b.charAt(i) == '.') {
					b.replace(i, i + 1, ",");
				}
			}
			String separaString1[] = a.toString().split(",");
			String separaString2[] = b.toString().split(",");
			if (separaString1[1] == "") {
				separaString1[1] = "0";
			}
			int inteiro = 0;
			if (separaString1[0].equals("")) {
				inteiro = 0;
				if (Integer.parseInt(separaString1[1]) > Integer
						.parseInt(separaString2[1])) {
					inteiro++;
				} else if (Integer.parseInt(separaString1[1]) == Integer
						.parseInt(separaString2[1])) {
					if (separaString1[1].length() < separaString2[1].length()) {
						inteiro++;
					}
				}
			} else {
				inteiro = Integer.parseInt(separaString1[0]);
				if (Integer.parseInt(separaString1[1]) > Integer
						.parseInt(separaString2[1])) {
					inteiro++;
				} else if (Integer.parseInt(separaString1[1]) == Integer
						.parseInt(separaString2[1])) {
					if (separaString1[1].length() > separaString2[1].length()) {
						inteiro++;
					}
				}

			}
			System.out.println(inteiro);
		}
	}
}
=======
package ArredondamentoPorValorDeCorte_1305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numero1 = "";
		String numero2 = "";

		while ((numero1 = br.readLine()) != null
				&& (numero2 = br.readLine()) != null) {
			StringBuilder a = new StringBuilder();
			StringBuilder b = new StringBuilder();
			boolean achouVirgula = false;
			a.append(numero1);
			b.append(numero2);
			while (a.charAt(0) == '0') {
				a.deleteCharAt(0);
			}
			while (b.charAt(0) == '0') {
				b.deleteCharAt(0);
			}
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == '.') {
					a.replace(i, i + 1, ",");
					achouVirgula = true;
					break;
				}
			}
			if (!achouVirgula){
				a.append(",");
			}
			for (int i = 0; i < b.length(); i++) {
				if (b.charAt(i) == '.') {
					b.replace(i, i + 1, ",");
				}
			}
			String separaString1[] = a.toString().split(",");
			String separaString2[] = b.toString().split(",");
			if (separaString1[1] == "") {
				separaString1[1] = "0";
			}
			int inteiro = 0;
			if (separaString1[0].equals("")) {
				inteiro = 0;
				if (Integer.parseInt(separaString1[1]) > Integer
						.parseInt(separaString2[1])) {
					inteiro++;
				} else if (Integer.parseInt(separaString1[1]) == Integer
						.parseInt(separaString2[1])) {
					if (separaString1[1].length() < separaString2[1].length()) {
						inteiro++;
					}
				}
			} else {
				inteiro = Integer.parseInt(separaString1[0]);
				if (Integer.parseInt(separaString1[1]) > Integer
						.parseInt(separaString2[1])) {
					inteiro++;
				} else if (Integer.parseInt(separaString1[1]) == Integer
						.parseInt(separaString2[1])) {
					if (separaString1[1].length() > separaString2[1].length()) {
						inteiro++;
					}
				}

			}
			System.out.println(inteiro);
		}
	}
}
>>>>>>> origin/master
