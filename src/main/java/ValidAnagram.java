/**
 * Created by guofeng on 2017/8/10.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] nums = new int[26];
        for (char temp : s.toCharArray()) {
            nums[temp - 'a']++;
        }
        for (char temp : t.toCharArray()) {
            nums[temp - 'a']--;
        }
        for (int v : nums) {
            if (v != 0)
                return false;
        }
        return true;
    }
}
