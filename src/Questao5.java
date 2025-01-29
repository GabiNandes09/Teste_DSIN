import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Character> letras = new ArrayList<>();
        String corresp = "";
       
        String padrao = "";
        List<Integer> brasil = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9); 
        List<Character> mercosul = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J');
        System.out.print("Insira a placa: ");
        String placa = sc.nextLine().toUpperCase();

        if (placa.length() != 7) {
            System.err.println("Formato inválido");
            sc.close();
            return;
        }

        for (int i = 0; i < placa.length(); i++) {
            char letra = placa.charAt(i);
            if (i <= 2) { 
                if (!Character.isLetter(letra)) {
                    System.err.println("Formato inválido");
                    sc.close();
                    return;
                } else {
                    letras.add(letra); 
                }
            } else if (i == 4) { 
                if (Character.isDigit(letra)) {
                    padrao = "Brasil";
                    letras.add(letra);
                } else {
                    padrao = "Mercosul";
                    letras.add(letra);
                }
            } else { 
                if (Character.isDigit(letra)) {
                    letras.add(letra);
                } else {
                    System.err.println("Formato inválido");
                    sc.close();
                    return;
                }
            }
        }
        
        placa = "";
        for (int i = 0; i < letras.size(); i++){
            placa += letras.get(i);
        }

        switch (padrao) {
            case "Brasil":
                int indexBrasil = brasil.indexOf(Integer.parseInt(String.valueOf(letras.get(4))));
                if (indexBrasil != -1) {
                    letras.set(4, mercosul.get(indexBrasil));
                }
                break;

            case "Mercosul":
                int indexMercosul = mercosul.indexOf(letras.get(4));
                if (indexMercosul != -1) {
                    letras.set(4, brasil.get(indexMercosul).toString().charAt(0));
                }
                break;

            default:
                break;
        }

        for (int i = 0; i < letras.size(); i++){
            corresp += letras.get(i);
        }

        // Exibe os resultados
        System.out.println("Para a placa: " + placa);
        System.out.println("Padrão: " + padrao);
        System.out.println("Correspondente: " + corresp);

        sc.close();
    }
}
