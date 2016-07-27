package Media3_1040;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		
		float media = ((a * 2)+(b * 3)+(c * 4)+d)/10;
		
		if(media  >= 7){
			System.out.println("Media: "+df.format(media));
			System.out.println("Aluno aprovado.");
		}else if(media >= 5 && media < 7){
			System.out.println("Media: "+df.format(media));
			System.out.println("Aluno em exame.");
			float e = sc.nextFloat();
			float mediaFinal = (media + e) / 2;
			System.out.println("Nota do exame: "+e);
			if(mediaFinal >= 5){
				System.out.println("Aluno aprovado.");
			}else{
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: "+df.format(mediaFinal));
		}else{
			System.out.println("Media: "+df.format(media));
			System.out.println("Aluno reprovado.");
		}			
	}
}
