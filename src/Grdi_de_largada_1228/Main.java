package Grdi_de_largada_1228;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
		
		ArrayList<Integer> array = new ArrayList<>();
		ArrayList<Integer> array2 = new ArrayList<>();
		int cont = 0;
		int ind = 0;
		int aux = 0;
		
		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {
			int a = sc.nextInt();
			array.add(a);
		}
		
		for (int i = 0; i < x; i++) {
			int a = sc.nextInt();
			array2.add(a);
		}
	
		
		while(array.size() != 0){
			
		for (int i = 0; i < x; i++) {
			if(array2.get(ind) == array.get(i)){
				if(ind != i){
					cont = (i - ind) + cont;
					array2.remove(ind);
					array.remove(i);
					x --;
				}else if(ind == i && array.size() == 1){
					array2.remove(ind);
					array.remove(i);				
				}else{
					array2.remove(ind);
					array.remove(i);
					x --;
				}
				
			}
		  }		
		}
		
		System.out.println(cont);
		}
	}
}
