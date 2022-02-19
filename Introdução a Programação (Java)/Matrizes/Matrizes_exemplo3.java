/*
Faça um programa que leia uma matriz [3][4] de números reais, calcule e apresente:
- A soma de todos os elementos da matriz.
- A soma de cada linha da matriz.
- A soma de cada coluna da matriz.
- O maior elemento da matriz e sua posição.
 */
package matrizes_exemplo3;

import java.util.Scanner;


public class Matrizes_exemplo3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] A = new double[3][4];
        double somaMatriz=0, somaLinha, somaColuna, maior;
        int lMaior, cMaior;
        
    //Entrada de dados        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o elemento da linha "+i+", coluna "+j+": ");
                A[i][j] = Double.valueOf(input.nextLine());
            }
        }
    //Processamento de dados   
    
    //A soma de todos os elementos da matriz.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                somaMatriz = somaMatriz + A[i][j];
            }           
        }
        System.out.println("Soma de todos os elementos da matriz: "+somaMatriz);
        
    //A soma de cada linha da matriz.
        for (int i = 0; i < 3; i++) {
            somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha = somaLinha + A[i][j];
            }
            System.out.println("Soma da linha "+i+": "+somaLinha);
        }
        
    //A soma de cada coluna da matriz.
        for (int j = 0; j < 4; j++) {
            somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna = somaColuna + A[i][j];
            }
            System.out.println("Soma da coluna "+j+": "+somaColuna);
        }
        
    //O maior elemento da matriz e sua posição.
        maior = A[0][0];
        lMaior = 0;
        cMaior = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (A[i][j]>maior){
                    maior = A[i][j];
                    lMaior = i;
                    cMaior = j;
                }
            }
        }
        System.out.println("Maior elemento da matriz: "+maior);
        System.out.println("Linha do maior elemento da matriz: "+lMaior);
        System.out.println("Coluna do maior elemento da matriz: "+cMaior);
    }
    
}
