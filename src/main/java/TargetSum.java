import java.util.*;

/**
 * Created by guofeng on 2017/7/28.
 * https://leetcode.com/problems/target-sum/tabs/description
 */
public class TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        List<Integer> result = result(nums);
        int count = 0;
        int size = result.size();
        for (int i = 0; i < size; i++) {
            if (result.get(i) == S)
                count++;
        }
        return count;
    }

    private List<Integer> result(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int length = nums.length;
        if (length == 1) { // 基准条件
            list.add(nums[0]);
            list.add(-nums[0]);
        } else { // 递归条件
            int[] pre = Arrays.copyOf(nums, length - 1);
            List<Integer> preResults = result(pre);
            int size = preResults.size();
            for (int i = 0; i < size; i++) {
                Integer preResult = preResults.get(i);
                list.add(preResult + nums[length - 1]);
                list.add(preResult - nums[length - 1]);
            }
        }
        return list;
    }
}
