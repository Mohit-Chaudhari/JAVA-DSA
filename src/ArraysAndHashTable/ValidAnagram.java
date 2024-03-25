package ArraysAndHashTable;

import java.util.HashMap;

/**
 * @author Mohit Chaudhari
 * <a href="https://www.linkedin.com/in/mohit-chaudhari-1018/">Linkedin - Mohit Chaudhari</a>
 * Created date: 23/03/24
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        String[] sc = s.split("");
        String[] tc = t.split("");

        HashMap<String, Integer> shm = new HashMap<>();
        HashMap<String, Integer> thm = new HashMap<>();

        for(String c: sc) {
            if(shm.containsKey(c)) {
                shm.put(c, shm.get(c) + 1);
            } else {
                shm.put(c, 1);
            }
        }

        for(String c: tc) {
            if(thm.containsKey(c)) {
                thm.put(c, thm.get(c) + 1);
            } else {
                thm.put(c, 1);
            }
        }

        return shm.equals(thm);
    }
}

/**
 * Problem: https://leetcode.com/problems/valid-anagram/description/
 *
 * Note: create a hashmap and store the count of each character available in the string, then compare the hash map,
 * if equal then return true else return false.
 *
 * Topics: Hashtable, Array, String
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 *
 *
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */
