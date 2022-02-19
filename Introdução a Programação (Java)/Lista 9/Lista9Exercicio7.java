package lista9exercicio7;
import java.util.Scanner;
public class Lista9Exercicio7 {

    public static String converteNota(int x){
        if (x <=49){
            return "Insuficiente";
        }
        else {
            if (x <= 64){
                return "Regular";
            }
            else {
                if (x <= 84){
                    return "Bom";
                }
                else {
                    return "Ótimo";
                }
            }
        }
    }
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome,conceito;
        int nota;
//Entrada de dados        
        System.out.print("Digite o nome do aluno: ");
        nome = input.nextLine();
        System.out.print("Digite a nota do aluno: ");
        nota = Integer.valueOf(input.nextLine());
 //Processamento
        conceito = converteNota(nota);
 //Saída de dados
        System.out.println("Nome do aluno: "+nome);
        System.out.println("Nota do aluno: "+nota);
        System.out.println("Conceito do aluno: "+conceito);
    }
    
}
