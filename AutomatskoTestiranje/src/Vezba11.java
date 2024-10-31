
import java.util.Scanner;

public class Vezba11 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("unesi Operator");
            String operator = scanner.nextLine();

            System.out.println("unesi Operand1");
            Double operand1 = scanner.nextDouble();

            System.out.println("unesi Operand2");
            Double operand2 = scanner.nextDouble();

            if (operator.equals("+")) {
                System.out.println("Operacija sabiranja: " + (operand1 + operand2));
            } else if (operator.equals("-")) {
                System.out.println("Operacija oduzimanja: " + (operand1 - operand2));
            }

            // switch (operator) {
            //     case "+":
            //         System.out.println("Operacija sabiranja: " + (operand1 + operand2));
            //         break;
            //     case "-":
            //         System.out.println("Operacija oduzimanja: " + (operand1 - operand2));
            //         break;
            //     default:
            //         System.out.println("Neispravan operator, dozvoljeni operatori (+, -, /, *, %)");
            // }
        }
    }

    // Dodaj operatore * i /
    // Ispisi operaciju npr. Operacija oduzimanja: 34 - 3 = 31.0
}
