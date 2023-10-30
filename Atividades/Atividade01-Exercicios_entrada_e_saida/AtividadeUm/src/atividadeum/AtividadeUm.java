package atividadeum;

import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {
        // TODO: Faça um algoritmo que receba dois números inteiros e mostre a subtração entre eles.
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.println("Algoritimo de subtração");
        System.out.println("Digite o primeiro numero");
        n1 = input.nextInt();
        System.out.println("Digite o Segundo numero");
        n2 = input.nextInt();
        //fechar o objeto
        input.close();
        System.out.println(n1+" - "+n2+" = "+(n1-n2));
    }
    
}
