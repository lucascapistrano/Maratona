package Feedback_1546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = -1;
		
		i = sc.nextInt();
		
		
		for (int j = 0; j < i; j++) {
			
			int	indice = sc.nextInt();
			
			for (int k = 0; k < indice; k++) {
				
				int entrada = sc.nextInt();
				
				if (entrada == 1) {
					System.out.println("Rolien");
				}else if(entrada == 2){
					System.out.println("Naej");
				}else if(entrada == 3){
					System.out.println("Elehcim");
				}else if(entrada == 4){
					System.out.println("Odranoel");
				}
			}
		}
		
		
		
		
	}
	
}
