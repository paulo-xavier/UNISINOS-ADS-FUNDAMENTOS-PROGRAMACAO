//Exercício 2: Peça dois números reais (double) e exiba a subtração do primeiro pelo segundo.

import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 

        System.out.println("Enter the 1st number: ");
        double n1 = myObj.nextDouble(); 

        System.out.println("Enter the 2nd number: ");
        double n2 = myObj.nextDouble(); 

        double result = n1 - n2; 

        System.out.printf("The result betwenn %.02f and %.02f is %.02f", n1, n2, result); 
    }
}