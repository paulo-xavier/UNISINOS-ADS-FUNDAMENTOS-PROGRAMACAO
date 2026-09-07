// Exercício 16: Peça dois números (A e B). Troque os valores para que A receba o valor de B e vice-versa, exibindo-os.

import java.util.Scanner; 

public class Main {
    public static void main(String[]args){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Informe o valor de A: ");
        int a = myObj.nextInt(); 
        
        System.out.println("Informe o valor de B: ");
        int b = myObj.nextInt(); 

        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);

        int auxiliarA = a; 

        a = b; 
        b = auxiliarA; 

        System.out.println("\nValores após mudança...\n");

        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
    }
}
