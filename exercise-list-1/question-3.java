import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = scanner.nextInt();
        
        if (n1 % 2 == 1) {
            System.out.println("Impar");
            return;
        }
        
        System.out.println("Par");
    }
}
