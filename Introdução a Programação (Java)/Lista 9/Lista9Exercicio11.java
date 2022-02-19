
package lista9exercicio11;

import java.util.Scanner;

public class Lista9Exercicio11 {

 
     public static int[] leiaVetor(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int n = Integer.valueOf(input.nextLine());
        int[] v = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Digite o elemento da posição "+i+": ");
            v[i] = Integer.valueOf(input.nextLine());
        }
        return v;
    }
    
    public static void apresenteResultado(int[] v){
        boolean encontrou = true;
        int numero, cont;
    
        for (int i=0;i<v.length;i++){
            numero = v[i];
            if (numero != -1){
                cont = 0;
                for (int j=0; j<v.length; j++) {
                    if (v[j]==numero){
                        cont++;
                        v[j]=-1;
                    }
                }
                System.out.println("O número "+numero+" aparece "+cont+" vezes no vetor.");
            }
        }
    }
    

    
    public static void main(String[] args) {
        int[] vetor;

        vetor = leiaVetor();
        apresenteResultado(vetor);
    }
    
    
}
