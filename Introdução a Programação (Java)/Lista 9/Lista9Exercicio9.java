package lista9exercicio9;

import java.util.Scanner;

public class Lista9Exercicio9 {
 
    public static int[] leiaVetor(){
        Scanner input = new Scanner(System.in);
        int[] v = new int[10];
        for (int i=0;i<10;i++){
            System.out.print("Digite o elemento da posição "+i+": ");
            v[i] = Integer.valueOf(input.nextLine());
        }
        return v;
    }
    
    public static int[] somaVetor(int[] v1, int[] v2){
        int[] x = new int[10];
        for (int i=0;i<10;i++){
            x[i] = v1[i] + v2[i];
        }
        return x;
    }
    
    public static void mostreVetor(int[] t){
        for (int i = 0; i < 10; i++) {
            System.out.println(t[i]);    
        }
    }
    
    public static void main(String[] args) {
        int[] A, B, C;

//Entrada de dados        
        A = leiaVetor();
        B = leiaVetor();
//Processamento de dados
        C = somaVetor(A,B);
//Saída de dados
        mostreVetor(C);
    }
    
}
