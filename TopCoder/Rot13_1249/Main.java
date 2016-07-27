package Rot13_1249;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
while(sc.hasNext()){
	
	String a = sc.nextLine();
	StringBuilder a1 = new StringBuilder();	

	for (int i = 0; i < a.length(); i++) {
		if(a.charAt(i) >= 97 && a.charAt(i) <= 122 )
		{
			int cont = 0;
			int aux = a.charAt(i);
			while(cont != 13)
			    {
				cont++;
				aux++;
				if(aux == 123){
					aux = 97;
				}
			}
			char aux2 = (char)aux;
			a1.append(aux2);
		}else if(a.charAt(i) >= 65 && a.charAt(i) <= 90)
		{
			int cont = 0;
			int aux = a.charAt(i);
			while(cont != 13)
			    {
				cont++;
				aux++;
				if(aux == 91){
					aux = 65;
				}
			}
			char aux2 = (char)aux;
			a1.append(aux2);
		}else
		 {
			a1.append(a.charAt(i));
		
		  }	
			}
			System.out.println(a1);	
		}	
	}
}
