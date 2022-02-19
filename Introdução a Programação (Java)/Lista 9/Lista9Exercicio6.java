package lista9exercicio6;

import java.util.Scanner;

public class Lista9Exercicio6 {


     public static double calculeSaldo(double sal, double tx){
        return sal + sal*tx/100;
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo, taxa, novoSaldo;
        
        System.out.print("Digite o saldo da conta: ");
        saldo = Double.valueOf(input.nextLine());
        System.out.print("Digite a taxa de juros: ");
        taxa = Double.valueOf(input.nextLine());
        
        novoSaldo = calculeSaldo(saldo, taxa);
                
        System.out.println("O valor do novo saldo é R$ "+novoSaldo);
    }
    
}
