public class EvenFib {

    public static final long LIMIT = 4000000;
    public static void main(String[] args) {
        long prevTerm = 1;
        long currTerm = 2;
        long newTerm = 0;
        
        // the sum values start at 2 since 2 is a term and even.
        long sum = 2;
        double dsum = 2;
        boolean loopFlag = true;
        while (loopFlag) {
            // calculate new term in the Fibonacci sequence.
            //System.out.println("prevTerm = " + prevTerm + ", currTerm = " + currTerm +", newTerm = " + currTerm);
            newTerm = prevTerm + currTerm;
            if (newTerm < LIMIT) {
                // is it even?
                if (newTerm % 2 == 0) {
                    // update the sum.
                    sum = sum + newTerm;
                    dsum = dsum + newTerm;
                }
                
                // the current term becomes previous and new becomes current.
                prevTerm = currTerm;
                currTerm = newTerm;
            } else {
                // stop iterating.
                loopFlag = false;
            }
        }

        // display answer.
        System.out.printf("sum of even Fibonacci terms that are less than %d is %d%n", LIMIT, sum);
        System.out.printf("double sum = %f%n", dsum);        
    }
}