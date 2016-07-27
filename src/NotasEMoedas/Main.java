package NotasEMoedas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		float x = sc.nextFloat();
		
		
		int aux = (int)x;
		String a = df.format(x - aux);
		
		float b = Float.parseFloat(a.replace(",","."));
		b = b * 100;
		
		int aux2 = (int)b;
		
		System.out.println("NOTAS:");
		System.out.println(aux/100+" nota(s) de R$ 100.00");
		aux = aux % 100;
		System.out.println(aux/50+" nota(s) de R$ 50.00");
		aux = aux % 50;
		System.out.println(aux/20+" nota(s) de R$ 20.00");
		aux = aux % 20;
		System.out.println(aux/10+" nota(s) de R$ 10.00");
		aux = aux % 10;
		System.out.println(aux/5+" nota(s) de R$ 5.00");
		aux = aux % 5;
		System.out.println(aux/2+" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(aux % 2+" moeda(s) de R$ 1.00");
		System.out.println(aux2/50+" moeda(s) de R$ 0.50");
		aux2 = aux2 % 50;
		System.out.println(aux2/25+" moeda(s) de R$ 0.25");
		aux2 = aux2 % 25;
		System.out.println(aux2/10+" moeda(s) de R$ 0.10");
		aux2 = aux2 % 10;
		System.out.println(aux2/5+" moeda(s) de R$ 0.05");
		aux2 = aux2 % 5;
		System.out.println(aux2+" moeda(s) de R$ 0.01");
	}
}
