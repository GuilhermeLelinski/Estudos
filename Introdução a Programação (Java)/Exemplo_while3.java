/*
Altere o programa anterior para que ele, apo´s realizar a saída de um hóspede,
pergunte se há mais alguém a ser registrado (SIM) ou não (NÃO). Nesse caso o 
programa deve ser terminado.
*/
package exemplo_while3;

import java.util.Scanner;


public class Exemplo_while3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, continua;
        int diarias;
        double conta, contaTotal=0;
        
 //Entrada de dados       
        do {    
            System.out.print("Digite o nome do hóspede: ");
            nome = input.nextLine();
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
            System.out.print("Deseja cadastrar a saída de mais um hóspede? (SIM/NÃO): ");
            continua = input.nextLine();
        } while (continua.equalsIgnoreCase("Sim")==true);    
        
        
        System.out.println("Valor total arrecadado no dia: "+contaTotal);
    }
    
}
