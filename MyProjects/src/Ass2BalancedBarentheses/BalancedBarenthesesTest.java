/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 *   --->>> GO A HERO !!!
 * رابط الشرح يوتيوبhttps://youtu.be/cKamhdith5M?si=q9faiVUQhiAhifYU
 */
package Ass2BalancedBarentheses2023200766;

public class BalancedBarenthesesTest {

    public static boolean isBalanced(String expretion) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expretion.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char cloce = stack.pop();
                if (!isMatchingPair(cloce, ch)) {
                    return false;
                }
            }

        }

        return stack.isEmpty();

    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String exp[] = new String[4];
        exp[0] = "(2+3)*{4-1}";
        exp[1] = "((5+2)*3";
        exp[2] = "({[]})";
        exp[3] = "({[}])";
        for (String expretion : exp) {
            if (isBalanced(expretion)) {
                System.out.println("Expretion " + expretion + " : Balanced ");
            } else {
                System.out.println("Expretion " + expretion + " : Not Balanced ");

            }
        }
        System.out.println("\n***************************************\n");

        System.out.println("Balanced of Exp1 :" + isBalanced(exp[0]));
        System.out.println("Balanced of Exp2 :" + isBalanced(exp[1]));
        System.out.println("Balanced of Exp3 :" + isBalanced(exp[2]));
        System.out.println("Balanced of Exp3 :" + isBalanced(exp[3]));
        System.out.println("\n Thx ^_^\n Good Job !!!");

    }
}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
