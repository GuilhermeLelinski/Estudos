/*
Deseja-se armazenar o nome dos produtos comercializados em  uma loja e quantas 
unidades foram vendidas de cada produto, em cada mês do último ano.
 */
package matrizes_exemplo2;

import java.util.Scanner;


public class Matrizes_exemplo2 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[][] vendas = new int[5][12];
       String[] produtos = new String[5];
       
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do produto "+i+": ");
            produtos[i] = input.nextLine();
            for (int j = 0; j < 12; j++) {
                System.out.print("Digite a quantidade vendida de "+produtos[i]+" no mês "+j+": ");
                vendas[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        System.out.println("Levantamento das vendas dos produtos: ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 12; j++){
                System.out.print(vendas[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
