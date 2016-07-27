package ConversaoDeTempo;

import java.util.Scanner;

public class Main {
	
	public static String retornoHora(int r){
		String t = "";
		int p = 0;
		int s = r % 60;
		int m = r;
		int[] array = new int[3]; 
		
		if(r < 60){
			t = "0:0:"+s;	
		}else if(r >=60 && r < 3600){
			m = m/60;
			t = "0:"+m+":"+s;	
		}else{
			while(m >= 60){
				int x = m % 60;
				m = m / 60;
				array[p] = x;
				p++;	
			}
			t = m+":"+array[1]+":"+array[0];
		}	
	return t;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(retornoHora(n));
		}
		
	

}
