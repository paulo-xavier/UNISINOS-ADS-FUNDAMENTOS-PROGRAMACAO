//Exercício 17: Peça a inicial do nome (char) e a idade (int). Imprima uma frase formatada.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 

        System.out.println("Informe a inicial do seu nome: ");
        char inicial  = myObj.next().charAt(0); 

        System.out.println("Informe a sua idade: ");
        int idade = myObj.nextInt(); 

        System.out.printf("Sua inicial é '%c' e sua idade é %d", inicial, idade); 
    }
}
