<<<<<<< HEAD
package LeituraMultipla_1262;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			String a = sc.next();
			int b = sc.nextInt();
			int cont = 0;
			int aux = 0;
			
			for (int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == 'W'){
					cont++;
					if(aux > 0){
						cont++;
					}
					aux = 0;
				}else{
					aux++;
					if(aux == b){
						cont++;
						aux = 0;
					}
				}
			}
				if(aux > 0){
					cont++;
				}
			System.out.println(cont);	
		}		
	}
}
=======
package LeituraMultipla_1262;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			String a = sc.next();
			int b = sc.nextInt();
			int cont = 0;
			int aux = 0;
			
			for (int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == 'W'){
					cont++;
					if(aux > 0){
						cont++;
					}
					aux = 0;
				}else{
					aux++;
					if(aux == b){
						cont++;
						aux = 0;
					}
				}
			}
				if(aux > 0){
					cont++;
				}
			System.out.println(cont);	
		}		
	}
}
>>>>>>> origin/master
