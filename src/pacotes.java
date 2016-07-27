import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class pacotes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		for (int i = 0; i < entrada; i++) {
			int qtd = sc.nextInt();
			ArrayList<Integer> depedente = new ArrayList<>();
			ArrayList<Integer> semdependencia = new ArrayList<>();
			int[] pacotes = new int[qtd * 2];
			for (int j = 0; j < qtd * 2; j++) {
				pacotes[j] = sc.nextInt();
				if(j % 2 == 0){
					depedente.add(pacotes[j]);
				}else{
					semdependencia.add(pacotes[j]);
				}
			}
			ArrayList<Integer> listageral = new ArrayList<>();
			listageral.addAll(depedente);
			listageral.addAll(semdependencia);
			
			Collections.sort(listageral);
			
			ArrayList<Integer> listafinal = new ArrayList<>();
			
			for (int j = 0; j < listageral.size(); j++) {
				if(depedente.indexOf(listageral.get(j)) >= semdependencia.indexOf(listageral.get(j))){
					listafinal.add(semdependencia.get(listageral.get(j)));
					listafinal.add(depedente.get(listageral.get(j)));
				}else{
					listafinal.add(semdependencia.get(listageral.get(j)));
				}
			}
			
			for (int j = 0; j < listafinal.size(); j++) {
				System.out.println(listafinal.get(j));
			}
			
		}
	}

}
