/*
 Faça um programa que leia o preço base de um produto e calcule o seu preço final,
que é dado pelo preço base menos um desconto, conforme a tabela abaixo:

- Produtos até R$99,99 - Desconto de 2%; <=99.99
- Produtos de R$100,00 a R$199,99 - Desconto de 5%; <=199.99
- Produtos de R$200,00 a R$499,99 - Desconto de 7%; <=499.99
- Produtos acima de R$500,00 - Desconto de 10%; >500
 */
package exemplo5;

import java.util.Scanner;

public class Exemplo5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precoBase, precoFinal;
        
 //Entrada de dados       
        System.out.print("Digite o preço base do produto: ");
        precoBase = Double.valueOf(input.nextLine());
        
 //Processamento de dados
        if(precoBase<=99.99){
            precoFinal = precoBase - precoBase * 2/100;
        }
        else {
            if(precoBase<=199.99){
                precoFinal = precoBase - precoBase * 5/100;
            }
            else{
                if(precoBase<=499.99){
                    precoFinal = precoBase - precoBase * 7/100;
                }
                else{
                    precoFinal = precoBase - precoBase * 10/100;
                }
            }
                
        }
 //Saída de dados
        System.out.println("O preço final do produto é de R$"+precoFinal);
          
    }
    
}
