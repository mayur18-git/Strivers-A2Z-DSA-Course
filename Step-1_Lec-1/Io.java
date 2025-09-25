import java.util.Scanner;

public class Io {
    public static void printNumber() {
        // Use try-with-resources to automatically close Scanner
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();   // take input
            System.out.print(n);    // print output
        }
    }

    public static void main(String[] args) {
        printNumber();
    }
}
