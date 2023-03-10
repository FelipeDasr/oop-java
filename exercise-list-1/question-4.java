import java.util.Scanner;

public class Exercicio4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            double n1 = scanner.nextDouble();
            String op = scanner.next();
            double n2 = scanner.nextDouble();
            
            switch(op) {
                case "x":
                    return;
                
                case "+":
                    System.out.println(n1 + n2);
                    break;
                    
                case "-":
                    System.out.println(n1 - n2);
                    break;
                    
                case "*":
                    System.out.println(n1 * n2);
                    break;
                    
                case "/":
                    System.out.println(n1 / n2);
                    break;
            }
        }
    }
}
