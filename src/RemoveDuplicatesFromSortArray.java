/**
 * Example 1:
 * Given nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 *
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 * It doesn't matter what values are set beyond the returned length.
 */

public class RemoveDuplicatesFromSortArray {
    public int removeDuplicates(int[] nums) {
        //int counter = 0;
        int j = 0;
        for (int i = 1; i < nums.length; ++i) {
            // for (int j = i + 1; j < nums.length; ++j) {
            //     if (nums[i] != nums[j]) {
            //         i = j - 1;
            //     }
            // }
            if (nums[i] != nums[j]) {
                ++j;
                nums[j] = nums[i];
            }
            //counter++;
        }
        return j + 1;
    }
}
/**
 * mistakes made:
 * did not remove duplicates, but did count the number of non-duplicate members.
 * this uncommented solution above, does not remove the duplicates but only replaces the ones in the first few places.
 */
