/*
Faça um programa que leia um conjunto com N números inteiros. Em seguida, o 
programa deve apresentar os números lidos. Por fim, ele deve substituir todos os
valores negativos por 0, apresentar o novo conjunto e indicar quantos valores 
foram substituídos dentro dele.
 */
package exemplo1_subprogramas;

import java.util.Scanner;


public class Exemplo1_Subprogramas {
    
    static int n, cont = 0;
    static int [] vetor;
    
    public static void leiaVetor(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de números do conjunto: ");
        n = Integer.valueOf(input.nextLine());
        vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento da posição "+i+": ");
            vetor[i] = Integer.valueOf(input.nextLine());
        }
    }
    public static void mostreVetor(){
        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }
    }
    
    public static void substituaValores(){
        for (int i = 0; i < n; i++) {
            if (vetor[i]<0){
                vetor[i] = 0;
                cont++;
            }
        }
    }
    
    public static void main(String[] args) {
        leiaVetor();
        System.out.println("Vetor original: ");
        mostreVetor();
        substituaValores();
        System.out.println("Foram feitas "+cont+" modificações.");
        System.out.println("Vetor modificado: ");
        mostreVetor();
    }
    
}
