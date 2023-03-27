package projectEstruturaDeRepeticao;

import java.util.Scanner;

public class maiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int contador = 0;
        int media = 0;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            media = media + numero;

            if ( numero > maior) maior = numero;

            contador = contador + 1;
        }while(contador < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("Média: " + (media/5));

    }
}
