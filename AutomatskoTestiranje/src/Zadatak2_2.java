
import java.util.Scanner;

public class Zadatak2_2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("unesi broj");
            int broj = scanner.nextInt();
            boolean paran = broj % 2 == 0;
            System.out.println("Da li je broj " + broj + " paran: " + paran);
        }
    }

}
