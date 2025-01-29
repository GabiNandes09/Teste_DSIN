import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Descrição: ");
        String description = sc.nextLine();

        System.out.print("Quantidade: ");
        int qtd = sc.nextInt();

        System.out.print("Valor: R$");
        double value = sc.nextDouble();

        double grossTotal = (qtd * value);
        double desc = 0.0;
        if (grossTotal <= 5) {
            desc = 5.5;
        }
        if (grossTotal > 5 && grossTotal <= 10) {
            desc = 8.0;
        }
        if (grossTotal > 10) {
            desc = 12.0;
        }

        double descValue = grossTotal *(desc/100);
        double netTotal = grossTotal - descValue;

        System.out.println("_____________________________________________________________");
        System.out.println("Valor total: R$" + String.format("%.2f", grossTotal));
        System.out.println("Desconto total: R$" + String.format("%.2f", descValue) + " (" + desc +"%)");
        System.out.println("Total a pagar: R$" + String.format("%.2f", netTotal));

        sc.close();
    }
}
