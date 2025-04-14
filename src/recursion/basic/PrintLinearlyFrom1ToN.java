package recursion.basic;

/**
 * @author Mohit Chaudhari
 * <a href="https://www.linkedin.com/in/mohit-chaudhari-1018/">Linkedin - Mohit Chaudhari</a>
 * Created date: 15/04/25
 */
public class PrintLinearlyFrom1ToN {

    private static void print(int target, int curr) {
        if(curr > target) return;

        System.out.println(curr);
        print(target, curr+1);
    }

    public static void main(String[] args) {
        print(10, 1);
    }
}
