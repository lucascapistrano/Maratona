package Bazinga_1828;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int cont = 1;
		
		sc.nextLine();
			
		for (int i = 0; i < x; i++) {
			String a = sc.next();
			String b = sc.next();
		
			if(a.equals(b)){
				System.out.println("Caso #"+cont+": De novo!");
			}else{
			   if(a.equals("tesoura") && b.equals("papel")){
				   System.out.println("Caso #"+cont+": Bazinga!");
			   }else if(a.equals("papel") && b.equals("pedra")){
				   System.out.println("Caso #"+cont+": Bazinga!");
			   }else if(a.equals("pedra") && b.equals("lagarto")){
				   System.out.println("Caso #"+cont+": Bazinga!");
			   }else if(a.equals("lagarto") && b.equals("Spock")){
				   System.out.println("Caso #"+cont+": Bazinga!");
			   }else if(a.equals("Spock") && b.equals("tesoura")){
				   System.out.println("Caso #"+cont+": Bazinga!");
			   }else if(a.equals("tesoura") && b.equals("lagarto")){
				   System.out.println("Caso #"+cont+": Bazinga!");
			   }else if(a.equals("lagarto") && b.equals("papel")){
				   System.out.println("Caso #"+cont+": Bazinga!");
			   }else if(a.equals("papel") && b.equals("Spock")){
				   System.out.println("Caso #"+cont+": Bazinga!");
			   }else if(a.equals("Spock") && b.equals("pedra")){
				   System.out.println("Caso #"+cont+": Bazinga!");
			   }else if(a.equals("pedra") && b.equals("tesoura")){
				   System.out.println("Caso #"+cont+": Bazinga!");
			   }else{
				      System.out.println("Caso #"+cont+": Raj trapaceou!");
				}
			   }
			cont++;
			}
		}
	}
