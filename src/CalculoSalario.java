import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=============== Calculadora de salário ===============");

        System.out.println("Digite o valor do salário bruto do funcionário 1: ");
        double salario1 = scan.nextDouble();

        System.out.println("Digite o valor do salário bruto do funcionário 2: ");
        double salario2 = scan.nextDouble();

        System.out.println("Digite o valor do salário bruto do funcionário 3: ");
        double salario3 = scan.nextDouble();

        System.out.println("Digite o valor do salário bruto do funcionário 4: ");
        double salario4 = scan.nextDouble();

        System.out.println("Digite o valor do salário bruto do funcionário 5: ");
        double salario5 = scan.nextDouble();

        System.out.printf("O salário líquido do funcionário 1 é R$ %.2f foram descontados R$ %.2f de INSS e R$ %.2f de IR do valor de R$ %.2f \n", calcularDescontos(salario1), descontarInss(salario1), descontarIr(salario1), salario1);
        System.out.printf("O salário líquido do funcionário 2 é R$ %.2f foram descontados R$ %.2f de INSS e R$ %.2f de IR do valor de R$ %.2f \n", calcularDescontos(salario2), descontarInss(salario2), descontarIr(salario2), salario2);
        System.out.printf("O salário líquido do funcionário 3 é R$ %.2f foram descontados R$ %.2f de INSS e R$ %.2f de IR do valor de R$ %.2f \n", calcularDescontos(salario3), descontarInss(salario3), descontarIr(salario3), salario3);
        System.out.printf("O salário líquido do funcionário 4 é R$ %.2f foram descontados R$ %.2f de INSS e R$ %.2f de IR do valor de R$ %.2f \n", calcularDescontos(salario4), descontarInss(salario4), descontarIr(salario4), salario4);
        System.out.printf("O salário líquido do funcionário 5 é R$ %.2f foram descontados R$ %.2f de INSS e R$ %.2f de IR do valor de R$ %.2f \n", calcularDescontos(salario5), descontarInss(salario5), descontarIr(salario5), salario5);

        scan.close();
    }

    public static double descontarInss(double salario) {
        double desconto = 0;

        if (salario <= 1212) {
            desconto = salario * 0.075;
        } else if (salario <= 2427.35) {
            desconto = salario * 0.09;
        } else if (salario <= 3641.03) {
            desconto = salario * 0.12;
        } else if (salario <= 7087.22) {
            desconto = salario * 0.14;
        } else {
            desconto = salario * 0.14;
        }

        return desconto;

    }

    public static double descontarIr(double salario) {
        double descontoIr = 0;

        if (salario <= 1903.98) {
            descontoIr = 0;
        } else if (salario <= 2826.65) {
            descontoIr = salario * 0.075;
        } else if (salario <= 3751.05) {
            descontoIr = salario * 0.15;
        } else if (salario <= 4664.68) {
            descontoIr = salario * 0.225;
        } else {
            descontoIr = salario * 0.275;
        }

        return descontoIr;
    }

    public static double calcularDescontos(double salario) {
        double salarioLiquido = 0;
        double inss = descontarInss(salario);
        double ir = descontarIr(salario);

        salarioLiquido = salario - inss - ir;

        return salarioLiquido;
    }

}
