package Fibonacci_quantas_chamadas_1029;

import java.util.Scanner;

public class Main {
static int cont1 = 0;
	
	public static int recursivo(int num){
		if(num == 0){
			cont1++;
			return 0;
		}else if(num == 1){
			cont1++;
			return 1;
		}else{
			cont1++;
			return (recursivo(num - 1)+recursivo(num - 2));
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = -1;
		
		
		num = sc.nextInt();
		int[] m = new int[num];
		
		for (int i = 0; i < m.length; i++) {
			int aux = 0;
			m[i] = sc.nextInt();
			aux = recursivo(m[i]);
			System.out.println("fib("+m[i]+") = "+(cont1 - 1)+" calls = "+aux);
			cont1 = 0;
		}
		
		
		
	}
	
	
}
