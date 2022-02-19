/*
Os organizadores de uma competição de tiro ao alvo solicitaram que você crie um programa
para auxiliar na contagem de pontos do evento. A competição é organizada por rodadas e
participam dela 12 competidores. Faça um programa que leia, inicialmente, o nome dos 12
competidores. Em seguida ele deve ler a pontuação obtida (número inteiro) por cada um dos
competidores na primeira rodada. Na sequência ele deve ler as notas de todos os competidores
em cada uma das cinco rodadas. Lembre-se que ao final de cada rodada são digitadas as notas
de todos os competidores naquela rodada, antes de iniciar a digitação da pontuação da rodada
seguinte. Após ler todos os dados o programa deve calcular e apresentar:
- O nome e a pontuação total de cada candidato (soma de todas as suas notas);
- O nome e a pontuação corrigida de cada candidato (soma de três notas do candidato, após
descartar a sua maior e a sua menor nota);
- O nome do candidato com maior pontuação total;
- O nome do candidato com maior pontuação corrigida;
- Uma mensagem indicando se o candidato com a maior pontuação total e o mesmo que obteve a
maior pontuação corrigida.
 */
package questão2;

import java.util.Scanner;

public class Questão2 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] notas = new int[12][5];
        String[] nomes = new String[12];
        int notaTotal, maiorNota, cMaiorNota;
        
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o nome do competidor "+i+": ");
            nomes[i] = input.nextLine();           
        }
        for (int i = 0; i < 12; i++) {            
            for (int j = 0; j < 5; j++) {
                    System.out.print("Digite a pontuação "+j+" do competidor "+nomes[i]+": ");
                    notas[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        
    //O nome e a pontuação total de cada candidato
        for (int i = 0; i < 12; i++) {
            notaTotal = 0;
            for (int j = 0; j < 5; j++) {
                notaTotal = notaTotal + notas[i][j];
            }
            System.out.println("A pontuação total do candidado(a) "+nomes[i]+" é: "+notaTotal);
        }
        
    //O nome do candidato com maior pontuação total
        maiorNota = notas[0][0];
        cMaiorNota = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 5; j++) {
                if (notas[i][j]>maiorNota){
                    maiorNota = notas[i][j];
                    cMaiorNota = i;
                }
            }
        }
        System.out.println("O candidato(a) "+nomes[cMaiorNota]+" tem a maior pontuação total.");
    }
    
}
