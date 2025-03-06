package Sample1;

import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any integer: ");
        int integer = s.nextInt();
        s.nextLine();

        System.out.print("The value of " + integer + " in a fibonacci sequence is: " + fib(integer));

    }

    public static int fib(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return fibMethod(n, memo);
    }

    public static int fibMethod(int n, HashMap<Integer, Integer> memo) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (!memo.containsKey(n)) {
            memo.put(n, (fibMethod(n - 1, memo) + fibMethod(n - 2, memo)));
        }

        return memo.get(n);
    }
}
