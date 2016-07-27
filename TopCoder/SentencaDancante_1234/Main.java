package SentencaDancante_1234;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			String s = sc.nextLine();
			StringBuilder stringAux = new StringBuilder();	
			int x = 2;
			
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != ' '){
					if(x % 2 == 0){
						stringAux.append(s.toUpperCase().charAt(i));
					}else{
						stringAux.append(s.toLowerCase().charAt(i));
					}
					x++;
				}else{
					stringAux.append(s.charAt(i));
				}	
			}
			System.out.println(stringAux);
				
				}
		}
}
