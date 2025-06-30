
    public class Contribuinte {
    private String nome;
    private double salarioBruto;
    private double dependentes;
    private double outrasDeducoes;

    public Contribuinte(String nome, double salarioBruto, double dependentes, double outrasDeducoes) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.dependentes = dependentes;
        this.outrasDeducoes = outrasDeducoes;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getDeducoesTotais() {
        return (dependentes * 189.59) + outrasDeducoes;
    }

    public double getBaseCalculo() {
        return salarioBruto - getDeducoesTotais();
    }

    public double calcularIRPF() {
        double base = getBaseCalculo();

        if (base <= 2259.20) {
            return 0.0;
        } else if (base <= 2826.65) {
            return (base - 2259.20) * 0.075;
        } else if (base <= 3751.05) {
            return (base - 2826.65) * 0.15 + (2826.65 - 2259.20) * 0.075;
        } else if (base <= 4664.68) {
            return (base - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 2259.20) * 0.075;
        } else {
            return (base - 4664.68) * 0.275 + (4664.68 - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 2259.20) * 0.075;
        }
    }

    public void exibirResumo() {
        System.out.println("\n--- RESUMO DO CÁLCULO ---");
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Deduções: R$ %.2f%n", getDeducoesTotais());
        System.out.printf("Base de Cálculo: R$ %.2f%n", getBaseCalculo());
        System.out.printf("Imposto Devido: R$ %.2f%n", calcularIRPF());
    }
}


