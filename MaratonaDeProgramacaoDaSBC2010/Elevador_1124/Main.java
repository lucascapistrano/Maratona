package Elevador_1124;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		boolean entrou = false;
		
		double hip = Math.sqrt((a * a) + (b * b));
		
		if(hip > (c + c) + (d + d)){
			entrou = true;
		}
		
		if(entrou){
			System.out.println("S");
		}else{
			System.out.println("N");
		}
		
	}
}
