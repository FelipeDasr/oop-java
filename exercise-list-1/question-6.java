import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int interacoes = scanner.nextInt();
        
        for (int i = 0; i < interacoes; i++) {
            int numero = scanner.nextInt();
            double raiz = Math.sqrt(numero);
            
            if (raiz == Math.floor(raiz)) {
                System.out.println(numero);
            }
        }
    }
}
