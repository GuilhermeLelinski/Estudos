package lista10exercicio5;

import java.util.Scanner;

public class Lista10Exercicio5 {

  
    public static int[] leiaVetor(int n, char texto){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os dados do vetor "+texto);
        int[] v = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Digite o elemento da posição "+i+": ");
            v[i] = Integer.valueOf(input.nextLine());
        }
        return v;
    }
    
    public static boolean ehSubconjunto(int[] v1, int[] v2){
        boolean encontrou = true;
        int i,j;
        
        i = 0;
        while (i<5 && encontrou==true){
            encontrou = false;
            j = 0;
            while (j < 10 && encontrou==false){
                if (v1[i]==v2[j]){
                    encontrou=true;
                }
                j++;
            }
            i++;
        }
        return encontrou;
    }
    

    
    public static void main(String[] args) {
        int[] A, B;
        boolean resultado;

//Entrada de dados        
        A = leiaVetor(5,'A');
        B = leiaVetor(10,'B');
//Processamento de dados
        resultado = ehSubconjunto(A,B);
//Saída de dados
        if (resultado==true){
            System.out.println("A é subconjunto de B");
        }
        else {
            System.out.println("A não é subconjunto de B");
        }
    }
    
}
