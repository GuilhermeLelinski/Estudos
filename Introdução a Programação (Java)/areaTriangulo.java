
package aula.pkg2.pkg1;

import java.util.Scanner;


public class Aula21 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int base, altura, area, perimetro;
 //  Entrada de dados      
        System.out.print("Digite a medida da base do retângulo: ");
        base = Integer.valueOf(input.nextLine());
        System.out.print("Digite a medida da altura do retângulo: ");
        altura = Integer.valueOf(input.nextLine());
 //  Processamento     
        area = base*altura;
        perimetro = 2*base + 2*altura;
 //  Saída de dados     
        System.out.println("Áre do retângulo: "+area);
        System.out.println("Perímetro do retângulo: "+perimetro);
        
    }
    
}
