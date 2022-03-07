package desafiocapgemini.questoes;

import java.util.Scanner;

public class Questao02 {
	
	/*
	 * Questão que encontra o número de elementos pares igual ao valor de "x" dado por entrada do usuário;
	 */

	public static void numPares(int[] vetor) {
		
		int cont = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número de X: ");
		
		
		int x = scanner.nextInt();
		System.out.println();

		int[] sizeVetor = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o número do elemento para o vetor: ");
			int numElemento = scanner.nextInt();
			vetor[i] = numElemento;
			sizeVetor[i] = numElemento;
		}

		System.out.print("Os números digitados foram: \n");
		for (int i = 0; i < sizeVetor.length; i++) {
			System.out.println(sizeVetor[i]);
		}
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if(vetor[i] - vetor[j] == x) {
					cont+=1;
				}
			}
		}
		
		System.out.println("\nO número de elementos pares é: " + cont);

		scanner.close();

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número N do tamanho do vetor: ");
		int[] n = new int[scanner.nextInt()];

		System.out.println("Vetor de tamanho: " + n.length);
		System.out.println();
		
		numPares(n);
		
		
		scanner.close();

	}
}
