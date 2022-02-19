/*
Um hotel cobra os seguintes valores por diária:
R$95.00 por diária, se o número de diárias for até 5;
R$90.50 por diária, se o número de diárias for de 6 a 10;
R$82.00 por diária, se o número de diárias for acima de 10;

Faça um programa que leia o nome e a quantidade de diárias de cada hóspede. Esse 
programa deve calcula e imprimir o nome e o valor de conta de cada cliente do hotel.
No final, o programa deve imprimir também o total a ser recebido pelo hotel nesse dia.
O programa deve ser terminado quando o usuário digital FIM como nome do cliente.
*/
package exemplo_while2;

import java.util.Scanner;


public class Exemplo_while2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int diarias;
        double conta, contaTotal=0;
        
 //Entrada de dados       
        System.out.print("Digite o nome do hóspede: ");
        nome = input.nextLine();
        while (nome.equalsIgnoreCase("Fim")==false) {
            System.out.print("Digite a quantidade de diárias: ");
            diarias = Integer.valueOf(input.nextLine());
    //Processamento de dados       
            if (diarias <= 5){
                conta = diarias*95;
             } 
            else{
                if (diarias <=10){
                     conta = diarias*90.50;
                 }
                else{
                    conta = diarias*82;
                }
            }
            contaTotal = contaTotal+conta;
    //Saída de dados     
            System.out.println("Nome do hóspede: "+nome);
            System.out.println("Valor da conta: "+conta);
     //Entrada de dados   
            System.out.print("Digite o nome do hóspede: ");
            nome = input.nextLine();
        }
        System.out.println("Valor total arrecadado no dia: "+contaTotal);
    }
    
}
