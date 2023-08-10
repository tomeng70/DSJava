import java.util.Scanner;

public class IsItPrime {
    

    /*
     * Determines if a number is prime.
     * Returns true if prime, false otherwise.
     * Requires that i is > 0.
     */
    public static boolean isPrime(int i) {
        if (i < 1) {
            // let's only consider positive integers.
            return false;
        }
        
        if (i == 1) {
            // the number 1 cannot be prime.
            // a prime number must have two factors (itself and the number 1).
            // the number 1 only has one factor (the number 1 itself).
            return false;
        }

        // i must be greater than 1.
        for (int n = 2; n < i; n++) {
            if (i % n == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner input;

        input = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int top = input.nextInt();

        System.out.printf("The following are the prime numbers from 1 to %d%n", top);
        for (int i = 2; i <= top; i++) {
            if (IsItPrime.isPrime(i)) {
                System.out.printf("%d, ", i);
            }
        }

        input.close();
    }
}