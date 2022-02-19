package lista10exercicio1;

import java.util.Scanner;

public class Lista10Exercicio1 {

    public static double convertaAngulo(double x){
       return x * 3.1416 / 180;
    }
    
    public static double calculePotencia(double r, int n){
        double pot=1;
        for (int i=1;i<=n;i++){
            pot = pot * r;
        }
        return pot;
    }
    
    public static int calculeFatorial(int n){
        int fat=1;
        for (int i=2;i<=n;i++){
            fat = fat * i;
        }
        return fat;
    }
    
    public static double calculeSeno(double r){
        double potencia, divisao, soma=0;
        int fatorial, temp=1;

        for (int i=1;i<=15;i=i+2){
            potencia = calculePotencia(r,i);
            fatorial = calculeFatorial(i);
            divisao = (potencia / fatorial)*temp;
            temp = temp * -1;
            soma = soma + divisao;
        }
        return soma;
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angGraus, angRad, seno;
        
//Entrada de dados
        System.out.println("Digite um ângulo em graus: ");
        angGraus = Double.valueOf(input.nextLine());
//Processamento
        angRad = convertaAngulo(angGraus);
        seno = calculeSeno(angRad);
//Saida de dados
        System.out.println("O seno de "+angGraus+" graus é: "+seno);
    }
    
}
