/*
Faça um programa que simule uma urna eletrônica. Primeiramente, o programa deve
perguntar o número do título do eleitor. Em seguida, ele deve solicitar o número
do candidato em quem ele deseja votar:
1 - João;
2 - Maria;
3 - José.
Qualquer outro número é considerado voto nulo.
O programa deve apresenatar o candidato votado e perguntar se o usuário confirma
o voto (SIM ou NÃO). Caso ele confirme, deve aparecer a mensagem "Voto cadastrado
com sucesso", caso contrário, o programa deve solicitar de novo em quem o eleitor
votará.
O programa deve ser repetido até que o título de eleitor informado seja 0.
Ao final, ele deve apresentar quantos votos cada candidato recebeu.
 */
package exemplo_while4;

import java.util.Scanner;


public class Exemplo_while4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int titulo, voto, cont1=0, cont2=0, cont3=0, cont4=0;
        char confirma;
        
 //Entrada de dados 
        System.out.print("Digite o número do título de eleitor: ");
        titulo=Integer.valueOf(input.nextLine());
        while (titulo!=0){
            
            do {
                System.out.print("Digite o número do candidato: ");
                voto=Integer.valueOf(input.nextLine());
                switch (voto){
                    case 1: System.out.println("Você votou no João.");
                            break;
                    case 2: System.out.println("Você votou na Maria.");
                            break;
                    case 3: System.out.println("Você votou no José.");
                            break;
                    default: System.out.println("Você votou nulo.");        
                }
                System.out.print("Confirma seu voto? (S/N) ");
                confirma = input.nextLine().charAt(0);
            } while (confirma=='N');
            
            switch (voto){
                    case 1: cont1=cont1+1;
                            break;
                    case 2: cont2=cont2+1;
                             break;
                    case 3: cont3=cont3+1;
                            break;
                    default: cont4=cont4+1;
            }        
            //Entrada de dados
            System.out.print("Digite o número do título de eleitor: ");
            titulo=Integer.valueOf(input.nextLine());
        }
        System.out.println("Resultado da eleição.");
        System.out.println("João recebeu "+cont1+" votos.");
        System.out.println("Maria recebeu "+cont2+" votos.");
        System.out.println("José recebeu "+cont3+" votos.");
        System.out.println("Votos nulos: "+cont4);
    }
    
}
