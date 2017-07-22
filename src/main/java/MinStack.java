import java.util.Stack;

/**
 * Created by guofeng on 2017/7/17.
 */
public class MinStack {

    private Stack<Element> stack;

    public MinStack() {
        stack = new Stack();
    }

    public void push(int x) {
        int min = (stack.empty()) ? x : Math.min(stack.peek().min, x);
        stack.push(new Element(x, min));
    }

    public void pop() {
        stack.pop();

    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().min;
    }

    static class Element {
        int value;
        int min;

        public Element(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }
}
