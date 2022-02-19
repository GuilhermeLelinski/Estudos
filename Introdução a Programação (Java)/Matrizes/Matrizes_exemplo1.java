/*
Faça um programa que preencha uma matriz de números inteiros, que possui cinco
linhas e quatro colunas, e depois apresente os dados em formato matricial.
 */
package matrizes_exemplo1;

import java.util.Scanner;

public class Matrizes_exemplo1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [][] matriz = new int[5][4];
        
        for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                System.out.println("Digite o número a ser armazenado na linha "+i+", coluna "+j+": ");
                matriz[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        
        System.out.println("Matriz digitada: ");
        for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
