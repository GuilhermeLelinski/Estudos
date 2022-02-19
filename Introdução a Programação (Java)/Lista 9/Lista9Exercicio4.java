package lista9exercicio4;

import java.util.Scanner;

public class Lista9Exercicio4 {

    public static int conteVogais(String f){
        int cont=0;
        for (int i=0;i<f.length();i++){
            if (f.charAt(i)=='a' || f.charAt(i)=='e' || f.charAt(i)=='i' ||
                f.charAt(i)=='o' || f.charAt(i)=='u' || f.charAt(i)=='A' ||
                f.charAt(i)=='E' || f.charAt(i)=='I' || f.charAt(i)=='O' ||
                f.charAt(i)=='U'){
                cont = cont + 1; //cont++
            }
        }
         return cont;
    }
    
    
    public static int conteConsoantes(String f){
        int cont=0;
        for (int i=0;i<f.length();i++){
            if (f.charAt(i)=='b' || f.charAt(i)=='c' || f.charAt(i)=='d' ||
                f.charAt(i)=='f' || f.charAt(i)=='g' || f.charAt(i)=='h' ||
                f.charAt(i)=='j' || f.charAt(i)=='k' || f.charAt(i)=='l' ||
                f.charAt(i)=='m' || f.charAt(i)=='n' || f.charAt(i)=='p' ||
                f.charAt(i)=='q' || f.charAt(i)=='r' || f.charAt(i)=='s' ||
                f.charAt(i)=='t' || f.charAt(i)=='v' || f.charAt(i)=='w' ||
                f.charAt(i)=='x' || f.charAt(i)=='y' || f.charAt(i)=='z' ||
                f.charAt(i)=='B' || f.charAt(i)=='C' || f.charAt(i)=='D' ||
                f.charAt(i)=='F' || f.charAt(i)=='G' || f.charAt(i)=='H' ||
                f.charAt(i)=='J' || f.charAt(i)=='K' || f.charAt(i)=='L' ||
                f.charAt(i)=='M' || f.charAt(i)=='N' || f.charAt(i)=='P' ||
                f.charAt(i)=='Q' || f.charAt(i)=='R' || f.charAt(i)=='S' ||
                f.charAt(i)=='T' || f.charAt(i)=='V' || f.charAt(i)=='W' ||
                f.charAt(i)=='X' || f.charAt(i)=='Y' || f.charAt(i)=='Z') {
                cont = cont + 1; //cont++
            }
        }
        return cont;
    }
    
    public static void mostreResultados(int cv, int cc){
        System.out.println("Quantidade de vogais: "+cv);
        System.out.println("Quantidade de consoantes: "+cc);   
    }
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        int contVogais, contConsoantes;
    //Entrada de dados
        System.out.print("Digite uma frase: ");
        frase = input.nextLine();
    //Processamento de dados
        contVogais = conteVogais(frase);
        contConsoantes = conteConsoantes(frase);
    //Saída de dados
        mostreResultados(contVogais,contConsoantes);
    }
    
}
