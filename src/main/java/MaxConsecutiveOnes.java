/**
 * Created by guofeng on 2017/7/28.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (nums[i] == 1) {
                nums[i] += nums[i - 1];
                max = Math.max(max, nums[i]);
            }
        }
        return max;
    }
}
