/**
 * Created by guofeng on 2017/8/10.
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqueChar(String s) {
        int[] nums = new int[26];
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length; i++)
            nums[chars[i] - 'a']++;
        for (int i = 0; i < length; i++) {
            if (nums[chars[i] - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
