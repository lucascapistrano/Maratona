package DivisoresI;

import java.util.Scanner;

public class Main {
	
	
	public static void retornarDivisores(int x){
		int y = 1;
		while(x > y){
			if(x % y==0){
				System.out.println(y);
			}
			y++;
		}
		System.out.println(x);
		
			
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		retornarDivisores(x);
	}
	
}
