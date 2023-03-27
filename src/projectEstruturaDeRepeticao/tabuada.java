package projectEstruturaDeRepeticao;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Tabuada: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada);

        for(int i = 0; i <= 10; i = i +1) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}
