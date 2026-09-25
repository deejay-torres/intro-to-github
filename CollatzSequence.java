import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("This program will find all the terms of the Collatz sequence.");
            System.out.print("Input the initial value: ");
            int n = scanner.nextInt();

            if (n <= 0 || n % 2 == 0) {
                System.out.println("INVALID OUTPUT");
            } else {
                System.out.print("The Collatz sequence are: ");
                long current = n;
                StringBuilder sequence = new StringBuilder();
                while (current != 1) {
                    sequence.append(current).append(", ");
                    if (current % 2 != 0) {
                        current = 3 * current + 1;
                    } else {
                        current = current / 2;
                    }
                }
                sequence.append(1);
                System.out.println(sequence.toString());
            }

            System.out.println(); 
        }
    }
}