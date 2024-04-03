package tp3;

/**
 * This class provides a method to verify if an arithmetic expression has balanced parentheses.
 */
public class ArithmeticExpression {
    public static final char OPEN_PARENTHESIS = '(';
    public static final char CLOSE_PARENTHESIS = ')';
    /**
     * Verifies if the given arithmetic expression has balanced parentheses.
     *
     * @return true if the expression is balanced, false otherwise
     * @param expression the arithmetic expression to verify
     * @throws IllegalArgumentException if the expression is not balanced
     */
    public static boolean verify(String expression) {
        int balance = 0;
        for (char c : expression.toCharArray()) {
            if (c == OPEN_PARENTHESIS) {
                balance++;
            } else if (c == CLOSE_PARENTHESIS) {
                balance--;
            }
            if (balance < 0) {
                throw new IllegalArgumentException("Invalid expression: closing parenthesis without matching opening parenthesis");
            }
        }
        if (balance != 0) {
            throw new IllegalArgumentException("Invalid expression: opening parenthesis without matching closing parenthesis");
        }
        return balance == 0;
    }

    public static void main(String[] args) {
        try {
            System.out.println("((1+2)*3) is correct: " + verify("((1+2)*3)"));
            System.out.println(")(1+2)*3) is correct: " + verify(")(1+2)*3)"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
