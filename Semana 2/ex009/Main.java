//Exercício 9: Peça a base e a altura de um retângulo e calcule o seu perímetro.

// P = 2 x (base + altura)

import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 
        
        System.out.println("Informe a base do retângulo: ");
        float base = myObj.nextFloat(); 

        System.out.println("Informe a altura do retângulo: ");
        float altura = myObj.nextFloat(); 

        float perimetro = 2 * (base + altura); 
        
        System.out.println("O perímetro deste retângulo é: " + perimetro);
    }
}