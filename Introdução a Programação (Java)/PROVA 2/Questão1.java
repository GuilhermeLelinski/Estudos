
package questão1;

import java.util.Scanner;


public class Questão1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int[] posicao = new int[8];
       
        
        for (i=0;i<8;i++){
            System.out.print("Digite o número da posição "+i+" do cromossomo: ");
            posicao[i] = Integer.valueOf(input.nextLine());
        }               
    }
    
}
