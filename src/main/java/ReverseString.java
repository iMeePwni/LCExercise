/**
 * Created by guofeng on 2017/8/10.
 */
public class ReverseString {
    public String solution(String s) {
        if (s == null) return s;
        char[] chars = s.toCharArray();
        int length = chars.length;
        int halfLength = length / 2;
        for (int i = 0; i < halfLength; i++) {
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }
        return new String(chars);
    }
}
