package MensagemOculta_1272;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		sc.nextLine();
		
		
		for (int i = 0; i < x; i++) {
			String y = sc.nextLine();
			StringBuilder msg = new StringBuilder();
			
			for (int j = 0; j < y.length(); j++) {
				if(y.charAt(j) != ' '){
					if(j == 0){
						msg.append(y.charAt(j));
					}else{
						if(y.charAt(j - 1) == ' '){
						  msg.append(y.charAt(j));
					}		
				  }
				}
			}
			System.out.println(msg);
		}
	}
}
