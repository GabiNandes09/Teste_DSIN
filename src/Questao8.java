import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o tamanho N da matriz: ");
        int N = sc.nextInt();
        
        int[][] matriz = new int[N][N];
        
        int inicioLinha = 0, fimLinha = N - 1;
        int inicioColuna = 0, fimColuna = N - 1;
        int num = 1; 
        
        while (inicioLinha <= fimLinha && inicioColuna <= fimColuna) {
            for (int i = inicioColuna; i <= fimColuna; i++) {
                matriz[inicioLinha][i] = num;
                num += 2;  
            }
            inicioLinha++;
            
            for (int i = inicioLinha; i <= fimLinha; i++) {
                matriz[i][fimColuna] = num;
                num += 2;  
            }
            fimColuna--;
            
            if (inicioLinha <= fimLinha) {
                for (int i = fimColuna; i >= inicioColuna; i--) {
                    matriz[fimLinha][i] = num;
                    num += 2;  
                }
                fimLinha--;
            }
            
            if (inicioColuna <= fimColuna) {
                for (int i = fimLinha; i >= inicioLinha; i--) {
                    matriz[i][inicioColuna] = num;
                    num += 2;  
                }
                inicioColuna++;
            }
        }
        
        System.out.println("Matriz em formato de caracol (incremento de 2 em 2):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
