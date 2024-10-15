
import java.util.Scanner;

public class Vezba8 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Unesi prvi sabirak");
            int prviSabirak = scanner.nextInt();
            System.out.println("Unesi drugi sabirak");
            int drugiSabirak = scanner.nextInt();
            
            System.out.println("Rezultat je " + (prviSabirak + drugiSabirak));
        }
    }
}
