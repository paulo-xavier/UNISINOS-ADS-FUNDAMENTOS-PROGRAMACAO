// Exercício 1: Peça dois números inteiros e exiba a soma.

import java.util.Scanner; 

public class Main {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in); 

        System.out.println("Enter a 1st number: ");
        int n1 = myObj.nextInt(); 
        
        System.out.println("Enter a 2nd number: ");
        int n2 = myObj.nextInt(); 

        int result = n1 + n2; 

        System.out.printf("The sum between %d and %d is %d", n1, n2, result); 
    }
}