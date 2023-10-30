package atividadetres;

import java.util.Scanner;

public class AtividadeTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: Faça um algoritmo que:
        // Leia o nome;
        // Leia o sobrenome;
        // Junte o nome com o sobrenome;
        // Apresente o nome completo.
        String nome, sobrenome;
        System.out.println("Digite o nome: ");
        nome = input.next();
        System.out.println("Digite o sobrenome: ");
        sobrenome = input.next();
        
         
        System.out.println("olá, "+ nome+" "+sobrenome);
        
    }
    
}
