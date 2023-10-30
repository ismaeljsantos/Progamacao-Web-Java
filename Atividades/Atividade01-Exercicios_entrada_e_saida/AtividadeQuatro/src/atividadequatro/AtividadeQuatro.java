package atividadequatro;

import java.util.Scanner;
public class AtividadeQuatro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO:Faça um algoritmo que:
        // Leia um número inteiro;
        // Leia um segundo número inteiro;
        // Efetue a adição dos dois valores;
        // Apresente o valor calculado.
        int n1, n2;
        System.out.println("Algoritimo de adição");
        System.out.println("Digite o primeiro numero");
        n1 = input.nextInt();
        System.out.println("Digite o Segundo numero");
        n2 = input.nextInt();
        //fechar o objeto
        input.close();
        System.out.println(n1+" - "+n2+" = "+(n1-n2));
    }
    
}
