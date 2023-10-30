package atividadecinco;

import java.util.Scanner;
public class AtividadeCinco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO:Faça um algoritmo para calcular a área de uma circunferência, considerando a fórmula
        //ÁREA = π * RAIO² . Utilize as variáveis AREA e RAIO, a constante π (pi = 3,14159) e os
        //operadores aritméticos de multiplicação.
        final double pi = 3.14159;
        double raio, raio2;
        
        System.out.println("Digite o valor do raio da circunferência:");
        raio = input.nextDouble();
        raio2 = pi * (raio * raio);
        System.out.println("A área da circunferência: "+raio2);
        
        double area = pi * Math.pow(raio, 2);
        System.out.println("A área da circunferência com raio " + raio + " é " + area);

    }
    
}
