// Exercício 19: Peça o raio de um círculo e utilize uma constante PI = 3.1415 para calcular a área deste círculo.

import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 
        
        System.out.println("Informe o raio do circulo: ");
        float raio = myObj.nextFloat(); 

        float areaCirculo = raio * 3.1415f; 

        System.out.printf("A area de um circulo com raio %.02f cm equivale a %.02f cm", raio, areaCirculo );
    }
}