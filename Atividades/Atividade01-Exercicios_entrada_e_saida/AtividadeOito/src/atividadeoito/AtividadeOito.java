package atividadeoito;

import java.util.Scanner;
public class AtividadeOito {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: Faça um algoritmo que leia uma temperatura em graus Celsius e apresente-a
        //convertida em graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5, na;
        //qual F é a temperatura em Fahrenheit e C é a temperatura em Celsius.
        double celsius, fahrenheit;
        
        System.out.println("Digite a temperatura em graus Celsius:");
        celsius = input.nextDouble();
        
        fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
        
        
    }
    
}
