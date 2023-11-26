package atividaderepeticaovetor;

import java.util.Scanner;
public class AtividadeRepeticaoVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Escolha a atividade (1-17, 0 para sair): ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    atividade1();
                    break;
                case 2:
                    atividade2();
                    break;
                case 3:
                    atividade3();
                    break;
                case 4:
                    atividade4();
                    break;
                case 5:
                    atividade5();
                    break;
                case 6:
                    atividade6();
                    break;
                case 7:
                    atividade7();
                    break;
                case 8:
                    atividade8();
                    break;
                case 9:
                    atividade9();
                    break;
                case 10:
                    atividade10();
                    break;
                case 11:
                    atividade11();
                    break;
                case 12:
                    atividade12();
                    break;
                case 13:
                    atividade13();
                    break;
                case 14:
                    atividade14();
                    break;
                case 15:
                    atividade15();
                    break;
                case 16:
                    atividade16();
                    break;
                case 17:
                    atividade17();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 0);
    }

    public static void atividade1() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Eu gosto de estudar Algoritmos!");
        }
    }

    public static void atividade2() {
        int soma = 0;
        for (int i = 1; i <= 15; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 a 15 é: " + soma);
    }

    public static void atividade3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
    }

    public static void atividade4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite um número N: ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(nome);
        }
    }

    public static void atividade5() {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            soma += scanner.nextInt();
        }

        System.out.println("A soma dos 10 números é: " + soma);
    }

    public static void atividade6() {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            somaIdades += scanner.nextInt();
        }

        System.out.println("A soma das idades é: " + somaIdades);
    }

    public static void atividade7() {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            somaIdades += scanner.nextInt();
        }

        double media = (double) somaIdades / 20;
        System.out.println("A média das idades é: " + media);
    }

    public static void atividade8() {
        Scanner scanner = new Scanner(System.in);
        int maioresDeIdade = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            if (idade >= 18) {
                maioresDeIdade++;
            }
        }

        System.out.println("O número de pessoas maiores de idade é: " + maioresDeIdade);
    }

    public static void atividade9() {
        Scanner scanner = new Scanner(System.in);
        String pessoaMaisNova = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.next();
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                pessoaMaisNova = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + pessoaMaisNova);
    }

    public static void atividade10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para a tabuada: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void atividade11() {
        Scanner scanner = new Scanner(System.in);
        int maioresQue8 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero > 8) {
                maioresQue8++;
            }
        }

        System.out.println("O número de números maiores que 8 é: " + maioresQue8);
    }

    public static void atividade12() {
        Scanner scanner = new Scanner(System.in);
        int numerosPares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                numerosPares++;
            }
        }

        System.out.println("O número de números pares é: " + numerosPares);
    }

    public static void atividade13() {
        Scanner scanner = new Scanner(System.in);
        int numerosEntre0e100 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 100) {
                numerosEntre0e100++;
            }
        }

        System.out.println("O número de números entre 0 e 100 é: " + numerosEntre0e100);
    }

    public static void atividade14() {
        Scanner scanner = new Scanner(System.in);
        int numerosEntre0e100 = 0;
        int numerosEntre101e200 = 0;
        int numerosMaioresQue200 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 100) {
                numerosEntre0e100++;
            } else if (numero >= 101 && numero <= 200) {
                numerosEntre101e200++;
            } else {
                numerosMaioresQue200++;
            }
        }

        System.out.println("Números entre 0 e 100: " + numerosEntre0e100);
        System.out.println("Números entre 101 e 200: " + numerosEntre101e200);
        System.out.println("Números maiores que 200: " + numerosMaioresQue200);
    }

    public static void atividade15() {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        do {
            System.out.println("Digite um número (digite um número negativo para encerrar): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println("A soma dos números é: " + soma);
    }

    public static void atividade16() {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];

        System.out.println("Digite 20 números: ");
        for (int i = 0; i < 20; i++) {
            vetor[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetor[i];
        }

        System.out.println("A soma dos 10 primeiros elementos é: " + soma);
    }

    public static void atividade17() {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números pares no vetor: ");
        for (int num : vetor) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); 
    }
    
}
