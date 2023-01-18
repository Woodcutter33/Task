import java.util.Stack;

public class Main {

    public static int countBracket(String s) {
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

        return count;
    }

    public static void main(String[] args) {
        String s = ")";
        if (!s.contains("(") || !s.contains(")") || s.isEmpty()) {
            System.out.println("Условия не выполнены");
        } else {
            int rez = countBracket(s);
            String bracket = "()".repeat(rez);
            System.out.print(rez + " - " + bracket);
        }
    }
}
