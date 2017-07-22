import org.junit.*;

/**
 * Created by guofeng on 2017/7/22.
 */
public class CountBitsTest {

    private int[] output;

    @Test
    public void solution() throws Exception {
        int input = 5;
        output = new CountBits().solution(input);
        int[] expected = new int[]{0, 1, 1, 2, 1, 2};
        Assert.assertArrayEquals(expected, output);
    }

}