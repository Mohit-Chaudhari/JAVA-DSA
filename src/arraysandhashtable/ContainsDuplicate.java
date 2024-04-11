package arraysandhashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mohit Chaudhari
 * <a href="https://www.linkedin.com/in/mohit-chaudhari-1018/">Linkedin - Mohit Chaudhari</a>
 * Created date: 23/03/24
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> data = new HashSet<>();
        for(int n: nums) {
            if (data.contains(n)) return true;
            data.add(n);
        }
        return false;
    }
}

/*
    Topics covered: Array, Hash Table, Sorting
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

    Example 1:

    Input: nums = [1,2,3,1]
    Output: true
    Example 2:

    Input: nums = [1,2,3,4]
    Output: false
    Example 3:

    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true


    Constraints:

    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
 */
