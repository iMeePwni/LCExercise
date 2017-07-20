import java.util.*;

/**
 * Created by guofeng on 2017/7/17.
 */
public class MinStack {
    private List<Integer> list;
    private Map<Integer, Integer> map;
    private int position;
    private int min = Integer.MIN_VALUE;

    public MinStack() {
        list = new ArrayList();
        map = new HashMap();
        position = -1;
        map.put(position, min);
    }

    public void push(int x) {
        position++;
        list.add(x);
        map.put(position, Math.min(x, map.get(position--)));
    }

    public void pop() {
        if (position < 0) return;
        list.remove(position);
        map.remove(position);
        position--;
    }

    public int top() {
        if (position < 0)
            return 0;
        return list.get(position);
    }

    public int getMin() {
        return map.get(position);
    }
}
