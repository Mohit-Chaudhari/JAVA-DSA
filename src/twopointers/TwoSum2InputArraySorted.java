package twopointers;

/**
 * @author Mohit Chaudhari
 * <a href="https://www.linkedin.com/in/mohit-chaudhari-1018/">Linkedin - Mohit Chaudhari</a>
 * @see <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted">Two Sum 2 - Input array sorted</a>
 * Created date: 11/04/24
 */
public class TwoSum2InputArraySorted {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int leftNum = numbers[left];
            int rightNum = numbers[right];

            if (leftNum + rightNum < target) left++;
            else if (leftNum + rightNum > target) right--;
            else if (leftNum + rightNum == target) break;
        }

        return new int[] {left + 1, right + 1};
    }
}
