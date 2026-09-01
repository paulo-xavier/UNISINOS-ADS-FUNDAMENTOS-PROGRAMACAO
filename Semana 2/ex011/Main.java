//Exercício 11: Peça um número inteiro e exiba o seu antecessor e o seu sucessor.

import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 
        
        System.out.println("Informe um número inteiro: ");
        int numero = myObj.nextInt(); 

        System.out.println("O antecessor é: " + (numero - 1));
        System.out.println("O sucessor é: " + (numero + 1));
    }
}