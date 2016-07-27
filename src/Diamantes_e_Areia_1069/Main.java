package Diamantes_e_Areia_1069;


import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int x = sc.nextInt();
		String[] m = new String[x];
		
		for (int i = 0; i < x; i++) {
			int cont1 = 0;			
			m[i] = sc.next();
			StringBuilder sb = new StringBuilder(m[i]);
			
			for (int j = 0; j < m[i].length(); j++) {
				  if (m[i].charAt(j) == '<') {
					for (int j2 = j; j2 < m[i].length(); j2++) { 
						if (m[i].charAt(j2) == '>') {
							sb.deleteCharAt(j);
							sb.deleteCharAt(j2 - 1);
							m[i] = sb.toString();
							cont1++;
							break;
						}
						
					}
			}
		
				  
		}				
		System.out.println(cont1);
	}
			
		}
		
	}
	
	
