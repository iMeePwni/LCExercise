import java.util.*;

/**
 * Created by guofeng on 2017/7/17.
 */
public class TwoSum {

    public int[] solution(int[] ints, int target) {
        int[] output = new int[2];
        int length = ints.length;
        Map<Integer, Integer> temp = new HashMap();
        for (int i = 0; i < length; i++) {
            int key = target - ints[i];
            if (temp.containsKey(key)) {
                output[0] = temp.get(key);
                output[1] = i;
                break;
            } else {
                temp.put(ints[i], i);
            }
        }
        return output;
    }
}
