package arraysandhashtable;

/**
 * @author Mohit Chaudhari
 * <a href="https://www.linkedin.com/in/mohit-chaudhari-1018/">Linkedin - Mohit Chaudhari</a>
 * Created date: 28/03/24
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        Integer n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] arr = new int[n];
        int p = 1;
        int s = 1;

        for(int i = 0; i < n; i++) {
            p = p * nums[i];
            prefix[i] = p;
            System.out.print(" P:" + prefix[i]);

            s = s * nums[n - 1 - i];
            suffix[n - 1 - i] = s;
            System.out.print(" S:" + suffix[n - i - 1]);
        }

        for(int i = 0; i < n; i++) {
            if (i == 0) arr[i] = suffix[i + 1];
            else if(i == n - 1) arr[i] = prefix[i -1];
            else arr[i] = prefix[i - 1] * suffix[i + 1];
        }

        return arr;
    }
}

/**
 * Problem: https://leetcode.com/problems/product-of-array-except-self/
 * Topics covered: Array, Prefix Sum
 *
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 *
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 *
 * Follow up: Can you solve the problem in O(1) extra space complexity?
 * (The output array does not count as extra space for space complexity analysis.)
 */
