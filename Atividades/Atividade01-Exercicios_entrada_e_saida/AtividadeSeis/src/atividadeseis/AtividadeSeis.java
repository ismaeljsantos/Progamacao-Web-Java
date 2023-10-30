package atividadeseis;
import java.util.Scanner;

public class AtividadeSeis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: Faça um algoritmo que calcule a área de um triângulo, considerando a fórmula AREA =
        //(BASE*ALTURA)/2 .Utilize as variáveis AREA, BASE e ALTURA e os operadores
        //aritméticos de multiplicação e divisão.
        double area, base, altura;
        System.out.println("Digite o valor da base do triângulo:");
        base = input.nextDouble();
        System.out.println("Digite o valor da altura do triângulo:");
        altura = input.nextDouble();
        
        area = (base * altura) / 2;
        System.out.println("A área do triângulo com base " + base + " e altura " + altura + " é " + area);

    }
    
}
