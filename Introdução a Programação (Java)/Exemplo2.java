/*
 Faça um programa em Java que leia o salário a ser pago a um funcionário e 
sua quantidade de filhos. Se o funcionário tiver mais de 2 filhos, ele deve
receber um abono de R$300,00. Por fim, o programa deve apresentar o salário 
total do funcionário.
 */
package exemplo2;

import java.util.Scanner;


public class Exemplo2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;
        int filhos;
        
 //Entrada de dados       
        System.out.print("Digite o salário base: ");
        salario = Double.valueOf(input.nextLine());
        System.out.print("Digite a quantidade de filhos: ");
        filhos = Integer.valueOf(input.nextLine());
        
 //Processamento de dados       
        if (filhos>2){
            salario = salario + 300;
        }
 //Saída de dados
 
        System.out.println("O salario final é: "+salario);
    }
    
}
