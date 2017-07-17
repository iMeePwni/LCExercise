import org.junit.*;

/**
 * Created by guofeng on 2017/7/17.
 */
public class ShortestUnsortedContinuousSubarrayTest {

    @Test
    public void findUnsortedSubarray() throws Exception {
        int[] input = {2, 6, 4, 8, 10, 9, 15};
        int output = new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(input);
        int expected = 5;
        Assert.assertEquals(expected, output);
    }

}