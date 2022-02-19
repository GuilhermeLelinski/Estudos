package lista9exercicio2;

import java.util.Scanner;

public class Lista9Exercicio2 {

    public static double encontreMaior(double x, double y){
        if (x > y){
            return x;
        }
        else {
            return y;
        }
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, maior;
        
        System.out.print("Digite o primeiro número: ");
        num1 = Double.valueOf(input.nextLine());
        System.out.print("Digite o segundo número: ");
        num2 = Double.valueOf(input.nextLine());
        
        maior = encontreMaior(num1, num2);
                
        System.out.println("O maior número digitado é "+maior);
    }
    
}
