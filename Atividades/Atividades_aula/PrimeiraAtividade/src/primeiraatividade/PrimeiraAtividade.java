package primeiraatividade;

import java.util.Scanner;

public class PrimeiraAtividade {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite o primero numero");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = ler.nextInt();
        System.out.println("A soma de: "+ n1 +" + "+ n2 +" = "+(n1+n2));
    }
    
}