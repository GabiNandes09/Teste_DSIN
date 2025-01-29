import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 1º número: ");
        int a = sc.nextInt();

        System.out.print("Digite 2º número: ");
        int b = sc.nextInt();
        
        System.out.print("Digite 3º número: ");
        int c = sc.nextInt();

        System.out.print("Digite 4º número: ");
        int d = sc.nextInt();

        if (
            c > 0 &&
            d > 0 &&
            (a % 2 == 0) &&
            b > c &&
            d > a &&
            (c + d > a + b)
        ) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }

        sc.close();
    }
}
