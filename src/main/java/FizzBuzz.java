import java.util.*;

/**
 * Created by guofeng on 2017/8/10.
 */
public class FizzBuzz {
    public List<String> solution(int n) {
        if (n < 1) return null;

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(handle(i));
        }
        return list;
    }

    private String handle(int i) {
        StringBuilder sb = new StringBuilder();
        if (i % 3 == 0)
            sb.append("Fizz");
        if (i % 5 == 0)
            sb.append("Buzz");
        String s = sb.toString();
        if (s.length() == 0)
            s = Integer.toString(i);
        return s;
    }
}
