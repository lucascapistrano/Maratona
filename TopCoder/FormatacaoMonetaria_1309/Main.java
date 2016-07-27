<<<<<<< HEAD
package FormatacaoMonetaria_1309;

	import java.util.Scanner;
	
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while (sc.hasNext()) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int cont = 0;
				String a = String.valueOf(x);
				
				char[] b = a.toCharArray();
				StringBuilder c = new StringBuilder();
				
				for (int j = a.length()  - 1; j >= 0; j--) {
					c.append(b[j]);
					cont++;
					if(cont == 3 && j != 0){
						c.append(',');
						cont = 0;
					}
				}
				c.reverse();
				if(y >= 10){
					c.append("."+y);
				}else{
					c.append(".0"+y);
				}	
				System.out.println("$"+c);	
			}	
		}
	}
=======
package FormatacaoMonetaria_1309;

	import java.util.Scanner;
	
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while (sc.hasNext()) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int cont = 0;
				String a = String.valueOf(x);
				
				char[] b = a.toCharArray();
				StringBuilder c = new StringBuilder();
				
				for (int j = a.length()  - 1; j >= 0; j--) {
					c.append(b[j]);
					cont++;
					if(cont == 3 && j != 0){
						c.append(',');
						cont = 0;
					}
				}
				c.reverse();
				if(y >= 10){
					c.append("."+y);
				}else{
					c.append(".0"+y);
				}	
				System.out.println("$"+c);	
			}	
		}
	}
>>>>>>> origin/master
