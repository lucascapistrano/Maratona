package impar_par_roubo_2059;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int j1 = sc.nextInt();
		int j2 = sc.nextInt();
		int r = sc.nextInt();
		int a = sc.nextInt();
		int vencedor = 0;
		
		
		if((j1 + j2) % 2 == 0){
			if(p == 1){
				vencedor = 1;
			}else{
				vencedor = 2;
			}
		}else {
			if(p == 0){
				vencedor = 1;
			}else{
				vencedor = 2;
			}
		}
		
		if(r == 0 && a == 1) {
			vencedor = 1;
		}else if(r == 1 && a == 1) {
			vencedor = 2;
		}else if(r == 1 && a == 0) {
			vencedor = 1;
		}
		System.out.println("Jogador "+vencedor+" ganha!");
		
	}
}
