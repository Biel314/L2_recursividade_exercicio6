package view;

import java.util.Scanner;
import controller.InverteController;

// Faça uma função recursiva que, dado um vetor, inverta seus valores (O valor que está na posição zero
// troca de lugar com o valor que está na úl�ma posição, o valor que está na posição um troca de lugar com
// o valor que está na penúl�ma posição e assim por diante). Testar com um vetor de 10 e um de 11 posições.

public class main {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
	    InverteController inverteController = new InverteController();
		
		System.out.println("Digite o tamanho do vetor: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		int inicio = 0;
		int fim = n-1;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o " + (i+1) + " termo do vetor:");
			arr[i] = in.nextInt();	
		}
		
		System.out.println("Normal: ");
		System.out.print("Arr{ ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("}\n");
		
		inverteController.inverte(arr, inicio, fim);

		System.out.println("\nInvertido:");
		System.out.print("Arr{ ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("}");
		
	}

}
