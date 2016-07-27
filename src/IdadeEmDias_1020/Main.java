package IdadeEmDias_1020;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	
	System.out.println(x/365+" ano(s)");
	x = x % 365;
	System.out.println(x/30+" mes(es)");
	x = x % 30;
	System.out.println(x+" dia(s)");
	
	}
}
