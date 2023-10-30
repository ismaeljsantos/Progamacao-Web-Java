package atividadedois;

import java.util.Scanner;

public class AtividadeDois {

    public static void main(String[] args) {
        // TODO:Faça um algoritmo que receba o nome e a idade de uma pessoa e ao final mostre os valores digitados.
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.println("Digite um nome:");
        nome = input.nextLine();
        System.out.println("digite uma idade");
        idade = input.nextInt();
        input.close();
        System.out.println("\n Nome: "+nome+"\n Idadade: "+idade);
        
    }
    
}
