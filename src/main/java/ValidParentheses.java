import java.util.*;

/**
 * Created by guofeng on 2017/7/17.
 */
public class ValidParentheses {
    List<Integer> list = new ArrayList();
    int position = -1;

    public boolean isValid(String s) {
        if (s == null) return false;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            switch (s.charAt(i)) {
                case '(':
                    add(1);
                    break;
                case ')':
                    if (position == -1) return false;
                    if (list.get(position) == 1) {
                        remove();
                    } else {
                        return false;
                    }
                    break;
                case '[':
                    add(2);
                    break;
                case ']':
                    if (position == -1) return false;
                    if (list.get(position) == 2) {
                        remove();
                    } else {
                        return false;
                    }
                    break;
                case '{':
                    add(3);
                    break;
                case '}':
                    if (position == -1) return false;
                    if (list.get(position) == 3) {
                        remove();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return position == -1;
    }

    private void remove() {
        list.remove(position);
        position--;
    }

    private int add(int i) {
        list.add(i);
        position++;
        return position;
    }
}
