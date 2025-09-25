import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number (1-3): ");
            int n = sc.nextInt();

            switch (n) {
                case 1 -> System.out.println("You entered One");
                case 2 -> System.out.println("You entered Two");
                case 3 -> System.out.println("You entered Three");
                default -> System.out.println("Invalid number");
            }
        }
    }
}
