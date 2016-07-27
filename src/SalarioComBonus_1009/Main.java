package SalarioComBonus_1009;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");
		String nome = sc.next();
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		double total = salario + (vendas * 0.15);
	    System.out.println("TOTAL = R$ "+dc.format(total));
	}
}
