/*
Faça um programa que leia um vetor A contendo 10 números inteiros diferentes. 
Após ler todos os números, o programa deve solicitar que o usuário digite um 
número a ser pesquisado no vetor. O programa deve verificar se o número existe
no vetor e informar uma das seguintes mensagens:
- O número está cadastrado na posição "X" do vetor;
- O número NÃO está cadastrado no vetor.
 */
package exemplo4;

import java.util.Scanner;

public class Exemplo4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] A = new int[10];
        int num, pos=-1;
        
        for (int i=0;i<10;i++){
            System.out.print("Digite o elemento da posição "+i+": ");
            A[i] = Integer.valueOf(input.nextLine());
        }
        System.out.println("Digite o elemento a ser procurado: ");
        num = Integer.valueOf(input.nextLine());
        for (int i=0;i<10;i++){
            if (num==A[i]){
                pos = i;
            }
        }
        if (pos==-1){
            System.out.println("O número NÃO está cadastrado no vetor.");
        }
        else {
            System.out.println("O número está cadastrado na posição "+pos+" do vetor.");
        }
    }
    
}
