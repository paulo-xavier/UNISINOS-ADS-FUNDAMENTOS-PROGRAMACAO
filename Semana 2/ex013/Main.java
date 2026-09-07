// Exercício 13: Peça o salário atual e exiba o valor após um aumento de 15%.

import java.util.Scanner; 

class Main {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in); 

        System.out.println("Informe o valor do seu salarío atual");
        float salario = myObj.nextFloat(); 

        float valorDesconto = salario * 0.15f; 
        float salarioFinal = salario + valorDesconto; 

        System.out.printf("Salario antigo: %.02f | Salario final: %.02f", salario, salarioFinal); 
    }
}
