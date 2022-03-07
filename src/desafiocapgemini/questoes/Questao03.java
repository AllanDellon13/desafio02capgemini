package desafiocapgemini.questoes;

import java.util.ArrayList;
import java.util.List;

public class Questao03 {
	/*
	 * Questão que encripta a String;
	 */
	
	public static void encryptString(String name) {
		String remove_Espace = name.replaceAll("\\s+","");
		
		int qtd_caracteres = remove_Espace.length();
		
		Double raiz_quadrada = Math.sqrt(qtd_caracteres);
		
		Long t = Math.round(raiz_quadrada);
	
		
		List<String> lista_geral = new ArrayList<>();
		
		for (int i = 0; i < qtd_caracteres; i++) {
			lista_geral.add(remove_Espace.charAt(i), remove_Espace);
		}
		
		String vetor[] = new String[lista_geral.size()];
		
		for (int i = 0; i < t; i++) {
			vetor[i] = lista_geral.get(i);
		}
		
		ArrayList<String> result_final = new ArrayList();
		result_final.add(vetor[0]);
		
		System.out.println(result_final.get(0));
		
	}
	
	public static void main(String[] args) {
		encryptString("tenha um bom dia");

	}
}
