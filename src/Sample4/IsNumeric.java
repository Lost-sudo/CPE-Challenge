package Sample4;

import java.util.Scanner;

public class IsNumeric {
    public static boolean isValidNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = s.nextLine();

        if (isValidNumber(input)) {
            System.out.print("Valid decimal number");
        } else {
            System.out.print("Invalid decimal number");
        }
    }
}
