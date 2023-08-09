/*
 *  This sample program solves the following problem from the projecteuler.net website,
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 
 * 3, 5, 6, and 9.  The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class App {
    static final int LIMIT = 1000;
    public static void main(String[] args) throws Exception {
        int sum = 0;
        for (int i = 3; i < LIMIT; i++) {
            // is the current number divisible by 3 or 5?
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }

        System.out.printf("The sum of all of multiples of 3 or 5 that are smaller than %d is equal to %d.",
                        LIMIT, sum);
    }
}
