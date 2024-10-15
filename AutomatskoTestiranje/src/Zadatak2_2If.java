
import java.util.Scanner;

public class Zadatak2_2If {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("unesi broj");
            int broj = scanner.nextInt();
            boolean paran = broj % 2 == 0;
            if (paran) {
                System.out.println("Broj " + broj + " je paran.");
            } else {
                System.out.println("Broj " + broj + " je neparan.");
            }
        }
    }
}
