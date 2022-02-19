/*
Faça um programa que leia um número inteiro e apresente uma mensagem indicando
se ele é um número positivo, negativo ou zero.
*/
package exemplo4;

import java.util.Scanner;

public class Exemplo4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        
 //Entrada de dados
        System.out.print("Digite um número inteiro: ");
        n = Integer.valueOf(input.nextLine());
        
 //Processamento e saída de dados
        if(n>0){
            System.out.println("Número positivo.");
        }
        else{
            if(n<0){
                System.out.println("Número negativo.");                
            }
            else{
                System.out.println("Número é igual a zero.");
            }
        }
    }
    
}
