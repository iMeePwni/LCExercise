/**
 * Created by guofeng on 2017/7/22.
 * <p>
 * https://leetcode.com/problems/counting-bits/#/description
 */
public class CountBits {

    public int[] solution(int num) {
        int[] f = new int[num + 1];
        for (int i = 1; i <= num; i++) f[i] = f[i >> 1] + (i & 1);
        return f;
    }
}
