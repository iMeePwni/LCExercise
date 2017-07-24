/**
 * Created by guofeng on 2017/7/24.
 */
public class FriendCircles {
    // TODO Wrong method
    public int findCircleNum(int[][] M) {
        int length = M.length;
        int count = 1;
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = 0; j < length; j++) {
                sum += M[i][j];
                if (sum > 1) break;
            }
            if (sum == 1)
                count++;
        }
        if (count > length)
            count--;
        return count;
    }
}
