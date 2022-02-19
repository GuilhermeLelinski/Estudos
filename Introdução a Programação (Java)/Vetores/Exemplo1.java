/*
Faça um programa que leia 20 números reais, calcule a média deste números e 
apresente o valor da média e quantos números digitados são maiores ou iguais a 
média.
*/
package exemplo1;

import java.util.Scanner;

public class Exemplo1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double [] numeros = new double[20];
        double soma=0, media;
        int cont=0;
        
        for (int i=0;i<=19;i++){
            System.out.println("Digite o número "+i+": ");
            numeros[i] = Integer.valueOf(input.nextLine());
            soma = soma + numeros[i];
        }
        media = soma / 20;
        for (int i=0;i<=19;i++){
            if (numeros[i]>= media){
                cont = cont + 1;
            }
        }
        System.out.println("Média dos números: "+media);       
        System.out.println("Números maiores ou iguais a média: "+cont);
        
    }
    
}
