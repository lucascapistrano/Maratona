<<<<<<< HEAD
package AtalhosBloggo_1239;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
		
			String a = sc.nextLine();
			StringBuilder s = new StringBuilder();
			int line = 0;
			int ast = 0;
			int aux = 0;
			
			for (int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == '_'){
					line++;
					if(line == 2){
						line = 0;
						s.append("</i>");
					}else{
						s.append("<i>");	
					}
					
				}else if(a.charAt(i) == '*'){
				     ast++;
				     if(ast == 2){
							ast = 0;
							s.append("</b>");
						}else{
							s.append("<b>");	
						}
				     
				}else{
					s.append(a.charAt(i));
				}
			}
			
			System.out.println(s);

			
			
			
			
			
		}
		
			}
}
=======
package AtalhosBloggo_1239;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
		
			String a = sc.nextLine();
			StringBuilder s = new StringBuilder();
			int line = 0;
			int ast = 0;
			int aux = 0;
			
			for (int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == '_'){
					line++;
					if(line == 2){
						line = 0;
						s.append("</i>");
					}else{
						s.append("<i>");	
					}
					
				}else if(a.charAt(i) == '*'){
				     ast++;
				     if(ast == 2){
							ast = 0;
							s.append("</b>");
						}else{
							s.append("<b>");	
						}
				     
				}else{
					s.append(a.charAt(i));
				}
			}
			
			System.out.println(s);

			
			
			
			
			
		}
		
			}
}
>>>>>>> origin/master
