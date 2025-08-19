package controller;

public class InverteController {

	public InverteController() {
		super();
	}

	public void inverte(int[] arr, int inicio, int fim) {
		 //A condição de parada ocorre quando o inicio e o fim se encontram ou se cruzam, mostrando assim que chegou na
		// metade do vetor.
        if (inicio >= fim) {
            return;
        }

        //Aqui é onde fazemos a troca de variaveis, utilizando a maneira classica com variavel temporaria.
        int x = arr[inicio];
        arr[inicio] = arr[fim];
        arr[fim] = x;

        //A condicao de chamada ocorre enquanto o inicio e o fim puderem ir caminhando pelo vetor (inicio indo pra frente)
        // e o fim indo para trás do vetor, seguindo assim até se encontrarem!!
        inverte(arr, inicio + 1, fim - 1);
	}
	
	
}
