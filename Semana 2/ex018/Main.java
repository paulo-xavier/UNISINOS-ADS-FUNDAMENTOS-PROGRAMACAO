//Exercício 18: Peça o peso e a altura. Calcule o IMC (peso / (altura x altura)).

// Tabela de Classificação

// Abaixo de 18,5: Abaixo do peso
// 18,5 a 24,9: Peso normal (saudável)
// 25 a 29,9: Sobrepeso
// 30 a 34,9: Obesidade Grau I
// 35 a 39,9: Obesidade Grau II
// 40 ou mais: Obesidade Grau III (mórbida) [1] (https://www.youtube.com/watch?v=s40FajZdsBQ), [2] (https://www.instagram.com/reel/C9Q_FIEBSW3/)

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("CALCULADORA DE IMC\n");

        System.out.println("Informe o seu peso: ");
        double peso = myObj.nextDouble();

        System.out.println("Informe a sua altura: ");
        double altura = myObj.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Resultado: " + imc);

        if (imc < 18.5) {
            // Abaixo de 18,5: Abaixo do peso
            System.out.println("ABAIXO DO PESO!!");

        } else if (imc >= 18.5 && imc <= 24.9) {
            // 18,5 a 24,9: Peso normal (saudável)
            System.out.println("PESO NORMAL!!");

        } else if (imc >= 25 && imc <= 29.9) {
            // 25 a 29,9: Sobrepeso
            System.out.println("SOBREPESO!!");

        } else if (imc >= 30 && imc <= 34.9) {
            // 30 a 34,9: Obesidade Grau I
            System.out.println("OBESIDADE GRAU I");

        } else if(imc >= 35 && imc <= 39.9){
            // 35 a 39,9: Obesidade Grau II
            System.out.println("OBESIDADE GRAU II");
        } else {
            // 40 ou mais: Obesidade Grau III (mórbida)
            System.out.println("OBESIDADE GRAU III");
        }



        myObj.close();
    }
}