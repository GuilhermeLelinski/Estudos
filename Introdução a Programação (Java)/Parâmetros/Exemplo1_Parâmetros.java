/*
Crie um programa que calcule o fatorial de dois números e apresente a soma 
desses valores.
Entrada:
    - Número1 e Número2
Processamento:
    - Calcular o fatorial do número 1
    - Calcular o fatorail do número 2
    - Somar os fatoriais dos números 1 e 2
Saída:
    - Soma
 */
package exemplo1_parâmetros;

import java.util.Scanner;


public class Exemplo1_Parâmetros {

    static int leiaNumero() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        return Integer.valueOf(input.nextLine());
    }
    
    static int calculeFatorial(int n) {
        int fat = 1;
        for (int i = n; i > 1; i--) {
            fat = fat * i;
        }
        return fat;
    }
    
    public static void main(String[] args) {
        int num1 = leiaNumero();
        int num2 = leiaNumero();
        int fatorial1 = calculeFatorial(num1);
        int fatorial2 = calculeFatorial(num2);
        int res = fatorial1 + fatorial2;
        System.out.println("Fatorial de "+num1+" mais fatorial de "+num2+": "+res);
    }
    
}
