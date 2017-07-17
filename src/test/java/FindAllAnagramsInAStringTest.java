import org.junit.*;

import java.util.*;

/**
 * Created by guofeng on 2017/7/17.
 */
public class FindAllAnagramsInAStringTest {
    private List<Integer> output;

    @Test
    public void solution() throws Exception {
        String s = "abab";
        String p = "ab";
        output = new FindAllAnagramsInAString().solution(s, p);
        List<Integer> expected = new ArrayList();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        Assert.assertEquals(expected, output);
    }
}