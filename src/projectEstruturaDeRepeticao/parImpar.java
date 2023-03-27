package projectEstruturaDeRepeticao;

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares =0;
        int quantImpares =0;
        int contador = 0;

        System.out.println("Qauntidade de números: ");
        quantNumeros = scan.nextInt();

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 ==0) quantPares = quantPares + 1;
            else quantImpares = quantImpares + 1;

            contador = contador + 1;// = contador++;
        }while(contador < quantNumeros);

        System.out.println("Quantidade de pares: " + quantPares);

        System.out.println("Quantidade de ímpares: " +quantImpares);

    }
}
