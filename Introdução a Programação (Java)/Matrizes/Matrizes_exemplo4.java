/*
Uma empresa possui uma planilha com os registros da conta de energia elétrica de
cada uma de suas filiais. Em cada linha da planilha encontra-se o nome da filial
e na sequência, o consumo dos meses de Janeiro a Abril de 2020.
Considerando que a empresa possui 3 filiais, faça um programa que leia esses
dados e apresente:
- O consumo total da empresa nesse periodo.
- O consumo de cada filial nesse período.
- O consumo da empresa em cada mês desse período.
- O maior consumo da empresa e em qual filiai e mês ele ocorreu.
 */
package matrizes_exemplo4;

import java.util.Scanner;

public class Matrizes_exemplo4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] filiais = new String[3];
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
    
    //O consumo total da empresa nesse periodo.
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome da filial "+i+": ");
            for (int j = 0; j < 4; j++) {
                somaMatriz = somaMatriz + A[i][j];
            }           
        }
        System.out.println("Soma de todos os elementos da matriz: "+somaMatriz);
        
    //O consumo de cada filial nesse período.
        for (int i = 0; i < 3; i++) {
            somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha = somaLinha + A[i][j];
            }
            System.out.println("Soma da linha "+i+": "+somaLinha);
        }
        
    //O consumo da empresa em cada mês desse período.
        for (int j = 0; j < 4; j++) {
            somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna = somaColuna + A[i][j];
            }
            System.out.println("Soma da coluna "+j+": "+somaColuna);
        }
        
    //O maior consumo da empresa e em qual filiai e mês ele ocorreu.
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
