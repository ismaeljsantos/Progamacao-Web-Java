package atividades;

import java.util.Scanner;

public class Atividades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDigite o número da atividade que deseja executar (ou 0 para sair):");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Encerrando o programa. Até mais!");
                break;
            }

            executarAtividade(escolha);
        }
    }

    private static void executarAtividade(int escolha) {
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
            case 18:
                atividade18();
                break;
            case 19:
                atividade19();
                break;
            case 20:
                atividade20();
                break;
            case 21:
                atividade21();
                break;
            case 22:
                atividade22();
                break;
            case 23:
                atividade23();
                break;
            case 24:
                atividade24();
                break;
            case 25:
                atividade25();
                break;
            case 26:
                atividade26();
                break;
            case 27:
                atividade27();
                break;
            case 28:
                atividade28();
                break;
            case 29:
                atividade29();
                break;
            case 30:
                atividade30();
                break;
            default:
                System.out.println("Atividade não encontrada. Tente novamente.");
        }
    }

    private static void atividade1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números A e B:");
        double numA = scanner.nextDouble();
        double numB = scanner.nextDouble();
        System.out.println("O maior número é: " + encontrarMaiorNumero(numA, numB));
    }

    private static double encontrarMaiorNumero(double num1, double num2) {
        return Math.max(num1, num2);
    }

    private static void atividade2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número N:");
        int numN = scanner.nextInt();
        verificarCondicaoF(numN);
    }

    private static void verificarCondicaoF(int numN) {
        if (numN <= 10) {
            System.out.println("F1");
        } else if (numN <= 100) {
            System.out.println("F2");
        } else {
            System.out.println("F3");
        }
    }

    private static void atividade3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as notas nas três provas:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        System.out.println("A média final do aluno é: " + calcularMediaFinal(nota1, nota2, nota3));
    }

    private static double calcularMediaFinal(double nota1, double nota2, double nota3) {
        return (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
    }

    private static void atividade4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário bruto:");
        double salarioBruto = scanner.nextDouble();
        System.out.println("O salário líquido é: " + calcularSalarioLiquido(salarioBruto));
    }

    private static double calcularSalarioLiquido(double salarioBruto) {
        double descontoPrevidencia = salarioBruto * 0.1;
        double salarioAposPrevidencia = salarioBruto - descontoPrevidencia;
        double descontoImposto = salarioAposPrevidencia * 0.05;
        return salarioAposPrevidencia - descontoImposto;
    }

    private static void atividade5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do candidato:");
        String nomeCandidato = scanner.next();
        System.out.println("Digite as notas nas três provas (Português, Matemática, Conhecimentos Gerais):");
        double notaPortugues = scanner.nextDouble();
        double notaMatematica = scanner.nextDouble();
        double notaConhecimentosGerais = scanner.nextDouble();
        exibirInformacoesCandidato(nomeCandidato, notaPortugues, notaMatematica, notaConhecimentosGerais);
    }

    private static void exibirInformacoesCandidato(String nome, double notaPortugues, double notaMatematica, double notaConhecimentosGerais) {
        System.out.println("Nome do candidato: " + nome);
        System.out.println("Notas:");
        System.out.println("Português: " + notaPortugues);
        System.out.println("Matemática: " + notaMatematica);
        System.out.println("Conhecimentos Gerais: " + notaConhecimentosGerais);

        double media = (notaPortugues + notaMatematica + notaConhecimentosGerais) / 3;
        System.out.println("Média do candidato: " + media);

        if (media > 7.0 && notaPortugues >= 5.0 && notaMatematica >= 5.0 && notaConhecimentosGerais >= 5.0) {
            System.out.println("Candidato aprovado!");
        } else {
            System.out.println("Candidato reprovado.");
        }
    }

    private static void atividade6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois valores inteiros (A e B):");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        System.out.println("O resultado do quadrado da soma dos valores lidos é: " + calcularQuadradoDaSoma(numA, numB));
    }

    private static int calcularQuadradoDaSoma(int valorA, int valorB) {
        int soma = valorA + valorB;
        return soma * soma;
    }

    private static void atividade7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois valores inteiros (A e B):");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        System.out.println("O resultado da soma do quadrado de cada valor lido é: " + calcularSomaDosQuadrados(numA, numB));
    }

    private static int calcularSomaDosQuadrados(int valorA, int valorB) {
        return (valorA * valorA) + (valorB * valorB);
    }

    private static void atividade8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores A, B e C:");
        double numA = scanner.nextDouble();
        double numB = scanner.nextDouble();
        double numC = scanner.nextDouble();
        verificarSomaAB(numA, numB, numC);
    }

    private static void verificarSomaAB(double valorA, double valorB, double valorC) {
        double somaAB = valorA + valorB;
        if (somaAB < valorC) {
            System.out.println("A soma de A e B é menor que C.");
        } else if (somaAB > valorC) {
            System.out.println("A soma de A e B é maior que C.");
        } else {
            System.out.println("A soma de A e B é igual a C.");
        }
    }

    private static void atividade9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores das vendas dos corretores:");
        double vendaCorretor1 = scanner.nextDouble();
        double vendaCorretor2 = scanner.nextDouble();
        double vendaCorretor3 = scanner.nextDouble();
        gerarRelatorioVendas(vendaCorretor1, vendaCorretor2, vendaCorretor3);
    }

    private static void gerarRelatorioVendas(double vendaCorretor1, double vendaCorretor2, double vendaCorretor3) {
        double totalVendas = vendaCorretor1 + vendaCorretor2 + vendaCorretor3;
        System.out.println("Relatório de Vendas:");
        System.out.println("Corretor 1 - Venda: " + vendaCorretor1 + ", Comissão: " + calcularComissao(vendaCorretor1));
        System.out.println("Corretor 2 - Venda: " + vendaCorretor2 + ", Comissão: " + calcularComissao(vendaCorretor2));
        System.out.println("Corretor 3 - Venda: " + vendaCorretor3 + ", Comissão: " + calcularComissao(vendaCorretor3));
        System.out.println("Total de Vendas da Empresa: " + totalVendas);
    }

    private static double calcularComissao(double venda) {
        if (venda > 50000.0) {
            return venda * 0.12;
        } else if (venda >= 30000.0) {
            return venda * 0.095;
        } else {
            return venda * 0.07;
        }
    }

    private static void atividade10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.next();
        System.out.println("Digite a quantidade de peças de cada tipo (Parafusos, Porcas, Arruelas):");
        int qtdParafusos = scanner.nextInt();
        int qtdPorcas = scanner.nextInt();
        int qtdArruelas = scanner.nextInt();
        calcularValorTotalCompra(nomeCliente, qtdParafusos, qtdPorcas, qtdArruelas);
    }

    private static void calcularValorTotalCompra(String nomeCliente, int qtdParafusos, int qtdPorcas, int qtdArruelas) {
        double precoParafuso = 1.0;  // Preço unitário do parafuso
        double precoPorca = 1.1;     // Preço unitário da porca
        double precoArruela = 0.9;   // Preço unitário da arruela

        double descontoParafusos = qtdParafusos * precoParafuso * 0.2;
        double descontoPorcas = qtdPorcas * precoPorca * 0.1;
        double descontoArruelas = qtdArruelas * precoArruela * 0.3;

        double totalDesconto = descontoParafusos + descontoPorcas + descontoArruelas;
        double valorTotalCompra = (qtdParafusos * precoParafuso) + (qtdPorcas * precoPorca) + (qtdArruelas * precoArruela) - totalDesconto;

        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Quantidade de Peças:");
        System.out.println("Parafusos: " + qtdParafusos);
        System.out.println("Porcas: " + qtdPorcas);
        System.out.println("Arruelas: " + qtdArruelas);
        System.out.println("Total de Desconto: " + totalDesconto);
        System.out.println("Total a Pagar: " + valorTotalCompra);
    }
    
    private static void atividade11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de carros vendidos:");
        int numeroCarros = scanner.nextInt();
        System.out.println("Digite o valor total das vendas:");
        double valorVendas = scanner.nextDouble();
        System.out.println("O salário total do vendedor é: " + calcularSalarioVendedor(numeroCarros, valorVendas));
    }

    private static double calcularSalarioVendedor(int numeroCarros, double valorVendas) {
        double salarioFixo = 2 * SalarioMinimo.SALARIO_MINIMO; // Dois salários mínimos fixos
        double comissaoFixa = 50.0; // Comissão fixa por carro vendido
        double comissaoPercentual = 0.05; // 5% do valor das vendas

        return salarioFixo + (comissaoFixa * numeroCarros) + (comissaoPercentual * valorVendas);
    }

    private static class SalarioMinimo {
        static final double SALARIO_MINIMO = 1320.0; // Valor do salário mínimo (exemplo)
    }

    private static void atividade12() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite o nome do artigo " + i + ":");
            String nomeArtigo = scanner.next();
            System.out.println("Digite o preço do artigo " + i + ":");
            double precoArtigo = scanner.nextDouble();
            System.out.println("Digite o percentual de desconto do artigo " + i + ":");
            double percentualDesconto = scanner.nextDouble();

            imprimirDetalhesArtigo(nomeArtigo, precoArtigo, percentualDesconto);
        }
    }

    private static void imprimirDetalhesArtigo(String nome, double preco, double percentualDesconto) {
        double precoComDesconto = preco - (preco * percentualDesconto / 100);

        System.out.println("Detalhes do artigo:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço original: " + preco);
        System.out.println("Preço com desconto: " + precoComDesconto);
    }

    private static void atividade13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta bancária:");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o saldo da conta:");
        double saldoConta = scanner.nextDouble();
        System.out.println("Digite o tipo de operação (depósito ou retirada):");
        String tipoOperacao = scanner.next();
        System.out.println("Digite o valor da operação:");
        double valorOperacao = scanner.nextDouble();

        double novoSaldo = realizarOperacaoBancaria(saldoConta, tipoOperacao, valorOperacao);

        System.out.println("Novo saldo da conta: " + novoSaldo);
    }

    private static double realizarOperacaoBancaria(double saldo, String tipoOperacao, double valor) {
        if (tipoOperacao.equalsIgnoreCase("depósito")) {
            return saldo + valor;
        } else if (tipoOperacao.equalsIgnoreCase("retirada")) {
            double novoSaldo = saldo - valor;
            if (novoSaldo < 0) {
                System.out.println("Conta estourada!");
            }
            return novoSaldo;
        } else {
            System.out.println("Operação inválida. Tente novamente.");
            return saldo;
        }
    }

    private static void atividade14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inteiro:");
        int valor = scanner.nextInt();

        imprimirQuadradoCubo(valor);
    }

    private static void imprimirQuadradoCubo(int valor) {
        int quadrado = valor * valor;
        int cubo = valor * valor * valor;

        System.out.println("Quadrado de " + valor + ": " + quadrado);
        System.out.println("Cubo de " + valor + ": " + cubo);
    }

    private static void atividade15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.next();
        System.out.println("Digite o número de diárias:");
        int numeroDiarias = scanner.nextInt();

        double totalConta = calcularTotalContaHotel(numeroDiarias);
        System.out.println("Total da conta para " + nomeCliente + ": R$ " + totalConta);
    }

    private static double calcularTotalContaHotel(int numeroDiarias) {
        double diaria = 60.0; // Valor da diária
        double taxaServicos;

        if (numeroDiarias > 15) {
            taxaServicos = 5.5;
        } else if (numeroDiarias == 15) {
            taxaServicos = 6.0;
        } else {
            taxaServicos = 8.0;
        }

        return (diaria * numeroDiarias) + taxaServicos;
    }

    private static void atividade16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números inteiros:");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        calcularQuocienteResto(int1, int2);
    }

    private static void calcularQuocienteResto(int int1, int int2) {
        int quociente = int1 / int2;
        int resto = int1 % int2;

        System.out.println("Quociente da divisão: " + quociente);
        System.out.println("Resto da divisão: " + resto);
    }

    private static void atividade17() {
        int qtdTipo1 = 100; // Exemplo: quantidade vendida do tipo 1
        int qtdTipo2 = 150; // Exemplo: quantidade vendida do tipo 2
        int qtdTipo3 = 200; // Exemplo: quantidade vendida do tipo 3

        double precoTipo1 = 0.5; // Preço do picolé tipo 1
        double precoTipo2 = 0.6; // Preço do picolé tipo 2
        double precoTipo3 = 0.75; // Preço do picolé tipo 3

        double totalArrecadadoTipo1 = qtdTipo1 * precoTipo1;
        double totalArrecadadoTipo2 = qtdTipo2 * precoTipo2;
        double totalArrecadadoTipo3 = qtdTipo3 * precoTipo3;

        System.out.println("Picolé Tipo 1 - Quantidade vendida: " + qtdTipo1 + ", Total arrecadado: R$ " + totalArrecadadoTipo1);
        System.out.println("Picolé Tipo 2 - Quantidade vendida: " + qtdTipo2 + ", Total arrecadado: R$ " + totalArrecadadoTipo2);
        System.out.println("Picolé Tipo 3 - Quantidade vendida: " + qtdTipo3 + ", Total arrecadado: R$ " + totalArrecadadoTipo3);
    }

    private static void atividade18() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três números inteiros distintos:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int menor = encontrarMenor(num1, num2, num3);
        System.out.println("O menor número é: " + menor);
    }

    private static int encontrarMenor(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    private static void atividade19() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três valores distintos:");
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();

        imprimirEmOrdemCrescente(valor1, valor2, valor3);
    }

    private static void imprimirEmOrdemCrescente(int valor1, int valor2, int valor3) {
        int menor, meio, maior;

        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
            if (valor2 < valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
            if (valor1 < valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 < valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }

        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);
    }

    private static void atividade20() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota do aluno:");
        int nota = scanner.nextInt();

        determinarConceitoNota(nota);
    }

    private static void determinarConceitoNota(int nota) {
        System.out.println("Nota do aluno: " + nota);

        if (nota >= 0 && nota <= 49) {
            System.out.println("Conceito: Insuficiente");
        } else if (nota <= 64) {
            System.out.println("Conceito: Regular");
        } else if (nota <= 84) {
            System.out.println("Conceito: Bom");
        } else if (nota <= 100) {
            System.out.println("Conceito: Ótimo");
        } else {
            System.out.println("Nota inválida. Tente novamente.");
        }
    }
    private static void atividade21() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        mostrarMaiorNumero(num1, num2);
    }

    private static void mostrarMaiorNumero(double num1, double num2) {
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os números são iguais.");
        }
    }

    private static void atividade22() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do empregado:");
        String nomeEmpregado = scanner.next();
        System.out.println("Digite a categoria do empregado:");
        String categoria = scanner.next();
        System.out.println("Digite o salário do empregado:");
        double salario = scanner.nextDouble();

        double salarioReajustado = calcularAumentoSalario(categoria, salario);

        System.out.println("Nome: " + nomeEmpregado);
        System.out.println("Categoria: " + categoria);
        System.out.println("Salário reajustado: " + salarioReajustado);
    }

    private static double calcularAumentoSalario(String categoria, double salario) {
        double percentualAumento = 0.0;

        switch (categoria.toUpperCase()) {
            case "A":
            case "C":
            case "F":
            case "H":
                percentualAumento = 0.10;
                break;
            case "B":
            case "D":
            case "E":
            case "I":
            case "J":
            case "T":
                percentualAumento = 0.15;
                break;
            case "K":
            case "R":
                percentualAumento = 0.25;
                break;
            case "L":
            case "M":
            case "N":
            case "O":
            case "P":
            case "Q":
            case "S":
                percentualAumento = 0.35;
                break;
            case "U":
            case "V":
            case "X":
            case "Y":
            case "W":
            case "Z":
                percentualAumento = 0.50;
                break;
            default:
                System.out.println("Categoria inválida. Sem aumento.");
        }

        return salario * (1 + percentualAumento);
    }

    private static void atividade23() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as três notas do aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        calcularMediaAprovacao(nota1, nota2, nota3);
    }

    private static void calcularMediaAprovacao(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média do aluno: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 4) {
            System.out.println("Em prova final");
        } else {
            System.out.println("Reprovado");
        }
    }

    private static void atividade24() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        verificarParImparPositivoNegativo(numero);
    }

    private static void verificarParImparPositivoNegativo(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }

    private static void atividade25() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do item pedido:");
        int codigoItem = scanner.nextInt();
        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();

        calcularValorLanche(codigoItem, quantidade);
    }

    private static void calcularValorLanche(int codigoItem, int quantidade) {
        double precoUnitario = 0.0;

        switch (codigoItem) {
            case 100:
                precoUnitario = 1.10;
                break;
            case 101:
                precoUnitario = 1.30;
                break;
            case 102:
                precoUnitario = 1.50;
                break;
            case 103:
                precoUnitario = 1.10;
                break;
            case 104:
                precoUnitario = 1.30;
                break;
            case 105:
                precoUnitario = 1.00;
                break;
            default:
                System.out.println("Código inválido. Nenhum lanche calculado.");
                return;
        }

        double valorTotal = precoUnitario * quantidade;
        System.out.println("Valor total do lanche: R$ " + valorTotal);
    }

    private static void atividade26() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as três notas do aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        System.out.println("Escolha o tipo de média:");
        System.out.println("1 - Aritmética");
        System.out.println("2 - Ponderada (pesos 3, 3, 4)");
        int opcao = scanner.nextInt();

        calcularMediaAluno(nota1, nota2, nota3, opcao);
    }

    private static void calcularMediaAluno(double nota1, double nota2, double nota3, int opcao) {
        double media;

        if (opcao == 1) {
            media = (nota1 + nota2 + nota3) / 3;
        } else if (opcao == 2) {
            media = (nota1 * 3 + nota2 * 3 + nota3 * 4) / 10;
        } else {
            System.out.println("Opção inválida. Nenhuma média calculada.");
            return;
        }

        System.out.println("Média do aluno: " + media);
    }

    private static void atividade27() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        double descontoPrevidenciario = calcularDescontoPrevidenciario(salario);
        System.out.println("Desconto previdenciário: R$ " + descontoPrevidenciario);
    }

    private static double calcularDescontoPrevidenciario(double salario) {
        double percentualDesconto = 0.11;
        double valorMaximoDesconto = 318.20;

        double desconto = salario * percentualDesconto;

        return Math.min(desconto, valorMaximoDesconto);
    }

    private static void atividade28() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o saldo médio do cliente:");
        double saldoMedio = scanner.nextDouble();

        calcularCreditoEspecial(saldoMedio);
    }

    private static void calcularCreditoEspecial(double saldoMedio) {
        double percentualCredito = 0.0;

        if (saldoMedio > 0 && saldoMedio <= 200) {
            percentualCredito = 0.0;
        } else if (saldoMedio <= 400) {
            percentualCredito = 0.20;
        } else if (saldoMedio <= 600) {
            percentualCredito = 0.30;
        } else {
            percentualCredito = 0.40;
        }

        double valorCredito = saldoMedio * percentualCredito;
        System.out.println("Saldo médio: R$ " + saldoMedio);
        System.out.println("Valor do crédito: R$ " + valorCredito);
    }

    private static void atividade29() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do produto:");
        int codigoProduto = scanner.nextInt();
        System.out.println("Digite a quantidade comprada:");
        int quantidade = scanner.nextInt();

        calcularPrecoTotal(codigoProduto, quantidade);
    }

    private static void calcularPrecoTotal(int codigoProduto, int quantidade) {
        double precoUnitario = 0.0;

        switch (codigoProduto) {
            case 1001:
                precoUnitario = 5.32;
                break;
            case 1324:
                precoUnitario = 6.45;
                break;
            case 6548:
                precoUnitario = 2.37;
                break;
            case 987:
                precoUnitario = 5.32;
                break;
            case 7623:
                precoUnitario = 6.45;
                break;
            default:
                System.out.println("Código de produto inválido. Nenhum preço calculado.");
                return;
        }

        double precoTotal = precoUnitario * quantidade;
        System.out.println("Preço total do produto: R$ " + precoTotal);
    }

    private static void atividade30() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do atleta:");
        String nomeAtleta = scanner.next();
        System.out.println("Digite a idade do atleta:");
        int idadeAtleta = scanner.nextInt();

        determinarCategoriaAtleta(nomeAtleta, idadeAtleta);
    }

    private static void determinarCategoriaAtleta(String nomeAtleta, int idadeAtleta) {
        String categoria = "";

        if (idadeAtleta >= 5 && idadeAtleta <= 10) {
            categoria = "Infantil";
        } else if (idadeAtleta >= 11 && idadeAtleta <= 15) {
            categoria = "Juvenil";
        } else if (idadeAtleta >= 16 && idadeAtleta <= 20) {
            categoria = "Junior";
        } else if (idadeAtleta >= 21 && idadeAtleta <= 25) {
            categoria = "Profissional";
        }

        System.out.println("Nome do atleta: " + nomeAtleta);
        System.out.println("Categoria: " + categoria);
    }
}


