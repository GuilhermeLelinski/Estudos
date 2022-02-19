
package exemplo_for;

import java.util.Scanner;


public class Exemplo_for {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade, i;
        double preco, valor;
        String produto;
        
 //Entrada de dados       
        for (i=0;i<12;i++){
            System.out.print("Digite o nome do produto: ");
            produto = input.nextLine();
            System.out.print("Digite a quantidade vendida no mês: ");
            quantidade = Integer.valueOf(input.nextLine());
            System.out.print("Digite o preço do produto: ");
            preco = Double.valueOf(input.nextLine());
 //Processamento de dados           
            valor = quantidade*preco;
 //Saída de dados          
            System.out.println("Total arrecadado com as vendas do produto  "+produto+" no mês: "+valor);
        }
    }
    
}
