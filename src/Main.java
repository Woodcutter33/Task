import java.util.Stack;

public class Main {

    public static void countBracket(String s) {
        if (!s.contains("(") || !s.contains(")") || s.isEmpty()) {
            System.out.println("Условия не выполнены");
        } else {
            int count = 0;
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                } else {
                    stack.pop();
                    if (stack.empty()) {
                        stack.push(i);
                    } else {
                        count = Math.max(count, i - stack.peek());
                    }
                }
            }
            System.out.print(count + " - " + "()".repeat(count / 2));
        }
    }

    public static void main(String[] args) {
        String s = ")()()";
        countBracket(s);
    }
}

