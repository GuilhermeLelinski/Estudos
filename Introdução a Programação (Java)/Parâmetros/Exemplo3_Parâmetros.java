
package exemplo3_parâmetros;


public class Exemplo3_Parâmetros {

    static void metodo1 (int[] x) {
        System.out.println(x[0]);
        x[0] = 10;
        System.out.println(x[0]);
    }
    
    public static void main(String[] args) {
        int numeros[] = {5, 8, 7, 3, 2};
        System.out.println(numeros[0]);
        metodo1(numeros);
        System.out.println(numeros[0]);
    }
    
}
