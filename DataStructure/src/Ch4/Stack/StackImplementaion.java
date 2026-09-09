package Ch4.Stack;

public class StackImplementaion {

    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack();
        for (char ch : exp.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {

        String exp1 = "(5+3)/(6+9)";
        String exp2 = "(5+3))/(6+9)";
        String exp3 = "((5+3)/(6+9)";
        boolean x = isBalanced(exp1);
        System.out.println("Exp1 :" + x);
        //System.out.println("Exp1 :"+ isBalance(exp1));
        //System.out.println("Exp1 :" + exp2.isBalanced());
        // System.out.println("Exp1 :" + exp3.isBalanced());

    }
}
