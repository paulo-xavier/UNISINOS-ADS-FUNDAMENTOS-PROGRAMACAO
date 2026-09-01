// Exercício 4: Peça dois números reais e exiba a divisão do primeiro pelo segundo.

import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 
        
        System.out.println("Enter the 1st number: ");
        float n1 = myObj.nextFloat(); 

        System.out.println("Enter the 2nd number: ");
        float n2 = myObj.nextFloat();

        float result = n1 / n2; 

        System.out.printf("The division between %.02f and %.02f is %.02f", n1, n2, result); 
    }
}