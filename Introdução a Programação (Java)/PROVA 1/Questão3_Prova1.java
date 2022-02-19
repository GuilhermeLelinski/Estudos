package questão3_prova1;

import java.util.Scanner;


public class Questão3_Prova1 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distancia, peso, frete, valorBase, valorFinal;
        boolean entrega;
        
 //Entrada de dados       
        System.out.print("Digite a distância, em quilômetros, a ser percorrida para o transporte da carga: ");
        distancia = Double.valueOf(input.nextLine());
        System.out.print("Digite o peso da carga em quilos: ");
        peso = Double.valueOf(input.nextLine());
        System.out.print("A entrega é urgente? (true/false): ");
        entrega = Boolean.valueOf(input.nextLine());
        
 //Processamento e Saída de dados 
        
        valorBase = 0.80*distancia;
        
        if (peso<5){
            frete = valorBase+valorBase*10/100;
            if (entrega == true){
                valorFinal = frete+30;
                System.out.println("O valor do frete a ser cobrado é de R$"+valorFinal);
            }
            else{
                System.out.println("O valor do frete a ser cobrado é de R$"+frete);
            }
        }
        else{
            if (peso>=5 && peso<10){
                frete = valorBase+valorBase*20/100;
                if (entrega == true){
                    valorFinal = frete+30;
                    System.out.println("O valor do frete a ser cobrado é de R$"+valorFinal);
                }
                else{
                    System.out.println("O valor do frete a ser cobrado é de R$"+frete);
                }
                
        } 
            else {
                if (peso>=10 && peso<50){
                    frete = valorBase+valorBase*30/100;
                    if (entrega == true){
                        valorFinal = frete+30;
                        System.out.println("O valor do frete a ser cobrado é de R$"+valorFinal);
                    }
                    else{
                        System.out.println("O valor do frete a ser cobrado é de R$"+frete);
                    }
                }
                else{
                    if (peso>=50){
                        frete = valorBase+valorBase*50/100;
                        if (entrega == true){
                            valorFinal = frete+30;
                            System.out.println("O valor do frete a ser cobrado é de R$"+valorFinal);       
                        }
                        else{
                            System.out.println("O valor do frete a ser cobrado é de R$"+frete);
                        }
                    }
                }
            }    
        }
         
        
                
    } 
}
