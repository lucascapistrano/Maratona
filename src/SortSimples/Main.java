package SortSimples;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int aux = 0;
		
		int a1 = a;
		int b1 = b;
		int c1 = c;
		
		
		if(b < a){
			aux = a;
			a = b;
			b = aux;
		}
		
		if(c < a){
			aux = a;
			a = c;
			c = aux;
		}
		
		if(c < b){
			aux = b;
			b = c;
			c = aux;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		
	}
}
