package atividadedez;

import java.util.Scanner;

public class AtividadeDez {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo,
        //utilizando a fórmula VOLUME = 3,14159 * (RAIO²) * ALTURA.;
        double volume, raio, altura;
        final double pi = 3.14159;
        
        System.out.println("Digite o valor do raio do cilindro");
        raio = input.nextDouble();
        
        System.out.println("Digite o valor do altura do cilindro");
        altura = input.nextDouble();
        
        volume = pi *(raio * raio) * altura;
        System.out.println("O volume do cilindro (lata de óleo) é: " + volume);
    }
    
}
