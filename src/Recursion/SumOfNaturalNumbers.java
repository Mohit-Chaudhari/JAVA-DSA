package Recursion;

/**
 * Prints the sum of first N natural numbers
 * @author Mohit Chaudhari
 */
public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        sum(0, 10, 0);
    }

    public static void sum(int i, int n, int sum) {

        // Base condition
        if (i == n) {
            sum += i;
            System.out.println("Sum of first " + n + " natural numbers is " + sum);
            return;
        }
        sum += i;

        // recursion call
        sum(i + 1, n, sum);
    }
}
