import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas horas foram trabalhados no dia? ");
        int hours = sc.nextInt();

        System.out.print("Quantos dias foram trabalhados? ");
        int days = sc.nextInt();

        System.out.print("Qual o valor/hora? ");
        double value = sc.nextDouble();

        double grossSalary = (days*hours*value);
        double netSalary = (grossSalary*0.79);

        System.out.println("Seu salário bruto é de: R$" + String.format("%.2f", grossSalary));
        System.out.println("Com o desconto de 21%");
        System.out.println("Seu salário líquido é de: R$" + String.format("%.2f", netSalary));

        sc.close();
    }
}
