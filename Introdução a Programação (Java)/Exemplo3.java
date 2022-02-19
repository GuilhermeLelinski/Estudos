/*
 Faça um programa que leia o valor a ser pago por uma conta,
calcule e imprima o valor com juros, que é de:
R$20,00 caso a conta seja de até R$50,00;
R$40,00 caso a conta seja maior que R$50,00;
 */
package exemplo3;

import java.util.Scanner;


public class Exemplo3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorConta, valorContaJuros;
        
 //Entrada de dados       
        System.out.print("Digite o valor da conta: ");
        valorConta = Double.valueOf(input.nextLine());
        
 //Processamento de dados       
        if (valorConta <= 50){
            valorContaJuros = valorConta+20;
        }
        else{
            valorContaJuros = valorConta+40;
        }
        
 //Saída de dados
        System.out.println("Valor da conta com juros: "+valorContaJuros);    
    }
    
}
