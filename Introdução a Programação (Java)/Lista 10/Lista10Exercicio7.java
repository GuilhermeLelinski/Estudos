package lista10exercicio7;

import java.util.Scanner;


public class Lista10Exercicio7 {

   public static double[][] leiaMatriz(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantas linhas e colunas tem a matriz: ");
        int n = Integer.valueOf(input.nextLine());
        double[][] mat = new double[n][n];
        
        System.out.println("Digite os dados da matriz A: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("Digite o elemento da linha "+i+" coluna "+j+": ");
                mat[i][j] = Integer.valueOf(input.nextLine());
            }
        }  
        return mat;
   } 
    
    public static double[][] calculeTransposta(double[][] mat){
        int n = mat.length;
        double [][] matTrans = new double[n][n];
        
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
              matTrans[j][i] = mat[i][j];
            }
        }
        return matTrans;
    }
    
    public static boolean verifiqueSimetria(double[][] mat, double[][] matTrans){
        boolean  simetrica = true;
        int i, j, n = mat.length;
        i = 0;
        while (i<n && simetrica==true) {
            j = 0;
            while (j<n && simetrica==true){
                if (mat[i][j]!=matTrans[i][j]){
                    simetrica = false;
                }
                j++;
            }
            i++;            
        }
        return simetrica;
    }
    
    public static void main(String[] args) {
        double[][] matriz = leiaMatriz();
        double[][] matrizTransposta = calculeTransposta(matriz);
        boolean resultado = verifiqueSimetria(matriz,matrizTransposta);
        if (resultado==true){
            System.out.println("A matriz é simétrica.");
        }
        else {
            System.out.println("A matriz não é simétrica.");
        }
    }
    
    
}
