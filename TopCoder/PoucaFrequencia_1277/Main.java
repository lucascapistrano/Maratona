package PoucaFrequencia_1277;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {

		int y = sc.nextInt();
		
			String alunos[] = new String[y];
			String notas[] = new String[y];
			StringBuilder arm = new StringBuilder();
			
			sc.nextLine();
			
			for (int j = 0; j < alunos.length; j++) {
				alunos[j] = sc.next();
			}
			
			
			for (int j = 0; j < notas.length; j++) {
				notas[j] = sc.next();
			}
			
			
			
			for (int j = 0; j < notas.length; j++) {
				int tamanho = notas[j].length();
				int contA = 0;
				
				for (int j2 = 0; j2 < notas[j].length(); j2++) {
					if(notas[j].charAt(j2) == 'A'){
					  	contA++;
				    }else if(notas[j].charAt(j2) == 'M'){
				    	tamanho--;
				    }	
			    }	
				if(((100 * contA) / tamanho) > 25){
					arm.append(alunos[j]+" ");
				}
			}
			
			if(arm.length() > 0){
				arm.deleteCharAt(arm.length() - 1);	
			}
			System.out.println(arm);
		}
	}
}
