package Recursion;

/**
 * Prints numbers in descending order using recursion
 * @author Mohit Chaudhari
 */
public class PrintNumbers {
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int number) {

        // base condition
        if (number == 0)
            return;
        System.out.print(" " + number);

        // recursion call
        print(number - 1);
    }
}
