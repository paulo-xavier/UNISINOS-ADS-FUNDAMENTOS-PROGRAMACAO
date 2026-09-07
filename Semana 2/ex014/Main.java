//Exercício 14: Peça a idade de uma pessoa em anos e exiba a idade aproximada em dias (considere 365 dias por ano).

import java.util.Scanner; 

public static void main(String[] args){
    Scanner myObj = new Scanner(System.in); 
    
    System.out.println("Informe a sua idade: ");
    int idade = myObj.nextInt(); 
    int idadeEmDias = idade * 365;

    System.out.printf("Sua idade em dias corresponde a: %d", idadeEmDias);
}