package lista9exercicio8;

import java.util.Scanner;

public class Lista9Exercicio8 {
    
    public static void mostreOpcoes(){
        System.out.println("1 - Venda a Vista - desconto de 10%.");
        System.out.println("2 - Venda a Prazo 30 dias - desconto de 5%.");
        System.out.println("3 - Venda a Prazo 60 dias - mesmo preço.");
        System.out.println("4 - Venda a Prazo 90 dias - acréscimo de 5%.");
        System.out.println("5 - Venda com cartão de débito - desconto de 7%.");
        System.out.println("6 - Venda com cartão de crédito - desconto de 5%.");
    }

     public static double calculeValorFinal(double venda, int cond){
        switch (cond){
            case 1: return venda - venda*10/100;
            case 2: return venda - venda*5/100;
            case 3: return venda;
            case 4: return venda + venda*5/100;
            case 5: return venda - venda*7/100;
            case 6: return venda - venda*5/100;
            default: System.out.println("Opção de pagamento inválida.");
                     return 0;
        }
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorVenda, valorFinal;
        int condicao;
        
        System.out.print("Digite o valor da venda: ");
        valorVenda = Double.valueOf(input.nextLine());
        mostreOpcoes();
        System.out.print("Digite a condição de pagamento: ");
        condicao = Integer.valueOf(input.nextLine());
        
        valorFinal = calculeValorFinal(valorVenda, condicao);
                
        System.out.println("O valor final da venda é R$ "+valorFinal);
    }    
}
