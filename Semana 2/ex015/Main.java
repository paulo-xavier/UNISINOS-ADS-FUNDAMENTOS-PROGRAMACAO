//Exercício 15: Peça a distância percorrida e o combustível gasto. Exiba o consumo médio (km/l).

import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 
        
        System.out.println("Informe a distância percorrida: (km) ");
        float distancia = myObj.nextFloat(); 

        System.out.println("Informe o total gasto em litros: (l) ");
        float totalLitros = myObj.nextFloat(); 

        float media = distancia / totalLitros; 

        System.out.printf("O consumo médio foi: %.01f km/l", media);

    }
}