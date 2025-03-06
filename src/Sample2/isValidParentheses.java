package Sample2;

import java.util.Scanner;
import java.util.Stack;

public class isValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (ch == ')' && top != '(' || ch == '}' && top != '{' || ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = s.nextLine();

        if (isValid(str)) {
            System.out.print("Valid");
        } else {
            System.out.print("Invalid");
        }
    }
}
