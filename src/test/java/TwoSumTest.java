import org.junit.*;

/**
 * Created by guofeng on 2017/7/17.
 */
public class TwoSumTest {
    @Test
    public void solution() throws Exception {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] output = new TwoSum().solution(input, target);
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, output);
    }

}