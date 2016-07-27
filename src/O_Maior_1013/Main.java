package O_Maior_1013;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[3];
		int aux = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j] > array[i]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		System.out.println(array[0]+" eh o maior");
	}

}
