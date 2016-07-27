package Dama_1087;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String x = "";
		int[] k = new int[4];
		
		 while (!x.equals("0 0 0 0")){	
			
			x =sc.nextLine();
			String m[] = x.split(" ");
			for (int i = 0; i < 4; i++) {
				k[i] = Integer.parseInt(m[i]);
			}
			if (!x.equals("0 0 0 0")) {
				if((k[0] == k[2]) && (k[1] == k[3])) {
					System.out.println(0);				
				}else if ((k[0] - k[2]) == (k[1] - k[3]) ||
						(k[0] - k[2]) == (k[3] - k[1]) || 
						(k[2] - k[0]) == (k[1] - k[3]) ||
						(k[2] - k[0]) == (k[3] - k[1])){ // Diagonal
					System.out.println(1); 
				}else if((k[0] == k[2]) || (k[1] == k[3])){ // Mesma coluna ou mesma linha
					System.out.println(1);
				}	
				}else {
					System.out.println(2);
				}	
			}						
		}				
	}


