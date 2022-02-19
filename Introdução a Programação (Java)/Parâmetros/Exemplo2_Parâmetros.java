
package exemplo2_parâmetros;


public class Exemplo2_Parâmetros {

    static void metodo1(int x) {
        System.out.println(x);
        x = 10;
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(numero);
        metodo1(numero);
        System.out.println(numero);
    }
    
}
