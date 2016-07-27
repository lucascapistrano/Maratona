package Aliteracao_1263;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){

			String a = sc.nextLine();
			String b[] = a.toLowerCase().split(" ");
			int cont = 0;
			int indice = 0;
			
			for (int i = indice; i < b.length - 1; i++) {
				if(b[i].charAt(0) == b[i + 1].charAt(0)){
					cont++;
				for(int j = i + 1;j < b.length - 1;j++){
					if(b[j].charAt(0) != b[j + 1].charAt(0)){
						i = j;
						break;
					}else{
						i = j;
					}	
				 }	
			   }
			 }
			System.out.println(cont);	
		}	
    }
}
