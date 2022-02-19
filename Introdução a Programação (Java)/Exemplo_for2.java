
package exemplo_for2;

import java.util.Scanner;

public class Exemplo_for2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, quadrado, i, n, contPositivo = 0, contNegativo = 0, acumulador = 0;
        
        System.out.println("Digite quantos números deseja elevar ao quadrado: ");
        n = Integer.valueOf(input.nextLine());
        for (i=1;i<=n;i++){
            System.out.println("Digite um número inteiro: ");
            numero=Integer.valueOf(input.nextLine());
            acumulador=acumulador+numero;
            quadrado=numero*numero;
            System.out.println("Resultado: "+quadrado);
            if (numero<0){
                contNegativo=contNegativo+1;
            }
            else{
                contPositivo=contPositivo+1;
            }
        }
    }
    
}
