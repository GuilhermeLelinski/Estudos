
package lista9exercicio3;

import java.util.Scanner;

public class Lista9Exercicio3 {

 /*   public static int vogalConsoante(char c){
        switch (c){
            case 'a': return 0;
            case 'e': return 0;
            case 'i': return 0;
            case 'o': return 0;
            case 'u': return 0;
            case 'A': return 0;
            case 'E': return 0;
            case 'I': return 0;
            case 'O': return 0;
            case 'U': return 0;                
            default: return 1;
        }
    }*/
    
    public static int vogalConsoante(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return 0;
        }
        else {
            return 1;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char caracter;
        System.out.print("Digite uma letra: ");
        caracter = input.nextLine().charAt(0);
        int res = vogalConsoante(caracter);
        System.out.println("Resultado: "+res);
    }
    
}
