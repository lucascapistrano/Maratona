<<<<<<< HEAD
package DeDentroParaFora_1235;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int x = sc.nextInt();

		sc.nextLine();
		
		for (int i = 0; i < x; i++) {

			
			StringBuilder a = new StringBuilder();
			String c = sc.nextLine();
			
			a.append(c.substring((c.length() / 2), c.length()));
			a.append(c.substring(0, (c.length() / 2)));
			
			System.out.println(a.reverse());
			
		}	
	}
}
=======
package DeDentroParaFora_1235;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int x = sc.nextInt();

		sc.nextLine();
		
		for (int i = 0; i < x; i++) {

			
			StringBuilder a = new StringBuilder();
			String c = sc.nextLine();
			
			a.append(c.substring((c.length() / 2), c.length()));
			a.append(c.substring(0, (c.length() / 2)));
			
			System.out.println(a.reverse());
			
		}	
	}
}
>>>>>>> origin/master
