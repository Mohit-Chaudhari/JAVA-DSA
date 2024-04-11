package twopointers;

/**
 * @author Mohit Chaudhari
 * <a href="https://www.linkedin.com/in/mohit-chaudhari-1018/">Linkedin - Mohit Chaudhari</a>
 * @see <a href="https://leetcode.com/problems/valid-palindrome/description/">Valid Palindrome</a>
 * Created date: 11/04/24
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) start++;
            else if (!Character.isLetterOrDigit(s.charAt(end))) end--;
            else {
                if (
                        Character.toLowerCase(s.charAt(start)) !=
                                Character.toLowerCase(s.charAt(end))
                ) return false;
                start++;
                end--;
            }
        }
        return true;
    }
}
