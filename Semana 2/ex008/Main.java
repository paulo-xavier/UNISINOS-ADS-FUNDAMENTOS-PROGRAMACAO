//Exercício 8: Peça o lado de um quadrado e exiba a sua área.

import java.util.Scanner; 

class Main {

    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in); 

        System.out.println("Informe um dos lados do quadrado");

        float largura = myObj.nextFloat(); 

        float area = largura * largura; 

        System.out.println("A area do quadrado é " + area);
    }
}