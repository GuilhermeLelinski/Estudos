
package ola.mundo;

import java.util.Scanner;


public class OlaMundo {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nome;
        double peso, altura, imc;
 // Entrada de dados       
        System.out.println("Digite o seu nome:");
        nome = input.nextLine();
        System.out.println("Digite o seu peso:");
        peso = Double.valueOf (input.nextLine());
        System.out.println("Digite a sua altura:");
        altura = Double.valueOf (input.nextLine());
 // Processamento dos dados       
        imc = peso / (altura*altura);
                
       
        System.out.println ("Olá "+nome+" esse é o seu segundo programa em Java");
        System.out.println("Seu IMC é: "+imc);
        
    }
    
}
