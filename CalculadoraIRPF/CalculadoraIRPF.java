
    import java.util.Scanner;

public class CalculadoraIRPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CALCULADORA DE IRPF =====");

        System.out.print("Nome do contribuinte: ");
        String nome = sc.nextLine();

        System.out.print("Salário bruto mensal (R$): ");
        double salario = sc.nextDouble();

        System.out.print("Número de dependentes: ");
        double dependentes = sc.nextDouble();

        System.out.print("Outras deduções (R$): ");
        double outrasDeducoes = sc.nextDouble();

        Contribuinte contrib = new Contribuinte(nome, salario, dependentes, outrasDeducoes);
        contrib.exibirResumo();

        sc.close();
    }
}


