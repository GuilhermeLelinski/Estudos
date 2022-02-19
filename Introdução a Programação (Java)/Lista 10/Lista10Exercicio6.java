package lista10exercicio6;

import java.util.Scanner;

public class Lista10Exercicio6 {
    
    public static double[][] leiaMatriz(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de linhas da matriz: ");
        int n = Integer.valueOf(input.nextLine());
        System.out.print("Digite a quantidade de colunas da matriz: ");
        int m = Integer.valueOf(input.nextLine());
        double[][] mat = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Digite o elemento M["+i+"]["+j+"]: ");
                mat[i][j] = Double.valueOf(input.nextLine());
            }
        }
        return mat;
    }
    
    public static double someMatriz(double[][] mat){
        double s=0;
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                s = s + mat[i][j];
            }
        }
        return s;
    }
    
    public static void main(String[] args) {
        double[][] matriz;
        double soma;
        
        matriz = leiaMatriz();
        soma = someMatriz(matriz);
        System.out.println("Soma dos elementos da matriz: "+soma);
        
    }
    
}
