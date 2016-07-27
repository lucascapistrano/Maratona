package OJogoMatematicoDePaula_1192;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();	
		String[] matriz = new String[x];
		
		for (int i = 0; i < matriz.length; i++) {
			
			matriz[i] = sc.next();
			
			int k = Integer.parseInt(matriz[i].substring(0, 1));
			String m = matriz[i].substring(1, 2);
			String aux = m.toUpperCase();
			int l = Integer.parseInt(matriz[i].substring(2, 3));
			
			if (k == l) {
				int local = k *l;
				System.out.println(local);	
			}else if(m.equals(aux)){
				int local = l - k;
				System.out.println(local);
			}else{
				int local = k + l;
				System.out.println(local);
			}
			
			
		}
		
	
		
		
		
		
		
	}
	
	
}
