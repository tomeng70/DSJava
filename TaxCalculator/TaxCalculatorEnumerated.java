import java.util.Scanner;

/**
 * This program computes income taxes, using a simplified tax schedule.
 */

public class TaxCalculatorEnumerated {
    public enum FilingStatus { SINGLE, MARRIED }

    public static void main(String[] args) {
        final double RATE1 = 0.10;
        final double RATE2 = 0.25;
        final double RATE1_SINGLE_LIMIT = 32000;
        final double RATE1_MARRIED_LIMIT = 64000;

        double tax1 = 0;
        double tax2 = 0;

        // Read income and marital status
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = in.nextDouble();

        // create variable of FilingStatus type.
        // set default value to be SINGLE.
        FilingStatus maritalStatus = FilingStatus.SINGLE;

        // prompt user for their marital status.
        System.out.print("Please enter s for single, m for married: ");
        String reply = in.next();
        if (reply.equals("m")) {
            maritalStatus = FilingStatus.MARRIED;
        }
        
        // Compute taxes due.
        if (maritalStatus == FilingStatus.SINGLE) {
            if (income <= RATE1_SINGLE_LIMIT) {
                tax1 = RATE1 * income;
            } else {
                tax1 = RATE1 * RATE1_SINGLE_LIMIT;
                tax2 = RATE2 * (income - RATE1_SINGLE_LIMIT);
            }
        } else {
            if (income <= RATE1_MARRIED_LIMIT) {
                tax1 = RATE1 * income;
            } else {
                tax1 = RATE1 * RATE1_MARRIED_LIMIT;
                tax2 = RATE2 * (income - RATE1_MARRIED_LIMIT);
            }
        }

        double totalTax = tax1 + tax2;
        System.out.println("The tax is $" + totalTax);
    }
}