import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        int numero = new Random().nextInt(100);
        int chute = 0;
        int tentativas = 1;
        //System.out.println(numero);
        System.out.println("Qual o seu chute?");
        Scanner leitura = new Scanner(System.in);
        
        while ( tentativas < 5) {
        System.out.println("tentativa " + tentativas + " de 5.");
        System.out.print("Chute: ");
        chute = leitura.nextInt();
        
            if ( chute == numero) {
                System.out.println("Acertou!");
                break;
            } else if (chute < numero) {
                System.out.println("Maior!");
            } else {
                System.out.println("Menor!");
            }
            tentativas++;
        }
        leitura.close();        
    }
}
