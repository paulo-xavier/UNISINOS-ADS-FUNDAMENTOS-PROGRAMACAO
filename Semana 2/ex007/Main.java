//Exercício 7: Peça um número inteiro e imprima o seu dobro e a sua metade (como real).

import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 
        
        System.out.println("Enter an integer number: ");
        int number = myObj.nextInt(); 

        float doubleNumber = number * 2;
        float halfNumber = number / 2;
        
        System.out.printf("The double of %d is %.01f \n", number, doubleNumber); 
        System.out.printf("A half of %d is %.02f", number, halfNumber); 
    }
}