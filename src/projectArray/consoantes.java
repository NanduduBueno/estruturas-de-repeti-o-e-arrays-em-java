package projectArray;

import java.util.Scanner;

public class consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String [6];
        int quantidadeConsoante = 0;
        int contador =0;

        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if(     !(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u")) )
            {
                consoantes[contador] = letra;
                quantidadeConsoante++;
            }

            contador++;

        }while(contador < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {

            if(consoante != null)

            System.out.println(consoante);
        }

        System.out.println("Quantidade de consoantes: " + quantidadeConsoante);
    }
}
