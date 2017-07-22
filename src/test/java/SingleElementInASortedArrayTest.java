import org.junit.*;

/**
 * Created by guofeng on 2017/7/22.
 */
public class SingleElementInASortedArrayTest {
    @Test
    public void singleNonDuplicate() throws Exception {
        int[] input = new int[]{3, 3, 7, 7, 10, 11, 11};
        int output = new SingleElementInASortedArray().singleNonDuplicate(input);
        int expected = 10;
        Assert.assertEquals(expected, output);
    }

}