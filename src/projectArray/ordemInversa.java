//Para indicar que é um array se usa [ ]
//Os números inseridos no array seguem um padrão sequencial
//lengh(é uma função que retorna o tamanho (quantidade de caracteres) de uma string (texto)

package projectArray;

import java.util.Scanner;

public class ordemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = {2, 4, 6, 8, 22};
        int contador = 0;

        System.out.print("Vetor: ");

        while (contador < (vetor.length)) {
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.print("\nVetor: ");

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}



