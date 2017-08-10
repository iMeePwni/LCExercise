/**
 * Created by guofeng on 2017/8/10.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = length - 1; i >= 0; i--) {
            result += Math.pow(26.0, length - 1 - i) * getInt(chars[i]);
        }
        System.out.println();
        return result;
    }

    private int getInt(char c) {
        return c - 64;
    }
}
