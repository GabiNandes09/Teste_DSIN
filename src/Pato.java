import java.util.Scanner;

public class Pato {

    boolean nadar = false, andar = true, voar = false;

    public Pato(){}

    public void quack(){
        System.out.println("Quack!");
    }

    public void andar(){
        System.out.println("você está andando.");
        andar = true;
        voar = false;
        nadar = false;
    }

    public void voar(){
        System.out.println("Você está voando.");
        andar = false;
        voar = true;
        nadar = false;
    }

    public void nadar(){
        System.out.println("Você está nadando.");
        andar = false;
        voar = false;
        nadar = true;
    }

    public void pousar(){
        System.out.println("Você pousou");
        andar = true;
        voar = false;
        nadar = false;
    }

    private static int opcoes(Pato pato, Scanner sc){
        int x = 0;
        if(pato.andar){
            System.out.println("[1] VOAR [2] NADAR [3] QUACK [4] SAIR");
            System.out.print("Escolha: ");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    pato.voar();
                    break;
                case 2:
                    pato.nadar();
                    break;
                case 3:
                    pato.quack();
                    break;
                case 4:
                    return-1;
                default:
                
                    break;
            }
            return x;
        } else if(pato.nadar){
            System.out.println("[1] VOAR [2] IR PARA TERRA [3] QUACK [4] SAIR");
            System.out.print("Escolha: ");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    pato.voar();
                    break;
                case 2:
                    pato.andar();
                    break;
                case 3:
                    pato.quack();
                    break;
                case 4:
                    return-1;
                default:
                
                    break;
            }
            return x;
        } else if(pato.voar){
            System.out.println("[1] POUSAR [2] QUACK [3] SAIR");
            System.out.print("Escolha: ");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    pato.pousar();
                    break;
                case 2:
                    pato.quack();
                    break;
                case 3:
                    return-1;
                default:
                
                    break;
            }
            return x;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pato pato = new Pato();
        int x = 0;

        System.out.println("Olá, você é um pato, o que deseja fazer?");

        while(x != -1){
            x = opcoes(pato, sc);
        }
        System.out.println("Obrigado por brincar!");
        sc.close();
    }
    
}
