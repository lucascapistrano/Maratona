<<<<<<< HEAD
package Combinador_1238;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x  = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 0; i < x; i++) {
			
			StringBuilder palavraFormada = new StringBuilder();
			StringBuilder palavra1 = new StringBuilder();
			StringBuilder palavra2 = new StringBuilder(); 
			String nome1 = sc.next();
			String nome2 = sc.next();
			
			palavra1.append(nome1);
			palavra2.append(nome2);
			
			
			while(palavraFormada.length() != (nome1.length() + nome2.length())){
				palavraFormada.append(palavra1.charAt(0));
				palavraFormada.append(palavra2.charAt(0));
				palavra1.deleteCharAt(0);
				palavra2.deleteCharAt(0);
				if(palavra1.length() == 0){
					palavraFormada.append(palavra2);
					break;
				}
				
				if(palavra2.length() == 0){
					palavraFormada.append(palavra1);
					break;
				}
			}
			System.out.println(palavraFormada);	
		}
	}

}
=======
package Combinador_1238;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x  = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 0; i < x; i++) {
			
			StringBuilder palavraFormada = new StringBuilder();
			StringBuilder palavra1 = new StringBuilder();
			StringBuilder palavra2 = new StringBuilder(); 
			String nome1 = sc.next();
			String nome2 = sc.next();
			
			palavra1.append(nome1);
			palavra2.append(nome2);
			
			
			while(palavraFormada.length() != (nome1.length() + nome2.length())){
				palavraFormada.append(palavra1.charAt(0));
				palavraFormada.append(palavra2.charAt(0));
				palavra1.deleteCharAt(0);
				palavra2.deleteCharAt(0);
				if(palavra1.length() == 0){
					palavraFormada.append(palavra2);
					break;
				}
				
				if(palavra2.length() == 0){
					palavraFormada.append(palavra1);
					break;
				}
			}
			System.out.println(palavraFormada);	
		}
	}

}
>>>>>>> origin/master
