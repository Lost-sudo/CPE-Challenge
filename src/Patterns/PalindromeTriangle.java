package Patterns;

public class PalindromeTriangle {
    public static void printPattern(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }
}
