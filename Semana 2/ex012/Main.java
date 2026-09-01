//Exercício 12: Peça o preço de um produto e exiba o novo preço com 5% de desconto.

import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Informe o valor atual do produto: ");
        float valorAtual = myObj.nextFloat(); 

        float valorDesconto =  valorAtual * 0.05f; 
        float valorFinal = valorAtual - valorDesconto; 

        System.out.println("O valor total do produto com desconto será de: " + valorFinal);

    }
}