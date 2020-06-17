/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * For example:
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * Example 1:
 * Input: "A"
 * Output: 1
 *
 * Example 2:
 * Input: "AB"
 * Output: 28
 */
public class ExcelSheetColNum {
    public int titleToNumber(String s) {
        char[] c = s.toCharArray();
        int result = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            result += (c[i] - 64) * ((int) Math.pow(26, s.length() - i - 1));
        }
        return result;
    }
}
