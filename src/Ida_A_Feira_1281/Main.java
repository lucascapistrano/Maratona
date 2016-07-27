package Ida_A_Feira_1281;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] m = new int[x * 2]; 
		float cont = 0;
		DecimalFormat dc = new DecimalFormat("0.00");
		
		
		for (int i = 0; i < x; i++) {
			cont = 0;
			m[i] = sc.nextInt();
			
			String[] aux = new String[m[i]]; 
			float[] auxFloat = new float[m[i]];
			
			for (int j = 0; j < auxFloat.length; j++) {
				aux[j] = sc.next();
				auxFloat[j] = sc.nextFloat();	
			}
			
			m[i] = sc.nextInt();

			String[] aux2 = new String[m[i]];
			int[] aux2Int = new int[m[i]];
			
			for (int j = 0; j < aux2Int.length; j++) {
				aux2[j] = sc.next();
				aux2Int[j] = sc.nextInt();
			}
			
			for (int j = 0; j < aux2Int.length; j++) {
				for (int j2 = 0; j2 < auxFloat.length; j2++) {
					if(aux2[j].equals(aux[j2])){
						cont = cont + (aux2Int[j] * auxFloat[j2]);
					}
				}
			}
			System.out.println("R$ "+dc.format(cont));
				
		}
				
			
		}
	}


