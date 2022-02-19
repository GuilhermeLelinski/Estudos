package lista9exercicio5;
import java.util.Scanner;

public class Lista9Exercicio5 {

    public static double fahrenheitToCelsius(double F){
        return (F - 32) * 5 / 9.0; 
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double far=0, cel=0;
        System.out.print("Digite a temperatura em Fahrenheit: ");
        far = Double.valueOf(input.nextLine());
        cel = fahrenheitToCelsius(far);
        System.out.println("Temperatura em Celsius: "+cel);
    }
    
}
