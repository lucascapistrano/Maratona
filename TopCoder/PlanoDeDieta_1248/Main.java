<<<<<<< HEAD
package PlanoDeDieta_1248;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 0; i < x; i++) {
		
		String remedio = sc.nextLine();
		String remedio2 = sc.nextLine();
		String remedio3 = sc.nextLine();
		
		
		StringBuilder r1 = new StringBuilder();
		r1.append(remedio);
		
	for (int j = 0; j < r1.length(); j++) {
		for (int k = 0; k < remedio2.length(); k++) {
			if(r1.charAt(j) == remedio2.charAt(k)){
				r1.deleteCharAt(j);
				j--;
				break;
			}
		}
	}	
	
	for (int j = 0; j < r1.length(); j++) {
		for (int k = 0; k < remedio3.length(); k++) {
			if(r1.charAt(j) == remedio3.charAt(k)){
				r1.deleteCharAt(j);
				j--;
				break;
			}
		}	
	}
	
	char [] aux = r1.toString().toCharArray();
	Arrays.sort(aux);
	r1.delete(0, r1.length());
	
	for (int j = 0; j < aux.length; j++) {
		r1.append(aux[j]);
	}

		
	if(r1.length() == remedio.length() - (remedio2.length() + remedio3.length())){
		System.out.println(r1);
	}else{
		System.out.println("CHEATER");
	}
	
       }
	}	
}
=======
package PlanoDeDieta_1248;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 0; i < x; i++) {
		
		String remedio = sc.nextLine();
		String remedio2 = sc.nextLine();
		String remedio3 = sc.nextLine();
		
		
		StringBuilder r1 = new StringBuilder();
		r1.append(remedio);
		
	for (int j = 0; j < r1.length(); j++) {
		for (int k = 0; k < remedio2.length(); k++) {
			if(r1.charAt(j) == remedio2.charAt(k)){
				r1.deleteCharAt(j);
				j--;
				break;
			}
		}
	}	
	
	for (int j = 0; j < r1.length(); j++) {
		for (int k = 0; k < remedio3.length(); k++) {
			if(r1.charAt(j) == remedio3.charAt(k)){
				r1.deleteCharAt(j);
				j--;
				break;
			}
		}	
	}
	
	char [] aux = r1.toString().toCharArray();
	Arrays.sort(aux);
	r1.delete(0, r1.length());
	
	for (int j = 0; j < aux.length; j++) {
		r1.append(aux[j]);
	}

		
	if(r1.length() == remedio.length() - (remedio2.length() + remedio3.length())){
		System.out.println(r1);
	}else{
		System.out.println("CHEATER");
	}
	
       }
	}	
}
>>>>>>> origin/master
