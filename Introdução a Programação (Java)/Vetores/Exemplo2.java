/*
Faça um programa que leia um conjunto de 5 números inteiros e imprima-os na 
ordem inversa em que foram digitados.
*/
package exemplo2;

import java.util.Scanner;


public class Exemplo2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int i;
        int[] dados = new int[5];
        
        for (i=0;i<5;i++){
            System.out.println("Digite o número da posição "+i+": ");
            dados[i] = Integer.valueOf(input.nextLine());
        }
        System.out.println("Números na ordem inversa: ");
        for (i=4;i>=0;i--){
            System.out.println(dados[i]);
        }    
        
    }
    
}
