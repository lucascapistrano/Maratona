package OBI_URI_2062;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		String palavras = "";
		StringBuilder juntarPalavras = new StringBuilder(); 
		
		for (int i = 0; i < entrada; i++) {
			palavras = sc.next();
			if(palavras.length() == 3) {
				if(palavras.charAt(0) == 'O' && palavras.charAt(1) == 'B'){
					palavras = "OBI";
				}else if(palavras.charAt(0) == 'U' && palavras.charAt(1) == 'R') {
					palavras = "URI";
				}
			}
			if(i == entrada - 1) {
				juntarPalavras.append(palavras);
			}else {
				juntarPalavras.append(palavras);
				juntarPalavras.append(" ");
			}
			
		}
		System.out.println(juntarPalavras);
	}
}
