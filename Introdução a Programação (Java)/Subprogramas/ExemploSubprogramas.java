/*
Faça um programa que leia um conjunto com N números inteiros. Em seguida, o 
programa deve apresentar os números lidos. Por fim, ele deve substituir todos os
valores negativos por 0, apresentar o novo conjunto e indicar quantos valores 
foram substituídos dentro dele.
 */
package exemplo.subprogramas;

import java.util.Scanner;

public class ExemploSubprogramas {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, cont = 0;
        int [] vetor;
        System.out.print("Digite a quantidade de números do conjunto: ");
        n = Integer.valueOf(input.nextLine());
        vetor = new int[n];
        
//Leitura do vetor       
        for (int i = 0; i < n; i++) { 
            System.out.print("Digite o elemento da posição "+i+": ");
            vetor[i] = Integer.valueOf(input.nextLine());
        }
//Apresentação do vetor original
        System.out.println("Vetor original: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }
//Substituição dos elementos negativos por zero
        for (int i = 0; i < n; i++) {
            if (vetor[i]<0){
                vetor[i] = 0;
                cont++;
            }
        }
//Apresentação dos resultados
        System.out.println("Vetor modificado: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("Foram feitas "+cont+" modificações.");
    }
    
}
