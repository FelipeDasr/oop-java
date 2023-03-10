import java.util.Scanner;

public class Exercicio2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        
        double media = (n1 + n2) / 2;
        
        if (media >= 6) {
            System.out.println("Aprovado");
            return;
        }
        
        System.out.println("Reprovado");
    }
}
