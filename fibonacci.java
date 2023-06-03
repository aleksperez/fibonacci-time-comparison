/*
 * This program compares both iterative and recursive fibonacci sequence methods by measuring the runtime in nanoseconds of finding the next number for numbers 1-8.
 * 
 * @author Alexandra Perez
 */

public class fibonacci {
    
    /*
     * Uses iterative fibonacci sequence to find next number when given int n.
     * @param n
     * @returns int
     */
    public static int fib_I(int n) {
        int ptp = 0;
        int p = 1;
        int sum = 0;
        
        if (n == 0) {
            return 0;
        }
    
        else if (n == 1) {
            return 1;
        }
        //This loop will iterate n times, and for each iteration will go through the fibonacci sequence.
        //ptp = previous to previous number
        //p = previous number
        else {
            for (int i = 2; i <= n; i++) {
                sum = ptp + p;
                ptp = p;
                p = sum;
            }
        }
        return sum;
    }
    
    /*
     * Uses recursive fibonacci sequence to find next number when given int n.
     * @param n
     * @returns int
     */
    public static int fib_R(int n)
    {
        if (n <= 1)
            return n;
        return fib_R(n - 1) + fib_R(n - 2);
    }

    public static void main(String[] args) {

        System.out.println("---------Iterative------------");
        //loops through numbers 0-8 as n
        //uses fib_I (iterative fibonacci method)
        //using .nanoTime() to measure ns for each runtime of n
        for(int n = 0;n < 8; n++) {
            long startTime = System.nanoTime();
            System.out.println(fib_I(n) + " used " + (System.nanoTime() - startTime) + " ns");
        }

        System.out.println("\n----------Recursive-----------");
        //loops through numbers 0-8 as n
        //uses fib_R (recursive fibonacci method)
        //using .nanoTime() to measure ns for each runtime of n
        for(int n = 0;n < 8; n++) {
            long startTime = System.nanoTime();
            System.out.println(fib_R(n) + " used " + (System.nanoTime() - startTime) + " ns");
        }
    }
}
