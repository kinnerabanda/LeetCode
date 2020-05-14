/**
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 *
 * Example 2:
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's
 * strstr() and Java's indexOf().
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int i = 0;
        while (i <= haystack.length() - needle.length()) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == (needle.charAt(j))) {
                j = j + 1;
            }
            if (j == needle.length()) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
/**
 * Notes:
 * correct solution but this is brute force. Can use KMP and Boyer-Moore to do this as well to make it faster.
 */
