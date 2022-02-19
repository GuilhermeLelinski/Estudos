package lista9exercicio10;

import java.util.Scanner;

public class Lista9Exercicio10 {

    public static int[] leiaIdades(){
        Scanner input = new Scanner(System.in);
        System.out.print("Quantidade de pessoas entrevistadas: ");
        int n = Integer.valueOf(input.nextLine());
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Digite a idade da pessoa "+i+" (18 a 65 anos): ");
                v[i] = Integer.valueOf(input.nextLine());
            } while (v[i] < 18 || v[i] > 65);
        }
        return v;
    }
    
    public static char[] leiaGeneros(int n){
        Scanner input = new Scanner(System.in);
        char[] v = new char[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Digite o gênero da pessoa "+i+" (M ou F): ");
                v[i] = input.nextLine().charAt(0);
            } while (v[i] != 'M' && v[i] !='F');
        }
        return v;
    }
    
    public static double[] leiaSalarios(int n){
        Scanner input = new Scanner(System.in);
        double[] v = new double[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Digite o salário da pessoa "+i+" (R$ 1.000,00 a R$ 20.000,00): ");
                v[i] = Double.valueOf(input.nextLine());
            } while (v[i] < 1000 || v[i] > 20000);
        }
        return v;
    }
    
    public static double calculeMediaSalarial(double[] sal){
        double soma = 0;
        for (int i = 0; i < sal.length; i++) {
            soma = soma + sal[i];            
        }
        return soma / sal.length;
    }
    
    public static int encontreMaiorIdade(int[] id){
        int maior = id[0];
        for (int i = 1; i < id.length; i++) {
            if (id[i] > maior){
                maior = id[i];
            }
        }
        return maior;
    }
    
    public static int encontreMenorIdade(int[] id){
        int menor = id[0];
        for (int i = 1; i < id.length; i++) {
            if (id[i] < menor){
                menor = id[i];
            }
        }
        return menor;
    }
    
    public static int conteMulheresAcimaMedia(char[] gen, double[] sal, double medSal){
        int cont = 0;
        for (int i = 0; i < gen.length; i++) {
            if (gen[i]=='F' && sal[i]>medSal){
                cont++;
            }
        }
        return cont;
    }
    
    public static void apresenteResultados(double ms,int maior,int menor,int cont){
        System.out.println("Média Salarial: "+ms);
        System.out.println("Maior idade: "+maior);
        System.out.println("Menor idade: "+menor);
        System.out.println("Quantidade de mulheres que ganham acima da média salarial: "+cont);
        
    }
    
    public static void main(String[] args) {
        int[] idades = leiaIdades();
        char[] generos = leiaGeneros(idades.length);
        double[] salarios = leiaSalarios(idades.length);
        double mediaSalarial = calculeMediaSalarial(salarios);
        int maiorIdade = encontreMaiorIdade(idades);
        int menorIdade = encontreMenorIdade(idades);
        int contMulheres = conteMulheresAcimaMedia(generos, salarios,mediaSalarial);
        apresenteResultados(mediaSalarial,maiorIdade,menorIdade,contMulheres);
    }
    
}
