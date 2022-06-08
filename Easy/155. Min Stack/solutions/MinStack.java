import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> min;

    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.empty()) {
            min.push(x);
        } else {
            min.push(Math.min(x, min.peek()));
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }

//    SLOW SOLUTION BY ARRAY, don't pay attention

//    private int[] stack;
//    private int headIndex;
//
//    public MinStack() {
//        this.stack = new int[8];
//        this.headIndex = -1;
//    }
//
//    public void push(int val) {
//        if (headIndex + 1 > stack.length - 1) {
//            int[] stackTemp = new int[stack.length * 2];
//            System.arraycopy(stack, 0, stackTemp, 0, stack.length);
//            this.stack = stackTemp;
//        }
//
//        ++headIndex;
//        stack[headIndex] = val;
//    }
//
//    public void pop() {
//        int[] stackTemp = new int[stack.length - 1];
//        --headIndex;
//        if (headIndex >= 0) {
//            for (int i = 0; i < headIndex + 1; i++) {
//                if (i < headIndex) {
//                    stackTemp[i] = stack[i];
//                }
//                if (i == headIndex) {
//                    ++i;
//                }
//                if (i > headIndex) {
//                    stackTemp[i - 1] = stack[i - 1];
//                }
//            }
//
//            this.stack = stackTemp;
//        }
//    }
//
//    public int top() {
//        return stack[headIndex];
//    }
//
//    public int getMin() {
//        int min = stack[0];
//        for (int i = 0; i < headIndex + 1; i++) {
//            if (stack[i] < min) {
//                min = stack[i];
//            }
//        }
//        return min;
//    }
}