package questão1_prova1;

import java.util.Scanner;


public class Questão1_Prova1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        double precoVenda, valor1, valor2, valor3, valor4, valor4Parc, valor5, valor5Parc;
        
 //Entrada de dados       
        System.out.print("Digite o nome do produto: ");
        nome = input.nextLine();
        System.out.print("Digite o preço de venda do produto: ");
        precoVenda = Double.valueOf(input.nextLine());
        
 //Processamento de dados
        valor1 = precoVenda - precoVenda * 10/100;
        valor2 = precoVenda - precoVenda * 7/100;
        valor3 = precoVenda - precoVenda * 5/100;
        valor4 = precoVenda;
        valor4Parc = precoVenda / 3.0;
        valor5 = precoVenda + precoVenda * 5/100;
        valor5Parc = (precoVenda + precoVenda * 5/100)/5.0;
        
 //Saída de dados
        System.out.println("O valor do "+nome+" em dinheiro à vista é de R$"+valor1);
        System.out.println("O valor do "+nome+" no cartão de débito é de R$"+valor2);
        System.out.println("O valor do "+nome+" no cartão de crédito à vista é de R$"+valor3);
        System.out.println("O valor total do "+nome+" no cartão de crédito parcelado em três vezes é de R$"+valor4+", sendo "+valor4Parc+" o valor de cada parcela.");
        System.out.println("O valor total do "+nome+" no cartão de crédito parcelado em cinco vezes é de R$"+valor5+", sendo "+valor5Parc+" o valor de cada parcela.");
        
    }
    
}
