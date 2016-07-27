package ACorridaDasLesmas_1789;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			int aux = 0;
			int x = sc.nextInt();
			int array[] = new int[x];
			
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}
			
			
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = 1; j < array.length; j++) {
					if (array[j] > array[i]) {
						aux = array[j];
						array[j] = array[i];
						array[i] = aux;
						
					}
				}
				
			}
			
			if (array[0] < 10) {
				System.out.println(1);
			}else if(array[0] >= 10 && array[0] < 20){
				System.out.println(2);
			}else if(array[0] >= 20){
				System.out.println(3);
			}
		}
		
		
	}

}
