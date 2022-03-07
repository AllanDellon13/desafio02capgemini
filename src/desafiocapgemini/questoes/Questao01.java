package desafiocapgemini.questoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Questao01 {
	/*
	 * Questão que calcula a Mediana de uma lista.
	 */

	public static void calcMediana(List<Float> numeros) {

		Collections.sort(numeros);

		float mediana = 0;

		if (numeros.size() % 2 != 0) {

			int posicaoNumero = ((numeros.size() + 1) / 2) - 1;
			mediana = numeros.get(posicaoNumero);
		} else {
			int posicaoNumero = Math.round((numeros.size() + 1) / 2) - 1;

			mediana = (numeros.get(posicaoNumero) + numeros.get(posicaoNumero + 1)) / 2;
		}

		System.out.println(mediana);
	}

	public static void main(String[] args) {

		List<Float> list = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de elementos: ");
		int qtdEle = scanner.nextInt();

		for (int i = 0; i < qtdEle; i++) {
			System.out.print("Digite um número: ");
			float numero = scanner.nextInt();
			list.add(numero);
		}

		System.out.print("A mediana encontrada é: ");
		calcMediana(list);

		scanner.close();
	}

}
