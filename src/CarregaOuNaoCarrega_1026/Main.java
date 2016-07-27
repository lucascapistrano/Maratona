package CarregaOuNaoCarrega_1026;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 2;
		int soma = 0;
		int exp = 0;
		
		while (b != soma) {
			
		c = (int) Math.pow(2, exp);
		soma = c + soma;
		exp++;
			
		if(soma > b){
			soma = 0;
			exp = 0;
		}
		
		}
		
	}

}
