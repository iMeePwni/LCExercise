import org.junit.*;

/**
 * Created by guofeng on 2017/7/17.
 */
public class ValidParenthesesTest {
    @Test
    public void isValid() throws Exception {
        String input = "()[]{}";
        boolean output = new ValidParentheses().isValid(input);
        Assert.assertTrue(output);
    }

}