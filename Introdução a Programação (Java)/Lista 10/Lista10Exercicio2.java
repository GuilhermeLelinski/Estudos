package lista10exercicio2;

import java.util.Scanner;

public class Lista10Exercicio2 {

    public static double[] leiaVetor(){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Digite o tamanho do vetor: ");
        n = Integer.valueOf(input.nextLine());
        double[] v = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento da posição "+i+": ");
            v[i] = Double.valueOf(input.nextLine());
        }
        return v;
    }
    
    public static void apresentePosicoesNegativos(double[] vet){
        int n = vet.length;
        for (int i = 0; i < n; i++) {
            if (vet[i]<0){
                System.out.println("A posição "+i+" tem um número negativo");
            }
        }
    }
            
    public static void main(String[] args) {
        double[] vetor;
        
        vetor = leiaVetor();
        apresentePosicoesNegativos(vetor);
    }
    
}
