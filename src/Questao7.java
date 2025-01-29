import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite a parte superior do título: ");
        String parteSuperior = sc.nextLine();

        System.out.print("Digite a parte inferior do título: ");
        String parteInferior = sc.nextLine();

        
        int larguraMaxima = Math.max(parteSuperior.length(), parteInferior.length());

        
        String linhaSuperior = "|".repeat(larguraMaxima + 8); 
        String linhaInferior = "|".repeat(larguraMaxima + 8); 

        // Imprimindo título centralizado
        System.out.println(linhaSuperior);
        System.out.println("| | " + centralizarTexto("", larguraMaxima) + " | |");
        System.out.println("| | " + centralizarTexto(parteSuperior, larguraMaxima) + " | |");
        System.out.println("| | " + centralizarTexto(parteInferior, larguraMaxima) + " | |");
        System.out.println("| | " + centralizarTexto("", larguraMaxima) + " | |");
        System.out.println(linhaInferior);

        sc.close();
    }

    // Método para centralizar o texto dentro de uma largura especificada
    public static String centralizarTexto(String texto, int largura) {
        int espacos = largura - texto.length();
        int espacosEsquerda = espacos / 2;
        int espacosDireita = espacos - espacosEsquerda;

        return " ".repeat(espacosEsquerda) + texto + " ".repeat(espacosDireita);
    }
}
