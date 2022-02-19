package lista9exercicio1;

import java.util.Scanner;

public class Lista9Exercicio1 {

    public static int somaNumeros(int x, int y){
        return x + y;
    }

    public static int subtraiNumeros(int x, int y){
        return x - y;
    }
    
    public static int multiplicaNumeros(int x, int y){
        return x * y;
    }
    
    public static double divideNumeros(int x, int y){
        return (double) x / y;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
    //Entrada de dados
        System.out.print("Digite o primeiro número: ");
        num1 = Integer.valueOf(input.nextLine());
        System.out.print("Digite o segundo número: ");
        num2 = Integer.valueOf(input.nextLine());
    //Processamento e saída de dados
        int soma = somaNumeros(num1, num2);
        System.out.println("Soma dos números: "+soma);
        int sub = subtraiNumeros(num1, num2);
        System.out.println("Subtração dos números: "+sub);
        int mul = multiplicaNumeros(num1, num2);
        System.out.println("Multiplicação dos números: "+mul);        
        if (num2==0){
            System.out.println("Não é possível dividir um número por zero.");
        }    
        else {
            double div = divideNumeros(num1, num2);
            System.out.println("Divisão dos números: "+div);       
        }
    }
    
}
