<<<<<<< HEAD
package CifraDeCesar_1253;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 0; i < x; i++) {
			String a = sc.next();
			int b = sc.nextInt();
			int cont = 0;
			StringBuilder msgFormada = new StringBuilder();
			
			
			for (int j = 0; j < a.length(); j++) {
				int aux = a.charAt(j);
				while(cont != b){
					aux--;
					cont++;
					if(aux < 65){
						aux = 90;
					}
				}
				msgFormada.append((char)aux);
				cont = 0;
			}	
			System.out.println(msgFormada);
		}
	}
}
=======
package CifraDeCesar_1253;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 0; i < x; i++) {
			String a = sc.next();
			int b = sc.nextInt();
			int cont = 0;
			StringBuilder msgFormada = new StringBuilder();
			
			
			for (int j = 0; j < a.length(); j++) {
				int aux = a.charAt(j);
				while(cont != b){
					aux--;
					cont++;
					if(aux < 65){
						aux = 90;
					}
				}
				msgFormada.append((char)aux);
				cont = 0;
			}	
			System.out.println(msgFormada);
		}
	}
}
>>>>>>> origin/master
