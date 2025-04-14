package recursion.basic;

/**
 * @author Mohit Chaudhari
 * <a href="https://www.linkedin.com/in/mohit-chaudhari-1018/">Linkedin - Mohit Chaudhari</a>
 * Created date: 15/04/25
 */
public class PrintFromNto1 {

    private static void print(int target) {
        if(target == 0) return;

        System.out.println(target);
        print(target - 1);
    }

    public static void main(String[] args) {
        print(10);
    }
}
