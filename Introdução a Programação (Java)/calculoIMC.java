package calculoIMC;

import java.util.Scanner;



public class calculoIMC {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nome;
        double peso, altura, imc;
//Entrada de dados        
        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite o seu peso: ");
        peso = Double.valueOf (input.nextLine());
        System.out.println("Digite a sua altuta: ");
        altura = Double.valueOf (input.nextLine());
//Processamento dos dados        
        imc = peso / (altura*altura);
        
        System.out.println("Olá "+nome+", esse é o seu IMC: "+imc);
    }
}
    
        
                
        
       
