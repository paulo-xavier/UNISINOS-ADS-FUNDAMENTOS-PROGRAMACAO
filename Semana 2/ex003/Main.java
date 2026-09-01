// Exercício 3: Peça dois números inteiros e exiba o resultado da multiplicação.

import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 
        
        System.out.println("Enter the 1st number: ");
        int n1 = myObj.nextInt(); 
        
        System.out.println("Enter the 2nd number: ");
        int n2 = myObj.nextInt(); 

        int result = n1 * n2; 

        System.out.printf("The multiplication between %d and %d is %d", n1, n2, result); 
    }
}