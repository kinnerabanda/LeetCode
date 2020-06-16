/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 * Note that the row index starts from 0.
 *
 * Example:
 * Input: 3
 * Output: [1,3,3,1]
 *
 * Follow up:
 * Could you optimize your algorithm to use only O(k) extra space?
 */

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

    public static class Solution1 {
        public List<Integer> getRow(int rowIndex) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            result.add(new ArrayList<>());
            result.get(0).add(1);
            if (rowIndex == 0) {
                return result.get(0);
            }

            for (int i = 1; i <= rowIndex; ++i) {
                List<Integer> row = new ArrayList<>();
                List<Integer> prevRow = result.get(i - 1);
                row.add(1);
                for (int j = 1; j < i; ++j) {
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
                row.add(1);
                if (i == rowIndex) {
                    return row;
                }
                result.add(row);
            }
            return result.get(result.size() - 1);
        }
    }

    //Optimize with O(k) space
    public static class Solution2 {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i <= rowIndex; ++i) {
                row.add(0, 1);
                for (int j = 1; j <= i - 1; ++j) {
                    row.set(j, row.get(j) + row.get(j + 1));
                }
            }
            return row;
        }
    }

}
