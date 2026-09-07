//Exercício 20: Peça a temperatura em Celsius e converta para Fahrenheit (utilize F = C x 1.8 + 32).

import java.util.Scanner; 

public class Main{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Informe a temperatura em ºC: "); 
        float celsius = myObj.nextFloat(); 

        float fahrenheit = celsius * 1.8f + 32; 

        System.out.printf("%.01f ºC | %.01f F", celsius, fahrenheit);
    }
}