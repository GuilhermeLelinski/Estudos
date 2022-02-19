/*
Quais resultados são apresentados pelo programa abaixo
 */
package exemplo3_subprogramas;


public class Exemplo3_Subprogramas {

    static void funcao1() {
        int v = 0;
        System.out.println(v);
        v++;
        System.out.println(v);
    }
    
    static void funcao2() {
        int v = 0;
        System.out.println(v);
        v = v + 3;
        System.out.println(v);
    }
    
    public static void main(String[] args) {
        funcao1();
        funcao2();
        funcao1();
        funcao2();
    }
}
