import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int total = 0;
        int index = 0;
        
        while (true) {
            index++;
            int resultado = numero * index;
            
            if (resultado <= 1000 && resultado >= 1) {
                total += resultado;
                continue;
            }
            break;
        }
        
        System.out.println(total);
    }
}
