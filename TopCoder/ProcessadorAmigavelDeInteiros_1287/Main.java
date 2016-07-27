package ProcessadorAmigavelDeInteiros_1287;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String y = "";
		
			while((y = input.readLine()) != null){
				
				
				if(y.trim().equals("")){
					System.out.println("error");
				}else{
					StringBuilder sb = new StringBuilder();
					int cont = 0;
					int tamanho = y.length();
					
					sb.append(y);
					
					for (int i = 0; i < sb.length(); i++) {
						if(sb.charAt(i) == 'o' || sb.charAt(i) == 'O'){
							sb.setCharAt(i, '0');
							cont++;
						}else if(sb.charAt(i) == 'l'){
							sb.setCharAt(i, '1');
							cont++;
						}else if(sb.charAt(i) == ',' || sb.charAt(i) == ' '){
							sb.deleteCharAt(i);
							cont++;
							i--;
						}else{
							for (int j = 0; j < 10; j++) {
								if(sb.charAt(i) == Integer.toString(j).charAt(0)){
									cont++;  
									break;
								}
							}
						}
					}
					
					
					if(cont == tamanho && !(sb.toString().trim().equals(""))){
						try {
							Long numero = Long.parseLong(sb.toString());
							if(numero > 2147483647){
								System.out.println("error");
							}else{
								System.out.println(numero);	
							}		
						} catch (Exception e) {
							System.out.println("error");
						}	
					}else{
						System.out.println("error");
					}		
				}				
			}
		} 
	}