//Quando for necessário a existência do contador e recomendado o uso do for
//While > do while
//Soma começa com 0
//Multiplicação começa com 1
package projectEstruturaDeRepeticao;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int multiplicacao =1;

        System.out.println("Fatorial: ");
        fatorial = scan.nextInt();

        System.out.print(fatorial + "! = ");

        for(int i = fatorial; i >= 1; i --) {
            multiplicacao = multiplicacao * i;
        }
        System.out.print(multiplicacao);
    }
}

