//Exercício 10: Peça um valor em Reais e a cotação do Dólar. Exiba o valor convertido em Dólares.

// 1 dolar = 5 reais 

import java.util.Scanner; 
public class Main {
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 
        
        System.out.println("Informe uum valor em reais: ");
        float reais = myObj.nextFloat(); 

        System.out.println("Qual a cotação do dolar atualmente? ");
        float dolar = myObj.nextFloat(); 

        float valorEmDolar = reais / dolar; 

        System.out.printf("O valor %.02f reais equivale a %.02f dolares", reais, valorEmDolar);
    }
}