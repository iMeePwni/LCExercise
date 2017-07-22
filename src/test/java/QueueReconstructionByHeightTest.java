import org.junit.*;

/**
 * Created by guofeng on 2017/7/22.
 */
public class QueueReconstructionByHeightTest {

    private int[][] output;
    private int[] ints;

    @Test
    public void reconstructQueue() throws Exception {
        int[][] input = new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        output = new QueueReconstructionByHeight().reconstructQueue(input);
        int[][] expected = new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
        Assert.assertArrayEquals(expected, output);
    }

}