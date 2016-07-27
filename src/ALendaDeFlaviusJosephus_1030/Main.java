package ALendaDeFlaviusJosephus_1030;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x  = sc.nextInt();
		int a = 1;
		int b = 0;
		int aux = 0;
		for (int i = 0; i < x; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			ArrayList<Integer> array = new ArrayList<>();
			
			for (int j = 0; j < m; j++) 
			{
				array.add(a);
				a++;
			}
			
			a = 1;
			int ind = 0;
			
			while(array.size() != 0)
			{
			   aux++;
			   if(aux == n)
			   {
					b = array.get(ind);
					array.remove(ind);
					aux = 0;
			   }
			   else
			   {
				  ind++;  
			   }
			   
			   if(ind >= array.size())
			   {
				   ind = 0;
			   }
		   }			
			System.out.println("Case "+(i + 1)+": "+b);
		}
	}
}
