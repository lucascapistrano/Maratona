package JogoDoMaior;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int a,b;
        while(n>0){
            int contA=0;
            int contB=0;
            for (int i = 0; i < n; i++) {
                a=s.nextInt();
                b=s.nextInt();
                if(a>b){
                    contA++;
                }else if(a<b){
                    contB++;
                }
            }
            System.out.println(contA+" "+contB);
            n=s.nextInt();
        }
         
 
    }
 
}