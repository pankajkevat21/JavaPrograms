import java.util.Arrays;
class Main {

    public static int longestValidParentheses(String s) {
        char stack[] = new char[s.length()];
        int count = 0;
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {

                stack[++top] = s.charAt(i);
            }
            if (s.charAt(i) == ')') {
                if (top >= 0 && stack[top] == '(') {
                    count += 2;
                    top--;
                } else {
                    stack[++top] = s.charAt(i);

                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        String check ="()(()";


        System.out.println(longestValidParentheses(check));

    }
}