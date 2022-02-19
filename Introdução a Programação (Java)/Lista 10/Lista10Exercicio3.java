package lista10exercicio3;

import java.util.Scanner;

public class Lista10Exercicio3 {

 
      public static int[] leiaNumeros(){
        Scanner input = new Scanner(System.in);
        int[] v = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número inteiro da posição "+i+": ");
            v[i] = Integer.valueOf(input.nextLine());
        }
        return v;
    }
    
    public static int encontreMaior(int[] num){
        int maior = num[0];
        int pos = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maior){
                maior = num[i];
                pos = i;
            }
        }
        return pos;
    }
    
    public static int encontreMenor(int[] num){
        int menor = num[0];
        int pos = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < menor){
                menor = num[i];
                pos = i;
            }
        }
        return pos;
    }
    
  
    public static void apresenteResultados(int[] num, int posMaior, int posMenor){
        System.out.println("Maior número: "+num[posMaior]);
        System.out.println("Posição do maior número: "+posMaior);
        System.out.println("Menor número: "+num[posMenor]);
        System.out.println("Posição do menor número: "+posMenor);
        int dif = num[posMaior] - num[posMenor];
        System.out.println("Diferença entre o maior e o menor número: "+dif);
        
    }
    
    public static void main(String[] args) {
        int[] numeros = leiaNumeros();
        int posMaior = encontreMaior(numeros);
        int posMenor = encontreMenor(numeros);
        apresenteResultados(numeros, posMaior ,posMenor);
    }
    
}
