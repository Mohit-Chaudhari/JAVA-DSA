package recursion.basic;

/**
 * @author Mohit Chaudhari
 * <a href="https://www.linkedin.com/in/mohit-chaudhari-1018/">Linkedin - Mohit Chaudhari</a>
 * Created date: 15/04/25
 */
public class PrintSumOfFirstNNumbers {

    private static int sum(int no) {
        if(no == 0) return 0;
        return no + sum(no - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
