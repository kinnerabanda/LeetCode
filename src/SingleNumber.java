/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: [4,1,2,1,2]
 * Output: 4
 */

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i: nums) {
            if (!list.contains(i)) {
                list.add(i);
            } else {
                list.remove(new Integer(i));
            }
        }
        return list.get(0);
    }
}
