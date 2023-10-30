package atividadesete;
import java.util.Scanner;

public class AtividadeSete {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO:Faça um algoritmo que:
        // Obtenha o valor para a variável HT (horas trabalhadas no mês);
        // Obtenha o valor para a variável VH (valor hora trabalhada):
        // Obtenha o valor para a variável PD (percentual de desconto);
        // Calcule o salário bruto =&gt; SB = HT * VH;
        // Calcule o total de desconto =&gt; TD = (PD/100)*SB;
        // Calcule o salário líquido =&gt; SL = SB – TD;
        // Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, Salário
        // Liquido.
        double horaTrabalhada, valorHora, percentualDesconto, salarioBruto, totalDesconto, salarioLiquido;
        
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        horaTrabalhada = input.nextDouble();
        
        System.out.println("Digite o valor da hora trabalhada: ");
        valorHora = input.nextDouble();
        
        System.out.println("Digite o percentual de desconto: ");
        percentualDesconto = input.nextDouble();
        
        salarioBruto = horaTrabalhada * valorHora;
        totalDesconto = (percentualDesconto / 100) * salarioBruto;
        
        salarioLiquido = salarioBruto - totalDesconto;
        
        System.out.println("Horas trabalhadas: " + horaTrabalhada);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto: " + totalDesconto);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
    
}
