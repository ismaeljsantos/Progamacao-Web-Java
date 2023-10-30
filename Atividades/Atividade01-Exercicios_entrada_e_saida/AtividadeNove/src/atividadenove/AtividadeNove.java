package atividadenove;

import java.util.Scanner;

public class AtividadeNove {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: Faça um algoritmo que leia uma temperatura em Fahrenheit e a apresente convertida
        //em graus Celsius. A fórmula de conversão é C = (F - 32) * ( 5 / 9), na qual F é a;
        //temperatura em Fahrenheit e C é a temperatura em Celcius.
        double celsius, fahrenheit;
        
        System.out.println("Digite a temperatura em graus fahrenheit:");
        fahrenheit = input.nextDouble();
        
        celsius = (fahrenheit - 32) * (5.0 / 9.0);
        System.out.println("A temperatura em graus Celsius é: " + celsius);
    }
    
}
