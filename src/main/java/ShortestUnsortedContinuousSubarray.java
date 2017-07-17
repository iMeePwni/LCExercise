/**
 * Created by guofeng on 2017/7/17.
 */
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (nums[i] < nums[i - 1]) { // 确保是无序数组
                min = Math.min(min, nums[i]);
            }
        }
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                max = Math.max(max, nums[i]);
            }
        }
        int l, r;
        for (l = 0; l < length; l++) {
            if (min < nums[l])
                break;
        }
        for (r = length - 1; r >= 0; r--) {
            if (max > nums[r])
                break;
        }
        return r - l < 0 ? 0 : r - l + 1;
    }
}
