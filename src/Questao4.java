import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira A: ");
        int a = sc.nextInt();

        System.out.println("Insira B: ");
        int b = sc.nextInt();

        System.out.println("Insira C: ");
        int c = sc.nextInt();

        if (a == 0 && b == 0 && c != 1) {
            System.out.println("Solução impossível");
            sc.close();
            return;
        }

        double x = (1.0 - c)/(a + b);

        System.out.println("O valor de x é: " + String.format("%.2f", x));

        sc.close();
    }
}
