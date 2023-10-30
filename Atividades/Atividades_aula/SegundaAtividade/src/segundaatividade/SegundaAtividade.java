package segundaatividade;

/**
 *  Faça u algoritimo que leia dois numeros nas variáveis NumA e NumB, nessa
 *  ordem, e imprima em ordem inversa, isto pe se os dados lidor forem 5 e 9 
 *  devem ser impressos na ordem 9 e 5
 */
import java.util.Scanner;

public class SegundaAtividade {

    public static void main(String[] args) {
        // TODO: Faça u algoritimo que leia dois numeros nas variáveis NumA e NumB
        // nessa ordem
        Scanner input = new Scanner(System.in);
        int NumA, NumB;
        System.out.println("Digite o primeiro numero:");
        NumA = input.nextInt();
        System.out.println("Digite o Segundo numero:");
        NumB = input.nextInt();
        
        //fachando o input(objeto) não tem mais uso
        input.close();
        
        //TODO: imprima em ordem inversa
        System.out.println("numero digitados foram: "+ NumB + " e "+ NumA);
        
    }
    
}
