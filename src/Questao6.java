import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("______________________");
            System.out.println("Número: " + i);
            isPerfect(i);
            if (i%2 == 0) {
                System.out.println("Multiplo de 2");
            }
            if (i%3 == 0) {
                System.out.println("Multiplo de 3");
            }
            isPrimo(i);
        }
    }

    private static void isPerfect(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("Número perfeito");
        }
    }

    private static void isPrimo(int num){
        if (num == 2) {
            System.out.println("Número primo");
            return;
        } else if (num > 1) {
            for(int i = 2; i < num; i++){
                if (num % i == 0) {
                    return;
                }
            }
            System.out.println("Número primo");
        }
    }
}


