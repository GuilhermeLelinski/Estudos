/*
 Crie um programa em Java que leia dois números reais e a operação que deve ser
realizada sobre eles (+,-,* e /). O programa deve calcular a operação desejada e
apresentar o resultado.
 */
package exemplo7;

import java.util.Scanner;


public class Exemplo7 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, result;
        char op;
        
 //Entrada de dados       
        System.out.print("Digite o primeiro número: ");
        n1 = Double.valueOf(input.nextLine());
        System.out.print("Digite o segundo número: ");
        n2 = Double.valueOf(input.nextLine());
        System.out.print("Digite a operação desejada (+, -, * e /): ");
        op = input.nextLine().charAt(0);
        
 //Processamento de dados
        switch (op){
            case'+':result = n1 + n2;
                    break;
            case'-':result = n1 - n2;
                    break;
            case'*':result = n1 * n2;
                    break;
            case'/':result = n1 / n2;
                    break;
            default:System.out.println("Operador inválido.");
                    result = 0;                
        }
        
 //Saída de dados
        System.out.println("Resultado da operação: "+result);
    }
    
}
