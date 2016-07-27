package CriseDeEnergia_1031;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = -1;
		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<Integer> arrayListAux = new ArrayList<>();
		
		while (x != 0) {
			
			boolean primeiraVezQueRoda = true;	
			int y = 1;
			int m = 1;
			int aux = 0;
			int indice = 0;
			x = sc.nextInt();
			
			for (int i = 0; i < x; i++) {
				arrayList.add(y);
				y++;
			}
			
			int k = 0;
			
			while(!(arrayList.size() == 0)){
			
				while(aux != m){

					if(k == arrayList.size()){
						k = 0;
					}
					
					if(primeiraVezQueRoda){
						break;
					}
					  
					if(!arrayListAux.contains(arrayList.get(k))){
					aux++;
					indice = k;
					}
					k++;
				}
				
				if(arrayList.get(indice) == 13 && arrayList.size() > 1){
					arrayList.clear();
					arrayListAux.clear();
					y = 1;
					primeiraVezQueRoda = true;
					for (int i = 0; i < x; i++) {
						arrayList.add(y);
						y++;
					}
					
					m++;
					aux = 0;
					k = 0;
					indice = k;
					
				}else{			
				if(primeiraVezQueRoda){
					arrayListAux.add(arrayList.get(indice));
					arrayList.remove(indice);	
					aux = 0;
					primeiraVezQueRoda = false;
				}else{
					arrayListAux.add(arrayList.get(indice));
	 				arrayList.remove(indice);	
					aux = 0;
					k--;			
				}	
				}
			}
			if(x == 0){
				break;
			}
			System.out.println(m);
			arrayListAux.clear();	
		}
	}
	
}
