/**
 * Created by guofeng on 2017/7/22.
 */
public class SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {
        int length = nums.length;
        boolean isLast = true;
        if (length == 1) return nums[0];
        if (length == 3) {
            return nums[0] ^ nums[1] ^ nums[2];
        }
        int r = nums[0];
        for (int i = 0; i < length - 2; i += 2) {
            if (nums[i] != nums[i + 1]) {
                r = nums[i];
                isLast = false;
                break;
            }
        }
        if (isLast) {
            r = nums[length - 1];
        }
        return r;
    }
}
