package recursion.basic;

/**
 * @author Mohit Chaudhari
 * <a href="https://www.linkedin.com/in/mohit-chaudhari-1018/">Linkedin - Mohit Chaudhari</a>
 * Created date: 15/04/25
 */
public class PrintNameNTimes {

    public static void main(String[] args) {
        function(10, 1);
    }

    public static void function(int target, int itr) {
        if(itr == target) return;

        System.out.println("Mohit");
        itr++;
        function(target, itr);
    }
}
