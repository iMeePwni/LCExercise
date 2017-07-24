/**
 * Created by guofeng on 2017/7/24.
 * https://leetcode.com/problems/array-nesting/#/description
 */
public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int longest = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != Integer.MAX_VALUE) {
                int start = nums[i], count = 0;
                while (nums[start] != Integer.MAX_VALUE) {
                    count++;
                    int temp = start;
                    start = nums[start];
                    nums[temp] = Integer.MAX_VALUE;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
