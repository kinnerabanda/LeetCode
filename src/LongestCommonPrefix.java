/**
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * Thought process:
 * if length of all strings are not same, cannot use normal loop.
 * Instead of checking incrementally, check decrementally. Start from big and then reduce size by one.
 *
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs.length == 0) {
            return "";
        }
        String longest = strs[0];
        for (int i = 1; i < strs.length; ++i) {
            while (strs[i].indexOf(longest) != 0) {
                longest = longest.substring(0, longest.length() - 1);
                if (longest.isEmpty()) {
                    return "";
                }
            }
        }
        return longest;
    }
}
