package lista10exercicio8;

import java.util.Scanner;

public class Lista10Exercicio8 {
    
    public static boolean verificaCPF(String cpf){
  
        int A = Integer.valueOf(cpf.substring(0, 1));
        int B = Integer.valueOf(cpf.substring(1, 2));
        int C = Integer.valueOf(cpf.substring(2, 3));
        int D = Integer.valueOf(cpf.substring(4, 5));
        int E = Integer.valueOf(cpf.substring(5, 6));
        int F = Integer.valueOf(cpf.substring(6, 7));
        int G = Integer.valueOf(cpf.substring(8, 9));
        int H = Integer.valueOf(cpf.substring(9, 10));
        int I = Integer.valueOf(cpf.substring(10, 11));
        int J = Integer.valueOf(cpf.substring(12, 13));
        int K = Integer.valueOf(cpf.substring(13, 14));
        
        int soma = 10*A + 9*B + 8*C + 7*D + 6*E + 5*F + 4*G + 3*H + 2*I;
               
        int resto = soma % 11;
        
        if (resto == 0 || resto == 1){
            if (J!=0){
                return false;
            }
        }
        else {
            if (J != 11-resto){
                return false;
            }
        }
        
        soma = 11*A + 10*B + 9*C + 8*D + 7*E + 6*F + 5*G + 4*H + 3*I + 2*J;

        resto = soma % 11; 
        if (resto == 0 || resto == 1){
            if (K!=0){
                return false;
            }
        }
        else {
            if (K!=11-resto){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um CPF no seguinte formato XXX.XXX.XXX-XX: ");
        String cpf = input.nextLine();
        Boolean resultado = verificaCPF(cpf);
        if (resultado){
            System.out.println("O CPF digitado é válido.");
        }
        else {
            System.out.println("O CPF digitado não é válido.");
        }
    }
    
}
