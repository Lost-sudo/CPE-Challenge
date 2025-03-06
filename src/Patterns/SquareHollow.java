package Patterns;

public class SquareHollow {
    public static void printPattern(int n) {
        int i, j;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }
}
