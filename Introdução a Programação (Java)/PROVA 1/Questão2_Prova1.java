package questão2_prova1;

import java.util.Scanner;


public class Questão2_Prova1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int produto, quantidade;
        
 //Entrada de dados       
        System.out.println("1 - Calça, valor: R$80,00");
        System.out.println("2 - Camiseta, valor: R$29,00");
        System.out.println("3 - Blusa, valor: R$90,00");
        System.out.println("4 - Jaqueta, valor: R$100,00");
        System.out.println("5 - Meia, valor: R$15,00");
        System.out.println("6 - Tênis, valor: R$130,00");
        System.out.print("Digite o código do produto: ");
        produto = Integer.valueOf(input.nextLine());
        System.out.print("Digite a quantidade comprada: ");
        quantidade = Integer.valueOf(input.nextLine());
        
 //Processamento e Saída de dados       
        switch(produto){
            case 1: System.out.println("O produto escolhido foi Calça, e o valor a ser pago é de R$"+ quantidade * 80.00);
                    break;
            case 2: System.out.println("O produto escolhido foi Camiseta, e o valor a ser pago é de R$"+ quantidade * 29.00); 
                    break;
            case 3: System.out.println("O produto escolhido foi Blusa, e o valor a ser pago é de R$"+ quantidade * 90.00);
                    break;
            case 4: System.out.println("O produto escolhido foi Jaqueta, e o valor a ser pago é de R$"+ quantidade * 100.00);
                    break;
            case 5: System.out.println("O produto escolhido foi Meia, e o valor a ser pago é de R$"+ quantidade * 15.00);
                    break;
            case 6: System.out.println("O produto escolhido foi Tênis, e o valor a ser pago é de R$"+ quantidade * 130.00);
                    break;
            default: System.out.println("Código de produto inválido");        
    }

    }
    
}
